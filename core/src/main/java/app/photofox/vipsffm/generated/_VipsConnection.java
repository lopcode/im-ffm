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
 * struct _VipsConnection {
 *     VipsObject parent_object;
 *     int descriptor;
 *     int tracked_descriptor;
 *     int close_descriptor;
 *     char *filename;
 * }
 * }
 */
public class _VipsConnection {

    _VipsConnection() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _VipsObject.layout().withName("parent_object"),
        VipsRaw.C_INT.withName("descriptor"),
        VipsRaw.C_INT.withName("tracked_descriptor"),
        VipsRaw.C_INT.withName("close_descriptor"),
        MemoryLayout.paddingLayout(4),
        VipsRaw.C_POINTER.withName("filename")
    ).withName("_VipsConnection");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_object$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_object"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VipsObject parent_object
     * }
     */
    public static final GroupLayout parent_object$layout() {
        return parent_object$LAYOUT;
    }

    private static final long parent_object$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VipsObject parent_object
     * }
     */
    public static final long parent_object$offset() {
        return parent_object$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VipsObject parent_object
     * }
     */
    public static MemorySegment parent_object(MemorySegment struct) {
        return struct.asSlice(parent_object$OFFSET, parent_object$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VipsObject parent_object
     * }
     */
    public static void parent_object(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_object$OFFSET, parent_object$LAYOUT.byteSize());
    }

    private static final OfInt descriptor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("descriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int descriptor
     * }
     */
    public static final OfInt descriptor$layout() {
        return descriptor$LAYOUT;
    }

    private static final long descriptor$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int descriptor
     * }
     */
    public static final long descriptor$offset() {
        return descriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int descriptor
     * }
     */
    public static int descriptor(MemorySegment struct) {
        return struct.get(descriptor$LAYOUT, descriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int descriptor
     * }
     */
    public static void descriptor(MemorySegment struct, int fieldValue) {
        struct.set(descriptor$LAYOUT, descriptor$OFFSET, fieldValue);
    }

    private static final OfInt tracked_descriptor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tracked_descriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tracked_descriptor
     * }
     */
    public static final OfInt tracked_descriptor$layout() {
        return tracked_descriptor$LAYOUT;
    }

    private static final long tracked_descriptor$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tracked_descriptor
     * }
     */
    public static final long tracked_descriptor$offset() {
        return tracked_descriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tracked_descriptor
     * }
     */
    public static int tracked_descriptor(MemorySegment struct) {
        return struct.get(tracked_descriptor$LAYOUT, tracked_descriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tracked_descriptor
     * }
     */
    public static void tracked_descriptor(MemorySegment struct, int fieldValue) {
        struct.set(tracked_descriptor$LAYOUT, tracked_descriptor$OFFSET, fieldValue);
    }

    private static final OfInt close_descriptor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("close_descriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int close_descriptor
     * }
     */
    public static final OfInt close_descriptor$layout() {
        return close_descriptor$LAYOUT;
    }

    private static final long close_descriptor$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int close_descriptor
     * }
     */
    public static final long close_descriptor$offset() {
        return close_descriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int close_descriptor
     * }
     */
    public static int close_descriptor(MemorySegment struct) {
        return struct.get(close_descriptor$LAYOUT, close_descriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int close_descriptor
     * }
     */
    public static void close_descriptor(MemorySegment struct, int fieldValue) {
        struct.set(close_descriptor$LAYOUT, close_descriptor$OFFSET, fieldValue);
    }

    private static final AddressLayout filename$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("filename"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *filename
     * }
     */
    public static final AddressLayout filename$layout() {
        return filename$LAYOUT;
    }

    private static final long filename$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *filename
     * }
     */
    public static final long filename$offset() {
        return filename$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *filename
     * }
     */
    public static MemorySegment filename(MemorySegment struct) {
        return struct.get(filename$LAYOUT, filename$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *filename
     * }
     */
    public static void filename(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(filename$LAYOUT, filename$OFFSET, fieldValue);
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

