# vips-ffm

[libvips](https://github.com/libvips/libvips) bindings for JVM projects, using the "Foreign Function & Memory API"
([JEP 454](https://openjdk.org/jeps/454)), and the "Class-File API" ([JEP 457](https://openjdk.org/jeps/457)) released in JDK 22. The combination
of libvips, FFM, and auto-generated helpers means these bindings are complete (supporting all libvips operations), safe,
and [faster](https://github.com/lopcode/vips-ffm/issues/59#issuecomment-2367634956) than AWT or JNI-based alternatives.

Supports a vast range of image formats, including HEIC, JXL, WebP, PNG, JPEG, and more. Pronounced "vips (like zips)
eff-eff-emm". Tested on macOS 14, Windows 11, and Linux (Ubuntu 24.04).

Used the library, or just like what you've read so far? Please give the repo a star 🌟️!

## Usage

`vips-ffm` is available on Maven Central. To get set up with Gradle:

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("app.photofox.vips-ffm:vips-ffm-core:0.5.10")
}
```
When running your project you must add: `--enable-native-access=ALL-UNNAMED` to your JVM runtime arguments. If you
don't, you'll get a warning about "Restricted methods". In the future, the JVM will throw an error if you don't
explicitly include this flag.

As the project uses the Java FFM API, it must target JDK 22+. Bindings are currently generated from libvips `8.15.3`,
however they use the underlying libvips operation API. All operations **do not** use the C API directly (as described
in the [bindings docs](https://www.libvips.org/API/current/binding.html)) - they should be safe to use with different
libvips versions, assuming there haven't been major changes.

> [!NOTE]
> This library **does not** include `libvips` in the download, you must add it to the system/container you're building
> for, then make sure it's available in `DYLD_LIBRARY_PATH` (on macOS), `LD_LIBRARY_PATH` (on Linux), or `PATH` (on
> Windows).

All libvips operations are exposed via helper classes, like `VImage`. You must provide an [Arena][1] to operations like
`VImage.newFromFile`, and this constrains the lifetime of objects generated during usage. Be careful to only keep the 
arena, and image, in scope for as long as you need to! If the arena doesn't close, your memory usage will grow forever.
Constructing the `VImage` object is cheap, as it's just a wrapper, so make them as you need.

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

// Call once to initialise libvips when your program starts
Vips.init()

// Use `Vips.run` to wrap your usage of the API, and get an arena with an appropriate lifetime to use
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

// Optionally call at the end of your program, for memory leak detection
Vips.shutdown()
```

The project has several samples, [described below](#samples).

## Project goals

Ideas and suggestions are welcome, but please make sure they fit in to these goals, or you have a good argument about
why a goal should change!

* Avoid manual work by automating as much as possible. This means upstream changes can be rapidly integrated.
* Use the libvips operations API, as described in the [libvips documentation](https://www.libvips.org/API/current/binding.html)
* Provide access to the raw bindings (`VipsHelper`), so users aren't blocked by helper bugs or API annoyances.
* Incubate in [Photo Fox](https://github.com/lopcode/photo-fox) with some "real world" usage.

## Samples

Samples are included that show various usages of the `libvips` bindings. They include validations, and run on GitHub
Actions as "end-to-end tests" during development.

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

## Releasing

* GitHub Releases automatically result in a deployment to GitHub Packages
* Maven Central releases happen manually 
  * This can only be done by @lopcode
  * And only after a GitHub Release is made
  * Run `./publish_release_to_maven_central.sh <version matching github release version, including v prefix>` 

[1]: https://docs.oracle.com/en/java/javase/22/core/memory-segments-and-arenas.html