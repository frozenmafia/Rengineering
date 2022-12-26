package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;
/* loaded from: classes5.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = CacheKeyFactory$$ExternalSyntheticLambda0.INSTANCE;

    String buildCacheKey(DataSpec dataSpec);

    /* renamed from: com.google.android.exoplayer2.upstream.cache.CacheKeyFactory$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        static {
            CacheKeyFactory cacheKeyFactory = CacheKeyFactory.DEFAULT;
        }

        public static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
            return dataSpec.key != null ? dataSpec.key : dataSpec.uri.toString();
        }
    }
}
