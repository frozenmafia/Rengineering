package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgb extends bpk implements bqr {
    private static final bgb a;
    private int e;
    private bgd f;
    private bnz g = bnz.f907b;

    static {
        bgb bgbVar = new bgb();
        a = bgbVar;
        bpk.aI(bgb.class, bgbVar);
    }

    private bgb() {
    }

    public static /* synthetic */ bgb b() {
        return a;
    }

    public static bgb c() {
        return a;
    }

    public static bgb d(bnz bnzVar, boy boyVar) throws bpt {
        return (bgb) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void g(bgb bgbVar, bgd bgdVar) {
        bgdVar.getClass();
        bgbVar.f = bgdVar;
    }

    public static /* synthetic */ void h(bgb bgbVar, bnz bnzVar) {
        bgbVar.g = bnzVar;
    }

    public static /* synthetic */ void j(bgb bgbVar) {
        bgbVar.e = 0;
    }

    public static bha k() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bgd e() {
        bgd bgdVar = this.f;
        return bgdVar == null ? bgd.c() : bgdVar;
    }

    public final bnz f() {
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
                    return new bha((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                }
                return new bgb();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
