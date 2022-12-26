package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfw extends bpk implements bqr {
    private static final bfw a;
    private int e;
    private bfx f;
    private bnz g = bnz.f907b;

    static {
        bfw bfwVar = new bfw();
        a = bfwVar;
        bpk.aI(bfw.class, bfwVar);
    }

    private bfw() {
    }

    public static /* synthetic */ bfw b() {
        return a;
    }

    public static bfw c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfw) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void f(bfw bfwVar, bfx bfxVar) {
        bfxVar.getClass();
        bfwVar.f = bfxVar;
    }

    public static /* synthetic */ void g(bfw bfwVar, bnz bnzVar) {
        bfwVar.g = bnzVar;
    }

    public static /* synthetic */ void h(bfw bfwVar) {
        bfwVar.e = 0;
    }

    public static bha j() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bfx d() {
        bfx bfxVar = this.f;
        return bfxVar == null ? bfx.d() : bfxVar;
    }

    public final bnz e() {
        return this.g;
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
                    return new bha((byte[]) null, (char[]) null, (char[]) null, (byte[]) null);
                }
                return new bfw();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
