package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgx extends bpk implements bqr {
    private static final bgx a;
    private String e = "";
    private bgo f;

    static {
        bgx bgxVar = new bgx();
        a = bgxVar;
        bpk.aI(bgx.class, bgxVar);
    }

    private bgx() {
    }

    public static /* synthetic */ bgx b() {
        return a;
    }

    public static bgx c() {
        return a;
    }

    public static bgx d(bnz bnzVar, boy boyVar) throws bpt {
        return (bgx) bpk.aB(a, bnzVar, boyVar);
    }

    public final bgo a() {
        bgo bgoVar = this.f;
        return bgoVar == null ? bgo.b() : bgoVar;
    }

    public final String e() {
        return this.e;
    }

    public final boolean f() {
        return this.f != null;
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
                    return new bha((byte[]) null, (boolean[]) null);
                }
                return new bgx();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
