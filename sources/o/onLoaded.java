package o;

import android.app.Application;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.io.File;
/* loaded from: classes4.dex */
public final class onLoaded {
    public static final onLoaded valueOf = new onLoaded();
    private static okhttp3.Cache values;

    private onLoaded() {
    }

    public final okhttp3.Cache ag$a() {
        okhttp3.Cache cache;
        synchronized (this) {
            if (values == null) {
                Application ag$a = unregisterInitCallback.ah$a.ag$a();
                values = new okhttp3.Cache(new File(ag$a == null ? null : ag$a.getCacheDir(), "dp_cache"), CacheDataSink.DEFAULT_FRAGMENT_SIZE);
            }
            cache = values;
        }
        return cache;
    }
}
