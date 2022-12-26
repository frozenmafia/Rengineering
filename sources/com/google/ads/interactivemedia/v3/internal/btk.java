package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class btk extends bpk implements bqr {
    private static final btk a;
    private byte f = 2;
    private bpq e = aE();

    static {
        btk btkVar = new btk();
        a = btkVar;
        bpk.aI(btk.class, btkVar);
    }

    private btk() {
    }

    public static btk e() {
        return a;
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
                        this.f = obj != null ? (byte) 1 : (byte) 0;
                        return null;
                    }
                    return new bti(null, null);
                }
                return new btk();
            }
            return aH(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"e", btj.class});
        }
        return Byte.valueOf(this.f);
    }
}
