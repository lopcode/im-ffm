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
 * struct _VipsSource {
 *     VipsConnection parent_object;
 *     gboolean decode;
 *     gboolean have_tested_seek;
 *     gboolean is_pipe;
 *     gint64 read_position;
 *     gint64 length;
 *     const void *data;
 *     GByteArray *header_bytes;
 *     GByteArray *sniff;
 *     VipsBlob *blob;
 *     void *mmap_baseaddr;
 *     size_t mmap_length;
 * }
 * }
 */
public class _VipsSource {

    _VipsSource() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _VipsConnection.layout().withName("parent_object"),
        vips_h.C_INT.withName("decode"),
        vips_h.C_INT.withName("have_tested_seek"),
        vips_h.C_INT.withName("is_pipe"),
        MemoryLayout.paddingLayout(4),
        vips_h.C_LONG_LONG.withName("read_position"),
        vips_h.C_LONG_LONG.withName("length"),
        vips_h.C_POINTER.withName("data"),
        vips_h.C_POINTER.withName("header_bytes"),
        vips_h.C_POINTER.withName("sniff"),
        vips_h.C_POINTER.withName("blob"),
        vips_h.C_POINTER.withName("mmap_baseaddr"),
        vips_h.C_LONG.withName("mmap_length")
    ).withName("_VipsSource");

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
     * VipsConnection parent_object
     * }
     */
    public static final GroupLayout parent_object$layout() {
        return parent_object$LAYOUT;
    }

    private static final long parent_object$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VipsConnection parent_object
     * }
     */
    public static final long parent_object$offset() {
        return parent_object$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VipsConnection parent_object
     * }
     */
    public static MemorySegment parent_object(MemorySegment struct) {
        return struct.asSlice(parent_object$OFFSET, parent_object$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VipsConnection parent_object
     * }
     */
    public static void parent_object(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_object$OFFSET, parent_object$LAYOUT.byteSize());
    }

    private static final OfInt decode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("decode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean decode
     * }
     */
    public static final OfInt decode$layout() {
        return decode$LAYOUT;
    }

    private static final long decode$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean decode
     * }
     */
    public static final long decode$offset() {
        return decode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean decode
     * }
     */
    public static int decode(MemorySegment struct) {
        return struct.get(decode$LAYOUT, decode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean decode
     * }
     */
    public static void decode(MemorySegment struct, int fieldValue) {
        struct.set(decode$LAYOUT, decode$OFFSET, fieldValue);
    }

    private static final OfInt have_tested_seek$LAYOUT = (OfInt)$LAYOUT.select(groupElement("have_tested_seek"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean have_tested_seek
     * }
     */
    public static final OfInt have_tested_seek$layout() {
        return have_tested_seek$LAYOUT;
    }

    private static final long have_tested_seek$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean have_tested_seek
     * }
     */
    public static final long have_tested_seek$offset() {
        return have_tested_seek$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean have_tested_seek
     * }
     */
    public static int have_tested_seek(MemorySegment struct) {
        return struct.get(have_tested_seek$LAYOUT, have_tested_seek$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean have_tested_seek
     * }
     */
    public static void have_tested_seek(MemorySegment struct, int fieldValue) {
        struct.set(have_tested_seek$LAYOUT, have_tested_seek$OFFSET, fieldValue);
    }

    private static final OfInt is_pipe$LAYOUT = (OfInt)$LAYOUT.select(groupElement("is_pipe"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean is_pipe
     * }
     */
    public static final OfInt is_pipe$layout() {
        return is_pipe$LAYOUT;
    }

    private static final long is_pipe$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean is_pipe
     * }
     */
    public static final long is_pipe$offset() {
        return is_pipe$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean is_pipe
     * }
     */
    public static int is_pipe(MemorySegment struct) {
        return struct.get(is_pipe$LAYOUT, is_pipe$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean is_pipe
     * }
     */
    public static void is_pipe(MemorySegment struct, int fieldValue) {
        struct.set(is_pipe$LAYOUT, is_pipe$OFFSET, fieldValue);
    }

    private static final OfLong read_position$LAYOUT = (OfLong)$LAYOUT.select(groupElement("read_position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint64 read_position
     * }
     */
    public static final OfLong read_position$layout() {
        return read_position$LAYOUT;
    }

    private static final long read_position$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint64 read_position
     * }
     */
    public static final long read_position$offset() {
        return read_position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint64 read_position
     * }
     */
    public static long read_position(MemorySegment struct) {
        return struct.get(read_position$LAYOUT, read_position$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint64 read_position
     * }
     */
    public static void read_position(MemorySegment struct, long fieldValue) {
        struct.set(read_position$LAYOUT, read_position$OFFSET, fieldValue);
    }

    private static final OfLong length$LAYOUT = (OfLong)$LAYOUT.select(groupElement("length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint64 length
     * }
     */
    public static final OfLong length$layout() {
        return length$LAYOUT;
    }

    private static final long length$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint64 length
     * }
     */
    public static final long length$offset() {
        return length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint64 length
     * }
     */
    public static long length(MemorySegment struct) {
        return struct.get(length$LAYOUT, length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint64 length
     * }
     */
    public static void length(MemorySegment struct, long fieldValue) {
        struct.set(length$LAYOUT, length$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final AddressLayout header_bytes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("header_bytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GByteArray *header_bytes
     * }
     */
    public static final AddressLayout header_bytes$layout() {
        return header_bytes$LAYOUT;
    }

    private static final long header_bytes$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GByteArray *header_bytes
     * }
     */
    public static final long header_bytes$offset() {
        return header_bytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GByteArray *header_bytes
     * }
     */
    public static MemorySegment header_bytes(MemorySegment struct) {
        return struct.get(header_bytes$LAYOUT, header_bytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GByteArray *header_bytes
     * }
     */
    public static void header_bytes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(header_bytes$LAYOUT, header_bytes$OFFSET, fieldValue);
    }

    private static final AddressLayout sniff$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sniff"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GByteArray *sniff
     * }
     */
    public static final AddressLayout sniff$layout() {
        return sniff$LAYOUT;
    }

    private static final long sniff$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GByteArray *sniff
     * }
     */
    public static final long sniff$offset() {
        return sniff$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GByteArray *sniff
     * }
     */
    public static MemorySegment sniff(MemorySegment struct) {
        return struct.get(sniff$LAYOUT, sniff$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GByteArray *sniff
     * }
     */
    public static void sniff(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sniff$LAYOUT, sniff$OFFSET, fieldValue);
    }

    private static final AddressLayout blob$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("blob"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VipsBlob *blob
     * }
     */
    public static final AddressLayout blob$layout() {
        return blob$LAYOUT;
    }

    private static final long blob$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VipsBlob *blob
     * }
     */
    public static final long blob$offset() {
        return blob$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VipsBlob *blob
     * }
     */
    public static MemorySegment blob(MemorySegment struct) {
        return struct.get(blob$LAYOUT, blob$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VipsBlob *blob
     * }
     */
    public static void blob(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(blob$LAYOUT, blob$OFFSET, fieldValue);
    }

    private static final AddressLayout mmap_baseaddr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mmap_baseaddr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *mmap_baseaddr
     * }
     */
    public static final AddressLayout mmap_baseaddr$layout() {
        return mmap_baseaddr$LAYOUT;
    }

    private static final long mmap_baseaddr$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *mmap_baseaddr
     * }
     */
    public static final long mmap_baseaddr$offset() {
        return mmap_baseaddr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *mmap_baseaddr
     * }
     */
    public static MemorySegment mmap_baseaddr(MemorySegment struct) {
        return struct.get(mmap_baseaddr$LAYOUT, mmap_baseaddr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *mmap_baseaddr
     * }
     */
    public static void mmap_baseaddr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mmap_baseaddr$LAYOUT, mmap_baseaddr$OFFSET, fieldValue);
    }

    private static final OfLong mmap_length$LAYOUT = (OfLong)$LAYOUT.select(groupElement("mmap_length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t mmap_length
     * }
     */
    public static final OfLong mmap_length$layout() {
        return mmap_length$LAYOUT;
    }

    private static final long mmap_length$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t mmap_length
     * }
     */
    public static final long mmap_length$offset() {
        return mmap_length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t mmap_length
     * }
     */
    public static long mmap_length(MemorySegment struct) {
        return struct.get(mmap_length$LAYOUT, mmap_length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t mmap_length
     * }
     */
    public static void mmap_length(MemorySegment struct, long fieldValue) {
        struct.set(mmap_length$LAYOUT, mmap_length$OFFSET, fieldValue);
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

