package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class bom extends bpk implements bqr {
    private static final bom a;
    private int e;
    private String f = "";
    private String g = "";

    static {
        bom bomVar = new bom();
        a = bomVar;
        bpk.aI(bom.class, bomVar);
    }

    private bom() {
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
                    return new bos((byte[]) null, (byte[]) null);
                }
                return new bom();
            }
            return aH(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
