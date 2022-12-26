package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfy extends bpk implements bqr {
    private static final bfy a;
    private int e;
    private int f;
    private bnz g = bnz.f907b;

    static {
        bfy bfyVar = new bfy();
        a = bfyVar;
        bpk.aI(bfy.class, bfyVar);
    }

    private bfy() {
    }

    public static /* synthetic */ bfy a() {
        return a;
    }

    public static bfy b() {
        return a;
    }

    public static /* synthetic */ void d(bfy bfyVar, bnz bnzVar) {
        bfyVar.g = bnzVar;
    }

    public static /* synthetic */ void g(bfy bfyVar, int i) {
        bfyVar.e = bfz.a(i);
    }

    public static /* synthetic */ void h(bfy bfyVar, int i) {
        bfyVar.f = bga.a(i);
    }

    public static bha j() {
        return (bha) a.ay();
    }

    public final bnz c() {
        return this.g;
    }

    public final int e() {
        int b2 = bfz.b(this.e);
        return b2 == 0 ? bfz.f : b2;
    }

    public final int f() {
        int b2 = bga.b(this.f);
        return b2 == 0 ? bga.g : b2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpk
    protected final Object i(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return a;
                    }
                    return new bha((byte[]) null, (int[]) null, (byte[]) null);
                }
                return new bfy();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
