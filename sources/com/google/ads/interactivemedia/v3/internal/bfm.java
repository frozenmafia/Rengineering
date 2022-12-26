package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfm extends bpk implements bqr {
    private static final bfm a;
    private int e;
    private bnz f = bnz.f907b;

    static {
        bfm bfmVar = new bfm();
        a = bfmVar;
        bpk.aI(bfm.class, bfmVar);
    }

    private bfm() {
    }

    public static /* synthetic */ bfm b() {
        return a;
    }

    public static bfm c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfm) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void e(bfm bfmVar, bnz bnzVar) {
        bfmVar.f = bnzVar;
    }

    public static /* synthetic */ void f(bfm bfmVar) {
        bfmVar.e = 0;
    }

    public static bha g() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bnz d() {
        return this.f;
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
                    return new bha((byte[]) null, (char[]) null, (short[]) null);
                }
                return new bfm();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
