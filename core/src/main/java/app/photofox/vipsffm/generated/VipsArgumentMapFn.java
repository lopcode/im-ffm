// Generated by jextract

package app.photofox.vipsffm.generated;

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
 * typedef void *(*VipsArgumentMapFn)(VipsObject *, GParamSpec *, VipsArgumentClass *, VipsArgumentInstance *, void *, void *)
 * }
 */
public class VipsArgumentMapFn {

    VipsArgumentMapFn() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        MemorySegment apply(MemorySegment object, MemorySegment pspec, MemorySegment argument_class, MemorySegment argument_instance, MemorySegment a, MemorySegment b);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        vips_h.C_POINTER,
        vips_h.C_POINTER,
        vips_h.C_POINTER,
        vips_h.C_POINTER,
        vips_h.C_POINTER,
        vips_h.C_POINTER,
        vips_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = vips_h.upcallHandle(VipsArgumentMapFn.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(VipsArgumentMapFn.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment object, MemorySegment pspec, MemorySegment argument_class, MemorySegment argument_instance, MemorySegment a, MemorySegment b) {
        try {
            return (MemorySegment) DOWN$MH.invokeExact(funcPtr, object, pspec, argument_class, argument_instance, a, b);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

