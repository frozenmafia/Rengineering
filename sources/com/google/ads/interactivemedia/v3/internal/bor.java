package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class bor extends bpi implements bqr {
    private static final bor e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private byte m = 2;
    private String k = "";
    private bpq l = bqy.e();

    static {
        bor borVar = new bor();
        e = borVar;
        bpk.aI(bor.class, borVar);
    }

    private bor() {
    }

    public static bor e() {
        return e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpk
    protected final Object i(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return e;
                        }
                        this.m = obj != null ? (byte) 1 : (byte) 0;
                        return null;
                    }
                    return new boo((byte[]) null, (char[]) null);
                }
                return new bor();
            }
            return aH(e, "\u0001\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\nဈ\u0004ϧЛ", new Object[]{"f", "g", "h", "i", "j", "k", "l", bou.class});
        }
        return Byte.valueOf(this.m);
    }
}
