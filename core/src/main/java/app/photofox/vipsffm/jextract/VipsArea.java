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
 * typedef struct _VipsArea {
 *     void *data;
 *     size_t length;
 *     int n;
 *     int count;
 *     GMutex *lock;
 *     VipsCallbackFn free_fn;
 *     void *client;
 *     GType type;
 *     size_t sizeof_type;
 * } VipsArea
 * }
 */
public class VipsArea extends _VipsArea {

    VipsArea() {
        // Should not be called directly
    }
}

