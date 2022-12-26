package o;

import android.content.Context;
import java.io.File;
import o.zBy;
/* loaded from: classes3.dex */
public final class z extends zBy {
    public z(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public z(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public z(final Context context, final String str, long j) {
        super(new zBy.values() { // from class: o.z.5
            @Override // o.zBy.values
            public File ag$a() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        }, j);
    }
}
