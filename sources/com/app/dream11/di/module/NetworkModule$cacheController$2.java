package com.app.dream11.di.module;

import com.app.dream11.core.service.cache.CacheController;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NetworkModule$cacheController$2 extends Lambda implements Styleable.ArcMotion<CacheController> {
    public static final NetworkModule$cacheController$2 INSTANCE = new NetworkModule$cacheController$2();

    NetworkModule$cacheController$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final CacheController invoke() {
        return new CacheController();
    }
}
