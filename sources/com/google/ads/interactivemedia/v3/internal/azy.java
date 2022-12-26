package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes4.dex */
public final class azy {
    private final ConcurrentMap a;

    /* renamed from: b  reason: collision with root package name */
    private final azv f781b;
    private final Class c;
    private final bes d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ azy(ConcurrentMap concurrentMap, azv azvVar, bes besVar, Class cls) {
        this.a = concurrentMap;
        this.f781b = azvVar;
        this.c = cls;
        this.d = besVar;
    }

    public final azv a() {
        return this.f781b;
    }

    public final bes b() {
        return this.d;
    }

    public final Class c() {
        return this.c;
    }

    public final Collection d() {
        return this.a.values();
    }

    public final boolean e() {
        return !this.d.a().isEmpty();
    }
}
