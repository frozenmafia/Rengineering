package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class afc extends bpk implements bqr {
    private static final afc a;
    private int e;
    private String f = "";
    private String g = "";

    static {
        afc afcVar = new afc();
        a = afcVar;
        bpk.aI(afc.class, afcVar);
    }

    private afc() {
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
                    return new afg((byte[]) null, (byte[]) null);
                }
                return new afc();
            }
            return aH(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
