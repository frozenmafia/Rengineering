package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class bsu extends bpk implements bqr {
    private static final bsu a;
    private int e;
    private int f;
    private String g = "*";

    static {
        bsu bsuVar = new bsu();
        a = bsuVar;
        bpk.aI(bsu.class, bsuVar);
    }

    private bsu() {
    }

    public static /* synthetic */ bsu c() {
        return a;
    }

    public static bsu e() {
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
                    return new bsx((byte[]) null, (byte[]) null);
                }
                return new bsu();
            }
            return aH(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"e", "f", bsv.a(), "g"});
        }
        return (byte) 1;
    }
}
