package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class bou extends bpk implements bqr {
    private static final bou a;
    private int e;
    private long h;
    private long i;
    private double j;
    private byte m = 2;
    private bpq f = bqy.e();
    private String g = "";
    private bnz k = bnz.f907b;
    private String l = "";

    static {
        bou bouVar = new bou();
        a = bouVar;
        bpk.aI(bou.class, bouVar);
    }

    private bou() {
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
                        this.m = obj != null ? (byte) 1 : (byte) 0;
                        return null;
                    }
                    return new bos(null);
                }
                return new bou();
            }
            return aH(a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"e", "f", bot.class, "g", "h", "i", "j", "k", "l"});
        }
        return Byte.valueOf(this.m);
    }
}
