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
 * struct _GParamSpecClass {
 *     GTypeClass g_type_class;
 *     GType value_type;
 *     void (*finalize)(GParamSpec *);
 *     void (*value_set_default)(GParamSpec *, GValue *);
 *     gboolean (*value_validate)(GParamSpec *, GValue *);
 *     gint (*values_cmp)(GParamSpec *, const GValue *, const GValue *);
 *     gboolean (*value_is_valid)(GParamSpec *, const GValue *);
 *     gpointer dummy[3];
 * }
 * }
 */
public class _GParamSpecClass {

    _GParamSpecClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeClass.layout().withName("g_type_class"),
        VipsRaw.C_LONG.withName("value_type"),
        VipsRaw.C_POINTER.withName("finalize"),
        VipsRaw.C_POINTER.withName("value_set_default"),
        VipsRaw.C_POINTER.withName("value_validate"),
        VipsRaw.C_POINTER.withName("values_cmp"),
        VipsRaw.C_POINTER.withName("value_is_valid"),
        MemoryLayout.sequenceLayout(3, VipsRaw.C_POINTER).withName("dummy")
    ).withName("_GParamSpecClass");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout g_type_class$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("g_type_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTypeClass g_type_class
     * }
     */
    public static final GroupLayout g_type_class$layout() {
        return g_type_class$LAYOUT;
    }

    private static final long g_type_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTypeClass g_type_class
     * }
     */
    public static final long g_type_class$offset() {
        return g_type_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTypeClass g_type_class
     * }
     */
    public static MemorySegment g_type_class(MemorySegment struct) {
        return struct.asSlice(g_type_class$OFFSET, g_type_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTypeClass g_type_class
     * }
     */
    public static void g_type_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, g_type_class$OFFSET, g_type_class$LAYOUT.byteSize());
    }

    private static final OfLong value_type$LAYOUT = (OfLong)$LAYOUT.select(groupElement("value_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GType value_type
     * }
     */
    public static final OfLong value_type$layout() {
        return value_type$LAYOUT;
    }

    private static final long value_type$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GType value_type
     * }
     */
    public static final long value_type$offset() {
        return value_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GType value_type
     * }
     */
    public static long value_type(MemorySegment struct) {
        return struct.get(value_type$LAYOUT, value_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GType value_type
     * }
     */
    public static void value_type(MemorySegment struct, long fieldValue) {
        struct.set(value_type$LAYOUT, value_type$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*finalize)(GParamSpec *)
     * }
     */
    public static class finalize {

        finalize() {
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

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(finalize.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(finalize.Function fi, Arena arena) {
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

    private static final AddressLayout finalize$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("finalize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*finalize)(GParamSpec *)
     * }
     */
    public static final AddressLayout finalize$layout() {
        return finalize$LAYOUT;
    }

    private static final long finalize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*finalize)(GParamSpec *)
     * }
     */
    public static final long finalize$offset() {
        return finalize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*finalize)(GParamSpec *)
     * }
     */
    public static MemorySegment finalize(MemorySegment struct) {
        return struct.get(finalize$LAYOUT, finalize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*finalize)(GParamSpec *)
     * }
     */
    public static void finalize(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(finalize$LAYOUT, finalize$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*value_set_default)(GParamSpec *, GValue *)
     * }
     */
    public static class value_set_default {

        value_set_default() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            VipsRaw.C_POINTER,
            VipsRaw.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(value_set_default.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(value_set_default.Function fi, Arena arena) {
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

    private static final AddressLayout value_set_default$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("value_set_default"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*value_set_default)(GParamSpec *, GValue *)
     * }
     */
    public static final AddressLayout value_set_default$layout() {
        return value_set_default$LAYOUT;
    }

    private static final long value_set_default$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*value_set_default)(GParamSpec *, GValue *)
     * }
     */
    public static final long value_set_default$offset() {
        return value_set_default$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*value_set_default)(GParamSpec *, GValue *)
     * }
     */
    public static MemorySegment value_set_default(MemorySegment struct) {
        return struct.get(value_set_default$LAYOUT, value_set_default$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*value_set_default)(GParamSpec *, GValue *)
     * }
     */
    public static void value_set_default(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(value_set_default$LAYOUT, value_set_default$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*value_validate)(GParamSpec *, GValue *)
     * }
     */
    public static class value_validate {

        value_validate() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            VipsRaw.C_INT,
            VipsRaw.C_POINTER,
            VipsRaw.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(value_validate.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(value_validate.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout value_validate$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("value_validate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*value_validate)(GParamSpec *, GValue *)
     * }
     */
    public static final AddressLayout value_validate$layout() {
        return value_validate$LAYOUT;
    }

    private static final long value_validate$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*value_validate)(GParamSpec *, GValue *)
     * }
     */
    public static final long value_validate$offset() {
        return value_validate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*value_validate)(GParamSpec *, GValue *)
     * }
     */
    public static MemorySegment value_validate(MemorySegment struct) {
        return struct.get(value_validate$LAYOUT, value_validate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*value_validate)(GParamSpec *, GValue *)
     * }
     */
    public static void value_validate(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(value_validate$LAYOUT, value_validate$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gint (*values_cmp)(GParamSpec *, const GValue *, const GValue *)
     * }
     */
    public static class values_cmp {

        values_cmp() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            VipsRaw.C_INT,
            VipsRaw.C_POINTER,
            VipsRaw.C_POINTER,
            VipsRaw.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(values_cmp.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(values_cmp.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout values_cmp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("values_cmp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint (*values_cmp)(GParamSpec *, const GValue *, const GValue *)
     * }
     */
    public static final AddressLayout values_cmp$layout() {
        return values_cmp$LAYOUT;
    }

    private static final long values_cmp$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint (*values_cmp)(GParamSpec *, const GValue *, const GValue *)
     * }
     */
    public static final long values_cmp$offset() {
        return values_cmp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint (*values_cmp)(GParamSpec *, const GValue *, const GValue *)
     * }
     */
    public static MemorySegment values_cmp(MemorySegment struct) {
        return struct.get(values_cmp$LAYOUT, values_cmp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint (*values_cmp)(GParamSpec *, const GValue *, const GValue *)
     * }
     */
    public static void values_cmp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(values_cmp$LAYOUT, values_cmp$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*value_is_valid)(GParamSpec *, const GValue *)
     * }
     */
    public static class value_is_valid {

        value_is_valid() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            VipsRaw.C_INT,
            VipsRaw.C_POINTER,
            VipsRaw.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = VipsRaw.upcallHandle(value_is_valid.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(value_is_valid.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout value_is_valid$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("value_is_valid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*value_is_valid)(GParamSpec *, const GValue *)
     * }
     */
    public static final AddressLayout value_is_valid$layout() {
        return value_is_valid$LAYOUT;
    }

    private static final long value_is_valid$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*value_is_valid)(GParamSpec *, const GValue *)
     * }
     */
    public static final long value_is_valid$offset() {
        return value_is_valid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*value_is_valid)(GParamSpec *, const GValue *)
     * }
     */
    public static MemorySegment value_is_valid(MemorySegment struct) {
        return struct.get(value_is_valid$LAYOUT, value_is_valid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*value_is_valid)(GParamSpec *, const GValue *)
     * }
     */
    public static void value_is_valid(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(value_is_valid$LAYOUT, value_is_valid$OFFSET, fieldValue);
    }

    private static final SequenceLayout dummy$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("dummy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer dummy[3]
     * }
     */
    public static final SequenceLayout dummy$layout() {
        return dummy$LAYOUT;
    }

    private static final long dummy$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer dummy[3]
     * }
     */
    public static final long dummy$offset() {
        return dummy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer dummy[3]
     * }
     */
    public static MemorySegment dummy(MemorySegment struct) {
        return struct.asSlice(dummy$OFFSET, dummy$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer dummy[3]
     * }
     */
    public static void dummy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dummy$OFFSET, dummy$LAYOUT.byteSize());
    }

    private static long[] dummy$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * gpointer dummy[3]
     * }
     */
    public static long[] dummy$dimensions() {
        return dummy$DIMS;
    }
    private static final VarHandle dummy$ELEM_HANDLE = dummy$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * gpointer dummy[3]
     * }
     */
    public static MemorySegment dummy(MemorySegment struct, long index0) {
        return (MemorySegment)dummy$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * gpointer dummy[3]
     * }
     */
    public static void dummy(MemorySegment struct, long index0, MemorySegment fieldValue) {
        dummy$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

