package vipsffm

import app.photofox.vipsffm.VImage
import java.lang.foreign.Arena
import java.nio.file.Path
import kotlin.io.path.absolutePathString

object VOptionHyphenSample: RunnableSample {

    // https://github.com/lopcode/vips-ffm/issues/60
    // tests a vips operation with a hyphenated option name ("output-profile") in icc_transform
    override fun run(arena: Arena, workingDirectory: Path): Result<Unit> {
        val outputPath = workingDirectory.resolve("rabbit_chain.jpg")
        val image = VImage.newFromFile(
            arena,
            "sample/src/main/resources/sample_images/rabbit.jpg"
        )
            .thumbnailImage(400)
            .iccTransform("cmyk")

        image.writeToFile(outputPath.absolutePathString())

        return SampleHelper.validate(
            outputPath,
            expectedSizeBoundsKb = 750L..1500L
        )
    }
}