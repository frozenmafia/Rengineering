package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class agd extends bpk implements bqr {
    private static final agd a;
    private int e;
    private String f = "";

    static {
        agd agdVar = new agd();
        a = agdVar;
        bpk.aI(agd.class, agdVar);
    }

    private agd() {
    }

    public static /* synthetic */ agd a() {
        return a;
    }

    public static /* synthetic */ void b(agd agdVar, String str) {
        str.getClass();
        agdVar.e |= 1;
        agdVar.f = str;
    }

    public static age c() {
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
                    return new age((byte[]) null, (byte[]) null);
                }
                return new agd();
            }
            return aH(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
