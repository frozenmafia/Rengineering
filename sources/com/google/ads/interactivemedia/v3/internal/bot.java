package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public final class bot extends bpk implements bqr {
    private static final bot a;
    private int e;
    private boolean g;
    private byte h = 2;
    private String f = "";

    static {
        bot botVar = new bot();
        a = botVar;
        bpk.aI(bot.class, botVar);
    }

    private bot() {
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
                    return new bos((byte[]) null, (char[]) null);
                }
                return new bot();
            }
            return aH(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"e", "f", "g"});
        }
        return Byte.valueOf(this.h);
    }
}
