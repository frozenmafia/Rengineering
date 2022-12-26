package com.app.dream11.core.service;

import com.app.dream11.core.service.cache.CacheController;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes2.dex */
public final class CacheResponseInterceptor$cacheController$2 extends Lambda implements Styleable.ArcMotion<CacheController> {
    public static final CacheResponseInterceptor$cacheController$2 INSTANCE = new CacheResponseInterceptor$cacheController$2();

    CacheResponseInterceptor$cacheController$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final CacheController invoke() {
        return new CacheController();
    }
}
