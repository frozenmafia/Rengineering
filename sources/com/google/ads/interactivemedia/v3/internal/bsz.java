package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class bsz extends bpk implements bqr {
    private static final bsz a;
    private int e;
    private boolean f;
    private boolean g;

    static {
        bsz bszVar = new bsz();
        a = bszVar;
        bpk.aI(bsz.class, bszVar);
    }

    private bsz() {
    }

    public static bsz e() {
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
                    return new bsx((byte[]) null, (char[]) null);
                }
                return new bsz();
            }
            return aH(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
