package com.facebook.cache.common;

import o.performStop;
/* loaded from: classes4.dex */
public interface CacheEventListener {

    /* loaded from: classes4.dex */
    public enum EvictionReason {
        CACHE_FULL,
        CONTENT_STALE,
        USER_FORCED,
        CACHE_MANAGER_TRIMMED
    }

    void ag$a(performStop performstop);

    void ah$a();

    void ah$a(performStop performstop);

    void ah$b(performStop performstop);

    void invoke(performStop performstop);

    void toString(performStop performstop);

    void valueOf(performStop performstop);

    void values(performStop performstop);
}
