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
 * struct _VipsBuffer {
 *     int ref_count;
 *     struct _VipsImage *im;
 *     VipsRect area;
 *     gboolean done;
 *     VipsBufferCache *cache;
 *     VipsPel *buf;
 *     size_t bsize;
 * }
 * }
 */
public class _VipsBuffer {

    _VipsBuffer() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vips_h.C_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(4),
        vips_h.C_POINTER.withName("im"),
        _VipsRect.layout().withName("area"),
        vips_h.C_INT.withName("done"),
        MemoryLayout.paddingLayout(4),
        vips_h.C_POINTER.withName("cache"),
        vips_h.C_POINTER.withName("buf"),
        vips_h.C_LONG.withName("bsize")
    ).withName("_VipsBuffer");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ref_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ref_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int ref_count
     * }
     */
    public static final OfInt ref_count$layout() {
        return ref_count$LAYOUT;
    }

    private static final long ref_count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int ref_count
     * }
     */
    public static final long ref_count$offset() {
        return ref_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int ref_count
     * }
     */
    public static int ref_count(MemorySegment struct) {
        return struct.get(ref_count$LAYOUT, ref_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int ref_count
     * }
     */
    public static void ref_count(MemorySegment struct, int fieldValue) {
        struct.set(ref_count$LAYOUT, ref_count$OFFSET, fieldValue);
    }

    private static final AddressLayout im$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("im"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _VipsImage *im
     * }
     */
    public static final AddressLayout im$layout() {
        return im$LAYOUT;
    }

    private static final long im$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _VipsImage *im
     * }
     */
    public static final long im$offset() {
        return im$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _VipsImage *im
     * }
     */
    public static MemorySegment im(MemorySegment struct) {
        return struct.get(im$LAYOUT, im$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _VipsImage *im
     * }
     */
    public static void im(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(im$LAYOUT, im$OFFSET, fieldValue);
    }

    private static final GroupLayout area$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("area"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VipsRect area
     * }
     */
    public static final GroupLayout area$layout() {
        return area$LAYOUT;
    }

    private static final long area$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VipsRect area
     * }
     */
    public static final long area$offset() {
        return area$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VipsRect area
     * }
     */
    public static MemorySegment area(MemorySegment struct) {
        return struct.asSlice(area$OFFSET, area$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VipsRect area
     * }
     */
    public static void area(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, area$OFFSET, area$LAYOUT.byteSize());
    }

    private static final OfInt done$LAYOUT = (OfInt)$LAYOUT.select(groupElement("done"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean done
     * }
     */
    public static final OfInt done$layout() {
        return done$LAYOUT;
    }

    private static final long done$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean done
     * }
     */
    public static final long done$offset() {
        return done$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean done
     * }
     */
    public static int done(MemorySegment struct) {
        return struct.get(done$LAYOUT, done$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean done
     * }
     */
    public static void done(MemorySegment struct, int fieldValue) {
        struct.set(done$LAYOUT, done$OFFSET, fieldValue);
    }

    private static final AddressLayout cache$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("cache"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VipsBufferCache *cache
     * }
     */
    public static final AddressLayout cache$layout() {
        return cache$LAYOUT;
    }

    private static final long cache$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VipsBufferCache *cache
     * }
     */
    public static final long cache$offset() {
        return cache$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VipsBufferCache *cache
     * }
     */
    public static MemorySegment cache(MemorySegment struct) {
        return struct.get(cache$LAYOUT, cache$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VipsBufferCache *cache
     * }
     */
    public static void cache(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(cache$LAYOUT, cache$OFFSET, fieldValue);
    }

    private static final AddressLayout buf$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VipsPel *buf
     * }
     */
    public static final AddressLayout buf$layout() {
        return buf$LAYOUT;
    }

    private static final long buf$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VipsPel *buf
     * }
     */
    public static final long buf$offset() {
        return buf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VipsPel *buf
     * }
     */
    public static MemorySegment buf(MemorySegment struct) {
        return struct.get(buf$LAYOUT, buf$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VipsPel *buf
     * }
     */
    public static void buf(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buf$LAYOUT, buf$OFFSET, fieldValue);
    }

    private static final OfLong bsize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("bsize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t bsize
     * }
     */
    public static final OfLong bsize$layout() {
        return bsize$LAYOUT;
    }

    private static final long bsize$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t bsize
     * }
     */
    public static final long bsize$offset() {
        return bsize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t bsize
     * }
     */
    public static long bsize(MemorySegment struct) {
        return struct.get(bsize$LAYOUT, bsize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t bsize
     * }
     */
    public static void bsize(MemorySegment struct, long fieldValue) {
        struct.set(bsize$LAYOUT, bsize$OFFSET, fieldValue);
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

