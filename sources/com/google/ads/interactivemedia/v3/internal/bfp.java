package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfp extends bpk implements bqr {
    private static final bfp a;
    private int e;
    private int f;

    static {
        bfp bfpVar = new bfp();
        a = bfpVar;
        bpk.aI(bfp.class, bfpVar);
    }

    private bfp() {
    }

    public static /* synthetic */ bfp b() {
        return a;
    }

    public static bfp c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfp) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void d(bfp bfpVar) {
        bfpVar.e = 64;
    }

    public static bha e() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
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
                    return new bha((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                }
                return new bfp();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
