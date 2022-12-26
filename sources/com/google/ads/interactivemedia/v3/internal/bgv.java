package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgv extends bpk implements bqr {
    private static final bgv a;
    private String e = "";

    static {
        bgv bgvVar = new bgv();
        a = bgvVar;
        bpk.aI(bgv.class, bgvVar);
    }

    private bgv() {
    }

    public static /* synthetic */ bgv a() {
        return a;
    }

    public static bgv b() {
        return a;
    }

    public static bgv c(bnz bnzVar, boy boyVar) throws bpt {
        return (bgv) bpk.aB(a, bnzVar, boyVar);
    }

    public final String d() {
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
                    return new bha((byte[]) null, (int[]) null);
                }
                return new bgv();
            }
            return aH(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"e"});
        }
        return (byte) 1;
    }
}
