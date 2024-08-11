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
 * struct _VipsImageClass {
 *     VipsObjectClass parent_class;
 *     void (*preeval)(VipsImage *, VipsProgress *, void *);
 *     void (*eval)(VipsImage *, VipsProgress *, void *);
 *     void (*posteval)(VipsImage *, VipsProgress *, void *);
 *     void (*written)(VipsImage *, int *, void *);
 *     void (*invalidate)(VipsImage *, void *);
 *     void (*minimise)(VipsImage *, void *);
 * }
 * }
 */
public class _VipsImageClass {

    _VipsImageClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _VipsObjectClass.layout().withName("parent_class"),
        vips_h.C_POINTER.withName("preeval"),
        vips_h.C_POINTER.withName("eval"),
        vips_h.C_POINTER.withName("posteval"),
        vips_h.C_POINTER.withName("written"),
        vips_h.C_POINTER.withName("invalidate"),
        vips_h.C_POINTER.withName("minimise")
    ).withName("_VipsImageClass");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_class$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VipsObjectClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VipsObjectClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VipsObjectClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VipsObjectClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * void (*preeval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static class preeval {

        preeval() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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

        private static final MethodHandle UP$MH = vips_h.upcallHandle(preeval.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(preeval.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout preeval$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("preeval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*preeval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static final AddressLayout preeval$layout() {
        return preeval$LAYOUT;
    }

    private static final long preeval$OFFSET = 328;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*preeval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static final long preeval$offset() {
        return preeval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*preeval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static MemorySegment preeval(MemorySegment struct) {
        return struct.get(preeval$LAYOUT, preeval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*preeval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static void preeval(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(preeval$LAYOUT, preeval$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*eval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static class eval {

        eval() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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

        private static final MethodHandle UP$MH = vips_h.upcallHandle(eval.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(eval.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout eval$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("eval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*eval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static final AddressLayout eval$layout() {
        return eval$LAYOUT;
    }

    private static final long eval$OFFSET = 336;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*eval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static final long eval$offset() {
        return eval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*eval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static MemorySegment eval(MemorySegment struct) {
        return struct.get(eval$LAYOUT, eval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*eval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static void eval(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(eval$LAYOUT, eval$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*posteval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static class posteval {

        posteval() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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

        private static final MethodHandle UP$MH = vips_h.upcallHandle(posteval.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(posteval.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout posteval$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("posteval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*posteval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static final AddressLayout posteval$layout() {
        return posteval$LAYOUT;
    }

    private static final long posteval$OFFSET = 344;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*posteval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static final long posteval$offset() {
        return posteval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*posteval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static MemorySegment posteval(MemorySegment struct) {
        return struct.get(posteval$LAYOUT, posteval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*posteval)(VipsImage *, VipsProgress *, void *)
     * }
     */
    public static void posteval(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(posteval$LAYOUT, posteval$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*written)(VipsImage *, int *, void *)
     * }
     */
    public static class written {

        written() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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

        private static final MethodHandle UP$MH = vips_h.upcallHandle(written.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(written.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout written$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("written"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*written)(VipsImage *, int *, void *)
     * }
     */
    public static final AddressLayout written$layout() {
        return written$LAYOUT;
    }

    private static final long written$OFFSET = 352;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*written)(VipsImage *, int *, void *)
     * }
     */
    public static final long written$offset() {
        return written$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*written)(VipsImage *, int *, void *)
     * }
     */
    public static MemorySegment written(MemorySegment struct) {
        return struct.get(written$LAYOUT, written$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*written)(VipsImage *, int *, void *)
     * }
     */
    public static void written(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(written$LAYOUT, written$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*invalidate)(VipsImage *, void *)
     * }
     */
    public static class invalidate {

        invalidate() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            vips_h.C_POINTER,
            vips_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = vips_h.upcallHandle(invalidate.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(invalidate.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout invalidate$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("invalidate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*invalidate)(VipsImage *, void *)
     * }
     */
    public static final AddressLayout invalidate$layout() {
        return invalidate$LAYOUT;
    }

    private static final long invalidate$OFFSET = 360;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*invalidate)(VipsImage *, void *)
     * }
     */
    public static final long invalidate$offset() {
        return invalidate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*invalidate)(VipsImage *, void *)
     * }
     */
    public static MemorySegment invalidate(MemorySegment struct) {
        return struct.get(invalidate$LAYOUT, invalidate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*invalidate)(VipsImage *, void *)
     * }
     */
    public static void invalidate(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(invalidate$LAYOUT, invalidate$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*minimise)(VipsImage *, void *)
     * }
     */
    public static class minimise {

        minimise() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            vips_h.C_POINTER,
            vips_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = vips_h.upcallHandle(minimise.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(minimise.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout minimise$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("minimise"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*minimise)(VipsImage *, void *)
     * }
     */
    public static final AddressLayout minimise$layout() {
        return minimise$LAYOUT;
    }

    private static final long minimise$OFFSET = 368;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*minimise)(VipsImage *, void *)
     * }
     */
    public static final long minimise$offset() {
        return minimise$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*minimise)(VipsImage *, void *)
     * }
     */
    public static MemorySegment minimise(MemorySegment struct) {
        return struct.get(minimise$LAYOUT, minimise$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*minimise)(VipsImage *, void *)
     * }
     */
    public static void minimise(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(minimise$LAYOUT, minimise$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

