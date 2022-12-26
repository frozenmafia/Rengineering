package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class agc extends bpk implements bqr {
    private static final agc a;
    private int e;
    private long f;
    private String g = "";
    private bnz h = bnz.f907b;

    static {
        agc agcVar = new agc();
        a = agcVar;
        bpk.aI(agc.class, agcVar);
    }

    private agc() {
    }

    public static /* synthetic */ agc b() {
        return a;
    }

    public static agc c() {
        return a;
    }

    public final long a() {
        return this.f;
    }

    public final boolean d() {
        return (this.e & 1) != 0;
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
                    return new age((byte[]) null, (int[]) null);
                }
                return new agc();
            }
            return aH(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"e", "f", "g", "h"});
        }
        return (byte) 1;
    }
}
