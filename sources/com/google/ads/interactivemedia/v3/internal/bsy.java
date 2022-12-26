package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class bsy extends bpk implements bqr {
    private static final bsy a;
    private bpp e = aD();

    static {
        bsy bsyVar = new bsy();
        a = bsyVar;
        bpk.aI(bsy.class, bsyVar);
    }

    private bsy() {
    }

    public static /* synthetic */ bsy c() {
        return a;
    }

    public static bsy e() {
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
                    return new bsx(null);
                }
                return new bsy();
            }
            return aH(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"e", bte.b()});
        }
        return (byte) 1;
    }
}
