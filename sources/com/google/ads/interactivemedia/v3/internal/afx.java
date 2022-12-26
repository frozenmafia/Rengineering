package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class afx extends bpk implements bqr {
    private static final afx a;
    private int e;
    private bnz f = bnz.f907b;
    private bnz g = bnz.f907b;

    static {
        afx afxVar = new afx();
        a = afxVar;
        bpk.aI(afx.class, afxVar);
    }

    private afx() {
    }

    public static /* synthetic */ afx a() {
        return a;
    }

    public static /* synthetic */ void b(afx afxVar, bnz bnzVar) {
        afxVar.e |= 1;
        afxVar.f = bnzVar;
    }

    public static /* synthetic */ void c(afx afxVar, bnz bnzVar) {
        afxVar.e |= 2;
        afxVar.g = bnzVar;
    }

    public static age d() {
        return (age) a.ay();
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
                    return new age((byte[]) null, (byte[]) null, (byte[]) null);
                }
                return new afx();
            }
            return aH(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
