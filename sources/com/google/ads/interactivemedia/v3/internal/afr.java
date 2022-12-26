package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class afr extends bpk implements bqr {
    private static final afr a;
    private int e;
    private int f;
    private long g = -1;

    static {
        afr afrVar = new afr();
        a = afrVar;
        bpk.aI(afr.class, afrVar);
    }

    private afr() {
    }

    public static /* synthetic */ afr a() {
        return a;
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
                    return new age((byte[]) null, (char[]) null, (byte[]) null);
                }
                return new afr();
            }
            return aH(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"e", "f", afo.a(), "g"});
        }
        return (byte) 1;
    }
}
