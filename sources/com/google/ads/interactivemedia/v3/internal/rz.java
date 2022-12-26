package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class rz implements ub {
    public final ub a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ sa f1257b;
    private boolean c;

    public rz(sa saVar, ub ubVar) {
        this.f1257b = saVar;
        this.a = ubVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int a(gn gnVar, ee eeVar, int i) {
        if (this.f1257b.j()) {
            return -3;
        }
        if (this.c) {
            eeVar.c(4);
            return -4;
        }
        int a = this.a.a(gnVar, eeVar, i);
        if (a == -5) {
            s sVar = gnVar.f1065b;
            af.s(sVar);
            int i2 = sVar.B;
            if (i2 != 0 || sVar.C != 0) {
                int i3 = this.f1257b.f1260b != Long.MIN_VALUE ? 0 : sVar.C;
                r b2 = sVar.b();
                b2.N(i2);
                b2.O(i3);
                gnVar.f1065b = b2.v();
            }
            return -5;
        }
        sa saVar = this.f1257b;
        long j = saVar.f1260b;
        if (j == Long.MIN_VALUE || ((a != -4 || eeVar.d < j) && !(a == -3 && saVar.bm() == Long.MIN_VALUE && !eeVar.c))) {
            return a;
        }
        eeVar.b();
        eeVar.c(4);
        this.c = true;
        return -4;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int b(long j) {
        if (this.f1257b.j()) {
            return -3;
        }
        return this.a.b(j);
    }

    public final void c() {
        this.c = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final void d() throws IOException {
        this.a.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final boolean g() {
        return !this.f1257b.j() && this.a.g();
    }
}
