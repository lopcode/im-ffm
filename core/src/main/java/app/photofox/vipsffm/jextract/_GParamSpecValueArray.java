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
 * struct _GParamSpecValueArray {
 *     GParamSpec parent_instance;
 *     GParamSpec *element_spec;
 *     guint fixed_n_elements;
 * }
 * }
 */
public class _GParamSpecValueArray {

    _GParamSpecValueArray() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GParamSpec.layout().withName("parent_instance"),
        VipsRaw.C_POINTER.withName("element_spec"),
        VipsRaw.C_INT.withName("fixed_n_elements"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GParamSpecValueArray");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_instance$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_instance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GParamSpec parent_instance
     * }
     */
    public static final GroupLayout parent_instance$layout() {
        return parent_instance$LAYOUT;
    }

    private static final long parent_instance$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GParamSpec parent_instance
     * }
     */
    public static final long parent_instance$offset() {
        return parent_instance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GParamSpec parent_instance
     * }
     */
    public static MemorySegment parent_instance(MemorySegment struct) {
        return struct.asSlice(parent_instance$OFFSET, parent_instance$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GParamSpec parent_instance
     * }
     */
    public static void parent_instance(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_instance$OFFSET, parent_instance$LAYOUT.byteSize());
    }

    private static final AddressLayout element_spec$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("element_spec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GParamSpec *element_spec
     * }
     */
    public static final AddressLayout element_spec$layout() {
        return element_spec$LAYOUT;
    }

    private static final long element_spec$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GParamSpec *element_spec
     * }
     */
    public static final long element_spec$offset() {
        return element_spec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GParamSpec *element_spec
     * }
     */
    public static MemorySegment element_spec(MemorySegment struct) {
        return struct.get(element_spec$LAYOUT, element_spec$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GParamSpec *element_spec
     * }
     */
    public static void element_spec(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(element_spec$LAYOUT, element_spec$OFFSET, fieldValue);
    }

    private static final OfInt fixed_n_elements$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fixed_n_elements"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint fixed_n_elements
     * }
     */
    public static final OfInt fixed_n_elements$layout() {
        return fixed_n_elements$LAYOUT;
    }

    private static final long fixed_n_elements$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint fixed_n_elements
     * }
     */
    public static final long fixed_n_elements$offset() {
        return fixed_n_elements$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint fixed_n_elements
     * }
     */
    public static int fixed_n_elements(MemorySegment struct) {
        return struct.get(fixed_n_elements$LAYOUT, fixed_n_elements$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint fixed_n_elements
     * }
     */
    public static void fixed_n_elements(MemorySegment struct, int fieldValue) {
        struct.set(fixed_n_elements$LAYOUT, fixed_n_elements$OFFSET, fieldValue);
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

