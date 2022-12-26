package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
/* loaded from: classes4.dex */
public final /* synthetic */ class aid implements Callable {
    public final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f570b;

    public /* synthetic */ aid(aij aijVar, int i) {
        this.f570b = i;
        this.a = aijVar;
    }

    public /* synthetic */ aid(alg algVar, int i) {
        this.f570b = i;
        this.a = algVar;
    }

    public /* synthetic */ aid(ali aliVar, int i) {
        this.f570b = i;
        this.a = aliVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f570b;
        if (i != 0) {
            if (i == 1) {
                return ((ali) this.a).a();
            }
            return ((aij) this.a).g();
        }
        return ((alg) this.a).b();
    }
}
