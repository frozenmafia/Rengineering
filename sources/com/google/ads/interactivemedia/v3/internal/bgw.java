package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgw extends bpk implements bqr {
    private static final bgw a;
    private int e;
    private bgx f;

    static {
        bgw bgwVar = new bgw();
        a = bgwVar;
        bpk.aI(bgw.class, bgwVar);
    }

    private bgw() {
    }

    public static /* synthetic */ bgw b() {
        return a;
    }

    public static bgw c(bnz bnzVar, boy boyVar) throws bpt {
        return (bgw) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void e(bgw bgwVar, bgx bgxVar) {
        bgxVar.getClass();
        bgwVar.f = bgxVar;
    }

    public static /* synthetic */ void f(bgw bgwVar) {
        bgwVar.e = 0;
    }

    public static bha g() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bgx d() {
        bgx bgxVar = this.f;
        return bgxVar == null ? bgx.c() : bgxVar;
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
                    return new bha((byte[]) null, (byte[]) null);
                }
                return new bgw();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
