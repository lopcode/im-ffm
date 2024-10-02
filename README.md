# vips-ffm

[libvips](https://github.com/libvips/libvips) bindings for JVM projects, using the "Foreign Function & Memory API"
([JEP 454](https://openjdk.org/jeps/454)), and the "Class-File API" ([JEP 457](https://openjdk.org/jeps/457)) released in JDK 22. The combination
of libvips, FFM, and auto-generated helpers means these bindings are complete (supporting all libvips operations), safe,
and [faster](https://github.com/lopcode/vips-ffm/issues/59#issuecomment-2367634956) than AWT or JNI-based alternatives.

Supports a vast range of image formats, including HEIC, JXL, WebP, PNG, JPEG, and more. Pronounced "vips (like zips)
eff-eff-emm". The project is relatively new, but aims to be production ready. Tested on macOS 14, Windows 11, and Linux
(Ubuntu 24.04). Should work on any architecture you can use libvips and Java on (arm64/amd64/etc).

Used the library? I'd love to hear from more users - let me know in [Discussions](https://github.com/lopcode/vips-ffm/discussions).

Please also give [the repo](https://github.com/lopcode/vips-ffm) a star 🌟️!

## Usage

`vips-ffm` is available on Maven Central. To get set up with Gradle:

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("app.photofox.vips-ffm:vips-ffm-core:1.0.0")
}
```
When running your project you must add `--enable-native-access=ALL-UNNAMED` to your JVM runtime arguments. If you
don't, you'll get a warning about "Restricted methods". In the future, the JVM will throw an error if you don't
explicitly include this flag.

As the project uses the Java FFM API, it must target JDK 22+. Bindings are currently generated from libvips `8.15.3`,
however they use the underlying libvips operation API. Most operations **do not** use the C API directly (as described
in the [bindings docs](https://www.libvips.org/API/current/binding.html)) - they should be safe to use with different
libvips versions, assuming there haven't been major changes.

> [!NOTE]
> This library **does not** include `libvips` in the download, you must add it to the system/container you're building
> for, then make sure it's available in `DYLD_LIBRARY_PATH` (on macOS), `LD_LIBRARY_PATH` (on Linux), or `PATH` (on
> Windows).

All libvips operations are exposed via helper classes, like `VImage`. You must provide an [Arena][1] to operations like
`VImage.newFromFile`, which constrains the lifetime of objects generated during usage. You can get an appropriate arena
by using `Vips.run` as shown in the [sample](#thumbnail-sample) below. `VImage` and associated enums have extensive
Javadocs included, which are automatically generated from the same source that the libvips website uses, for ease of use.
These helper objects expose their raw pointers as a last resort via functions like `VTarget.getUnsafeStructAddress` - if
you need to use these raw pointers and can't find an alternative, please file a GitHub Issue.

Helper enums are generated for the version of libvips shown above. If you need to use an enum from another version,
which isn't present in `vips-ffm`, you can use `VipsOption.Enum(rawValue)` or `VEnum.Raw(rawValue)`.

> [!CAUTION]
> Bindings generated by `jextract` are available in `VipsRaw`, and wrapped with validation in `VipsHelper`. These
> functions are difficult to use without accidentally causing memory leaks, or even segfaults! If what you want to do is
> available in `VImage` and other `V`-prefixed classes, use those instead. If you notice something missing, please open
> a GitHub Issue.

### Thumbnail sample

To get a feeling for the bindings, here's an indicative sample written in Kotlin (using the Java bindings) that:
* Loads an original JPEG image from disk
* Writes a copy of it to disk
* Creates a 400px thumbnail from the original, and writes that to disk

```kotlin
import app.photofox.vipsffm.Vips
import app.photofox.vipsffm.VImage
import app.photofox.vipsffm.VipsOption
import app.photofox.vipsffm.enums.VipsAccess

// ...

// Call once to initialise libvips when your program starts, from any thread
Vips.init()

// Use `Vips.run` to wrap your usage of the API, and get an arena with an appropriate lifetime to use
// Usage of the API, arena, and resulting V-Objects must be done from the thread that called `Vips.run`
Vips.run { arena ->
    val sourceImage = VImage.newFromFile(
      arena,
      "sample/src/main/resources/sample_images/rabbit.jpg",
      VipsOption.Enum("access", VipsAccess.ACCESS_SEQUENTIAL)
    )
    val sourceWidth = sourceImage.width
    val sourceHeight = sourceImage.height
    logger.info("source image size: $sourceWidth x $sourceHeight")

    val outputPath = workingDirectory.resolve("rabbit_copy.jpg")
    sourceImage.writeToFile(outputPath.absolutePathString())

    val thumbnail = sourceImage.thumbnail(
      "sample/src/main/resources/sample_images/rabbit.jpg",
      400
    )
    val thumbnailWidth = thumbnail.width
    val thumbnailHeight = thumbnail.height
    logger.info("thumbnail image size: $thumbnailWidth x $thumbnailHeight")
}

// Optionally call at the end of your program, for memory leak detection, from any thread
Vips.shutdown()
```

## Samples

Samples are included that show various usages of these bindings. They include validations, and run on GitHub Actions as
"end-to-end tests" during development. You can find them all listed [here](https://github.com/lopcode/vips-ffm/tree/main/sample/src/main/kotlin/vipsffm/sample).

To get set up to run samples (on macOS):
* `brew install vips`
* `sdk use java 22-open`
* Then either:
  * Run `./run_samples.sh` in your terminal
  * Use the included `Run samples` profile in IntelliJ

```
[main] INFO vipsffm.SampleRunner - clearing sample run directory at path "sample_run"
[main] INFO vipsffm.SampleRunner - running sample "RawGetVersionSample"...
[main] INFO vipsffm.RawGetVersionSample - libvips version: "8.15.3"
[main] INFO vipsffm.SampleRunner - validation succeeded ✅
[main] INFO vipsffm.SampleRunner - running sample "HelperGetVersionSample"...
[main] INFO vipsffm.HelperGetVersionSample - libvips version: "8.15.3"
[main] INFO vipsffm.SampleRunner - validation succeeded ✅
[main] INFO vipsffm.SampleRunner - running sample "VImageCreateThumbnailSample"...
[main] INFO vipsffm.RawGetVersionSample - source image size: 2490 x 3084
[main] INFO vipsffm.RawGetVersionSample - thumbnail image size: 323 x 400
[main] INFO vipsffm.SampleRunner - validation succeeded ✅
[main] INFO vipsffm.SampleRunner - running sample "VImageChainSample"...
[main] INFO vipsffm.SampleRunner - validation succeeded ✅
[main] INFO vipsffm.SampleRunner - running sample "VSourceTargetSample"...
[main] INFO vipsffm.SampleRunner - validation succeeded ✅
[main] INFO vipsffm.SampleRunner - running sample "VImageCopyWriteSample"...
[main] INFO vipsffm.SampleRunner - validation succeeded ✅
[main] INFO vipsffm.SampleRunner - running sample "VOptionHyphenSample"...
[main] INFO vipsffm.SampleRunner - validation succeeded ✅
[main] INFO vipsffm.SampleRunner - running sample "VImageCachingSample"...
[main] INFO vipsffm.SampleRunner - validation succeeded ✅
[main] INFO vipsffm.SampleRunner - shutting down vips to check for memory leaks...
memory: high-water mark 128.35 MB
[main] INFO vipsffm.SampleRunner - all samples ran successfully 🎉
```

## Project goals

Ideas and suggestions are welcome, but please make sure they fit in to these goals, or you have a good argument about
why a goal should change!

* Avoid manual work by automating as much as possible. This means upstream changes can be rapidly integrated.
* Use the libvips operations API, as described in the [libvips documentation](https://www.libvips.org/API/current/binding.html)
* Provide access to the raw bindings (`VipsHelper`), so users aren't blocked by helper bugs or API annoyances.
* Incubate in [Photo Fox](https://github.com/lopcode/photo-fox) with some "real world" usage.

## Releasing

* GitHub Releases automatically result in a deployment to GitHub Packages
* Maven Central releases happen manually 
  * This can only be done by @lopcode
  * And only after a GitHub Release is made
  * Run `./publish_release_to_maven_central.sh <version matching github release version, including v prefix>` 

[1]: https://docs.oracle.com/en/java/javase/22/core/memory-segments-and-arenas.html