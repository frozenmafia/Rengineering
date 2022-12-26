package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class afi extends bpk implements bqr {
    private static final afi a;
    private int e;
    private int f = 2;

    static {
        afi afiVar = new afi();
        a = afiVar;
        bpk.aI(afi.class, afiVar);
    }

    private afi() {
    }

    public static /* synthetic */ afi a() {
        return a;
    }

    public static afi b() {
        return a;
    }

    public final int c() {
        int b2 = afj.b(this.f);
        return b2 == 0 ? afj.c : b2;
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
                    return new afg((byte[]) null, (char[]) null);
                }
                return new afi();
            }
            return aH(a, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"e", "f", afj.a()});
        }
        return (byte) 1;
    }
}
