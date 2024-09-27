// Generated by jextract

package app.photofox.vipsffm.jextract;

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
 * struct _VipsTargetClass {
 *     VipsConnectionClass parent_class;
 *     gint64 (*write)(VipsTarget *, const void *, size_t);
 *     void (*finish)(VipsTarget *);
 *     gint64 (*read)(VipsTarget *, void *, size_t);
 *     gint64 (*seek)(VipsTarget *, gint64, int);
 *     int (*end)(VipsTarget *);
 * }
 * }
 */
public class _VipsTargetClass {

    _VipsTargetClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _VipsConnectionClass.layout().withName("parent_class"),
        VipsRaw.C_POINTER.withName("write"),
        VipsRaw.C_POINTER.withName("finish"),
        VipsRaw.C_POINTER.withName("read"),
        VipsRaw.C_POINTER.withName("seek"),
        VipsRaw.C_POINTER.withName("end")
    ).withName("_VipsTargetClass");

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
     * VipsConnectionClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VipsConnectionClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VipsConnectionClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VipsConnectionClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * gint64 (*write)(VipsTarget *, const void *, size_t)
     * }
     */
    public static class write {

        write() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            long apply(MemorySegment _x0, MemorySegment _x1, long _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            VipsRaw.C_LONG_LONG,
            VipsRaw.C_POINTER,
            VipsRaw.C_POINTER,
            VipsRaw.C_LONG
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(write.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(write.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static long invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, long _x2) {
            try {
                return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout write$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("write"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint64 (*write)(VipsTarget *, const void *, size_t)
     * }
     */
    public static final AddressLayout write$layout() {
        return write$LAYOUT;
    }

    private static final long write$OFFSET = 328;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint64 (*write)(VipsTarget *, const void *, size_t)
     * }
     */
    public static final long write$offset() {
        return write$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint64 (*write)(VipsTarget *, const void *, size_t)
     * }
     */
    public static MemorySegment write(MemorySegment struct) {
        return struct.get(write$LAYOUT, write$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint64 (*write)(VipsTarget *, const void *, size_t)
     * }
     */
    public static void write(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(write$LAYOUT, write$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*finish)(VipsTarget *)
     * }
     */
    public static class finish {

        finish() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            VipsRaw.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(finish.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(finish.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout finish$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("finish"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*finish)(VipsTarget *)
     * }
     */
    public static final AddressLayout finish$layout() {
        return finish$LAYOUT;
    }

    private static final long finish$OFFSET = 336;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*finish)(VipsTarget *)
     * }
     */
    public static final long finish$offset() {
        return finish$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*finish)(VipsTarget *)
     * }
     */
    public static MemorySegment finish(MemorySegment struct) {
        return struct.get(finish$LAYOUT, finish$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*finish)(VipsTarget *)
     * }
     */
    public static void finish(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(finish$LAYOUT, finish$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gint64 (*read)(VipsTarget *, void *, size_t)
     * }
     */
    public static class read {

        read() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            long apply(MemorySegment _x0, MemorySegment _x1, long _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            VipsRaw.C_LONG_LONG,
            VipsRaw.C_POINTER,
            VipsRaw.C_POINTER,
            VipsRaw.C_LONG
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(read.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(read.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static long invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, long _x2) {
            try {
                return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout read$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("read"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint64 (*read)(VipsTarget *, void *, size_t)
     * }
     */
    public static final AddressLayout read$layout() {
        return read$LAYOUT;
    }

    private static final long read$OFFSET = 344;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint64 (*read)(VipsTarget *, void *, size_t)
     * }
     */
    public static final long read$offset() {
        return read$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint64 (*read)(VipsTarget *, void *, size_t)
     * }
     */
    public static MemorySegment read(MemorySegment struct) {
        return struct.get(read$LAYOUT, read$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint64 (*read)(VipsTarget *, void *, size_t)
     * }
     */
    public static void read(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(read$LAYOUT, read$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gint64 (*seek)(VipsTarget *, gint64, int)
     * }
     */
    public static class seek {

        seek() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            long apply(MemorySegment _x0, long _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            VipsRaw.C_LONG_LONG,
            VipsRaw.C_POINTER,
            VipsRaw.C_LONG_LONG,
            VipsRaw.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(seek.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(seek.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static long invoke(MemorySegment funcPtr,MemorySegment _x0, long _x1, int _x2) {
            try {
                return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout seek$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("seek"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint64 (*seek)(VipsTarget *, gint64, int)
     * }
     */
    public static final AddressLayout seek$layout() {
        return seek$LAYOUT;
    }

    private static final long seek$OFFSET = 352;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint64 (*seek)(VipsTarget *, gint64, int)
     * }
     */
    public static final long seek$offset() {
        return seek$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint64 (*seek)(VipsTarget *, gint64, int)
     * }
     */
    public static MemorySegment seek(MemorySegment struct) {
        return struct.get(seek$LAYOUT, seek$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint64 (*seek)(VipsTarget *, gint64, int)
     * }
     */
    public static void seek(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(seek$LAYOUT, seek$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * int (*end)(VipsTarget *)
     * }
     */
    public static class end {

        end() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            VipsRaw.C_INT,
            VipsRaw.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(end.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(end.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout end$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("end"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*end)(VipsTarget *)
     * }
     */
    public static final AddressLayout end$layout() {
        return end$LAYOUT;
    }

    private static final long end$OFFSET = 360;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*end)(VipsTarget *)
     * }
     */
    public static final long end$offset() {
        return end$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*end)(VipsTarget *)
     * }
     */
    public static MemorySegment end(MemorySegment struct) {
        return struct.get(end$LAYOUT, end$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*end)(VipsTarget *)
     * }
     */
    public static void end(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(end$LAYOUT, end$OFFSET, fieldValue);
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

