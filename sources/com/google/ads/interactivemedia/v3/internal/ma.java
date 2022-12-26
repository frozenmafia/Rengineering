package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class ma {
    private final lx a;

    /* renamed from: b  reason: collision with root package name */
    public final s f1167b;
    public final avb c;
    public final long d;
    public final List e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ma(s sVar, List list, mg mgVar, List list2) {
        af.u(!list.isEmpty());
        this.f1167b = sVar;
        this.c = avb.m(list);
        this.e = Collections.unmodifiableList(list2);
        this.a = mgVar.i(this);
        this.d = cp.w(mgVar.j, 1000000L, mgVar.i);
    }

    public abstract le k();

    public abstract lx l();

    public abstract void m();

    public final lx n() {
        return this.a;
    }
}
