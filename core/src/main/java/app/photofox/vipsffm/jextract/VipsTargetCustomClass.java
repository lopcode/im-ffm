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
 * typedef struct _VipsTargetCustomClass {
 *     VipsTargetClass parent_class;
 *     gint64 (*write)(VipsTargetCustom *, const void *, gint64);
 *     void (*finish)(VipsTargetCustom *);
 *     gint64 (*read)(VipsTargetCustom *, void *, gint64);
 *     gint64 (*seek)(VipsTargetCustom *, gint64, int);
 *     int (*end)(VipsTargetCustom *);
 * } VipsTargetCustomClass
 * }
 */
public class VipsTargetCustomClass extends _VipsTargetCustomClass {

    VipsTargetCustomClass() {
        // Should not be called directly
    }
}

