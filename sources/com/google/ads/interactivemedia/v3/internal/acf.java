package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class acf implements acc {
    private final ci a;

    /* renamed from: b  reason: collision with root package name */
    private final int f459b;
    private final int c;
    private int d;
    private int e;

    public acf(aby abyVar) {
        ci ciVar = abyVar.a;
        this.a = ciVar;
        ciVar.F(12);
        this.c = ciVar.l() & 255;
        this.f459b = ciVar.l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acc
    public final int a() {
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acc
    public final int b() {
        return this.f459b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acc
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.i();
        }
        if (i == 16) {
            return this.a.m();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            int i3 = this.a.i();
            this.e = i3;
            return (i3 & 240) >> 4;
        }
        return this.e & 15;
    }
}
