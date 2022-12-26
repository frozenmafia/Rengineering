package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfr extends bpk implements bqr {
    private static final bfr a;

    static {
        bfr bfrVar = new bfr();
        a = bfrVar;
        bpk.aI(bfr.class, bfrVar);
    }

    private bfr() {
    }

    public static /* synthetic */ bfr a() {
        return a;
    }

    public static bfr b() {
        return a;
    }

    public static bfr c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfr) bpk.aB(a, bnzVar, boyVar);
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
                    return new bha((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                }
                return new bfr();
            }
            return aH(a, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
