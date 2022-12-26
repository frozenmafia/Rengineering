package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class to implements ub {
    final /* synthetic */ tr a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1283b;

    public to(tr trVar, int i) {
        this.a = trVar;
        this.f1283b = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int a(gn gnVar, ee eeVar, int i) {
        return this.a.g(this.f1283b, gnVar, eeVar, i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int b(long j) {
        return this.a.j(this.f1283b, j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final void d() throws IOException {
        this.a.G(this.f1283b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final boolean g() {
        return this.a.J(this.f1283b);
    }
}
