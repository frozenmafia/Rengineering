package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgc extends bpk implements bqr {
    private static final bgc a;
    private bgd e;
    private int f;
    private int g;

    static {
        bgc bgcVar = new bgc();
        a = bgcVar;
        bpk.aI(bgc.class, bgcVar);
    }

    private bgc() {
    }

    public static /* synthetic */ bgc b() {
        return a;
    }

    public static bgc c() {
        return a;
    }

    public static bgc d(bnz bnzVar, boy boyVar) throws bpt {
        return (bgc) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void f(bgc bgcVar, bgd bgdVar) {
        bgdVar.getClass();
        bgcVar.e = bgdVar;
    }

    public static /* synthetic */ void g(bgc bgcVar, int i) {
        bgcVar.f = i;
    }

    public static bha h() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.f;
    }

    public final bgd e() {
        bgd bgdVar = this.e;
        return bgdVar == null ? bgd.c() : bgdVar;
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
                    return new bha((byte[]) null, (char[]) null, (byte[]) null, (char[]) null);
                }
                return new bgc();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
