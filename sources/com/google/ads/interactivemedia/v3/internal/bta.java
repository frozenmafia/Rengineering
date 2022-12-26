package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class bta extends bpk implements bqr {
    private static final bta a;
    private bpp e = aD();

    static {
        bta btaVar = new bta();
        a = btaVar;
        bpk.aI(bta.class, btaVar);
    }

    private bta() {
    }

    public static /* synthetic */ bta c() {
        return a;
    }

    public static bta e() {
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
                    return new bsx((byte[]) null, (short[]) null);
                }
                return new bta();
            }
            return aH(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"e", bte.b()});
        }
        return (byte) 1;
    }
}
