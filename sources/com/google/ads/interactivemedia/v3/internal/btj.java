package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class btj extends bpk implements bqr {
    private static final btj a;
    private int e;
    private byte h = 2;
    private String f = "";
    private String g = "";

    static {
        btj btjVar = new btj();
        a = btjVar;
        bpk.aI(btj.class, btjVar);
    }

    private btj() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpk
    protected final Object i(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return a;
                        }
                        this.h = obj != null ? (byte) 1 : (byte) 0;
                        return null;
                    }
                    return new bti(null);
                }
                return new btj();
            }
            return aH(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"e", "f", "g"});
        }
        return Byte.valueOf(this.h);
    }
}
