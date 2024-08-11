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
 * typedef struct _VipsRegion {
 *     VipsObject parent_object;
 *     VipsImage *im;
 *     VipsRect valid;
 *     RegionType type;
 *     VipsPel *data;
 *     int bpl;
 *     void *seq;
 *     GThread *thread;
 *     VipsWindow *window;
 *     VipsBuffer *buffer;
 *     gboolean invalid;
 * } VipsRegion
 * }
 */
public class VipsRegion extends _VipsRegion {

    VipsRegion() {
        // Should not be called directly
    }
}

