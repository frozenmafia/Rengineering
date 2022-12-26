package o;

import com.facebook.cache.common.CacheErrorLogger;
/* loaded from: classes4.dex */
public class requireHost implements CacheErrorLogger {
    private static requireHost ah$a;

    @Override // com.facebook.cache.common.CacheErrorLogger
    public void toString(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, Class<?> cls, String str, Throwable th) {
    }

    private requireHost() {
    }

    public static requireHost values() {
        requireHost requirehost;
        synchronized (requireHost.class) {
            if (ah$a == null) {
                ah$a = new requireHost();
            }
            requirehost = ah$a;
        }
        return requirehost;
    }
}
