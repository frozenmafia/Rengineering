package com.apollographql.apollo.api.cache.http;

import java.util.concurrent.TimeUnit;
import o.runAnimators;
/* loaded from: classes.dex */
public final class HttpCachePolicy {
    public static final HttpCachePolicy ah$a = new HttpCachePolicy();
    public static final valueOf ag$a = new valueOf(FetchStrategy.CACHE_ONLY);
    public static final toString toString = new toString(FetchStrategy.NETWORK_ONLY, 0, null, false);
    public static final valueOf valueOf = new valueOf(FetchStrategy.CACHE_FIRST);
    public static final valueOf values = new valueOf(FetchStrategy.NETWORK_FIRST);

    /* loaded from: classes.dex */
    public enum FetchStrategy {
        CACHE_ONLY,
        NETWORK_ONLY,
        CACHE_FIRST,
        NETWORK_FIRST
    }

    private HttpCachePolicy() {
    }

    /* loaded from: classes.dex */
    public static class toString {
        public final FetchStrategy ah$a;
        public final boolean toString;
        public final TimeUnit valueOf;
        public final long values;

        public toString(FetchStrategy fetchStrategy, long j, TimeUnit timeUnit, boolean z) {
            runAnimators.valueOf(fetchStrategy, "fetchStrategy");
            this.ah$a = fetchStrategy;
            this.values = j;
            this.valueOf = timeUnit;
            this.toString = z;
        }

        public final long values() {
            TimeUnit timeUnit = this.valueOf;
            if (timeUnit != null) {
                return timeUnit.toMillis(this.values);
            }
            return 0L;
        }
    }

    /* loaded from: classes.dex */
    public static final class valueOf extends toString {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public valueOf(FetchStrategy fetchStrategy) {
            super(fetchStrategy, 0L, null, false);
            runAnimators.valueOf(fetchStrategy, "fetchStrategy");
        }
    }
}
