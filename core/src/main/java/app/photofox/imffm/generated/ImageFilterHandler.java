// Generated by jextract

package app.photofox.imffm.generated;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef size_t (ImageFilterHandler)(Image **, const int, const char **, ExceptionInfo *)
 * }
 */
public class ImageFilterHandler {

    ImageFilterHandler() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        MagickWand_h.C_LONG,
        MagickWand_h.C_POINTER,
        MagickWand_h.C_INT,
        MagickWand_h.C_POINTER,
        MagickWand_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = MagickWand_h.upcallHandle(ImageFilterHandler.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(ImageFilterHandler.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static long invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

