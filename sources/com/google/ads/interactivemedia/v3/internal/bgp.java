package com.google.ads.interactivemedia.v3.internal;
@Deprecated
/* loaded from: classes4.dex */
public final class bgp extends bpk implements bqr {
    private static final bgp a;
    private int g;
    private boolean h;
    private String e = "";
    private String f = "";
    private String i = "";

    static {
        bgp bgpVar = new bgp();
        a = bgpVar;
        bpk.aI(bgp.class, bgpVar);
    }

    private bgp() {
    }

    public final int a() {
        return this.g;
    }

    public final String c() {
        return this.i;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public final boolean f() {
        return this.h;
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
                    return new bha((byte[]) null, (char[]) null, (byte[]) null);
                }
                return new bgp();
            }
            return aH(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"e", "f", "g", "h", "i"});
        }
        return (byte) 1;
    }
}
