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
 * struct _GParamSpecUInt64 {
 *     GParamSpec parent_instance;
 *     guint64 minimum;
 *     guint64 maximum;
 *     guint64 default_value;
 * }
 * }
 */
public class _GParamSpecUInt64 {

    _GParamSpecUInt64() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GParamSpec.layout().withName("parent_instance"),
        VipsRaw.C_LONG_LONG.withName("minimum"),
        VipsRaw.C_LONG_LONG.withName("maximum"),
        VipsRaw.C_LONG_LONG.withName("default_value")
    ).withName("_GParamSpecUInt64");

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

    private static final OfLong minimum$LAYOUT = (OfLong)$LAYOUT.select(groupElement("minimum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint64 minimum
     * }
     */
    public static final OfLong minimum$layout() {
        return minimum$LAYOUT;
    }

    private static final long minimum$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint64 minimum
     * }
     */
    public static final long minimum$offset() {
        return minimum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint64 minimum
     * }
     */
    public static long minimum(MemorySegment struct) {
        return struct.get(minimum$LAYOUT, minimum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint64 minimum
     * }
     */
    public static void minimum(MemorySegment struct, long fieldValue) {
        struct.set(minimum$LAYOUT, minimum$OFFSET, fieldValue);
    }

    private static final OfLong maximum$LAYOUT = (OfLong)$LAYOUT.select(groupElement("maximum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint64 maximum
     * }
     */
    public static final OfLong maximum$layout() {
        return maximum$LAYOUT;
    }

    private static final long maximum$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint64 maximum
     * }
     */
    public static final long maximum$offset() {
        return maximum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint64 maximum
     * }
     */
    public static long maximum(MemorySegment struct) {
        return struct.get(maximum$LAYOUT, maximum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint64 maximum
     * }
     */
    public static void maximum(MemorySegment struct, long fieldValue) {
        struct.set(maximum$LAYOUT, maximum$OFFSET, fieldValue);
    }

    private static final OfLong default_value$LAYOUT = (OfLong)$LAYOUT.select(groupElement("default_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint64 default_value
     * }
     */
    public static final OfLong default_value$layout() {
        return default_value$LAYOUT;
    }

    private static final long default_value$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint64 default_value
     * }
     */
    public static final long default_value$offset() {
        return default_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint64 default_value
     * }
     */
    public static long default_value(MemorySegment struct) {
        return struct.get(default_value$LAYOUT, default_value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint64 default_value
     * }
     */
    public static void default_value(MemorySegment struct, long fieldValue) {
        struct.set(default_value$LAYOUT, default_value$OFFSET, fieldValue);
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

