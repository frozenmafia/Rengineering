package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgo extends bpk implements bqr {
    private static final bgo a;
    private String e = "";
    private bnz f = bnz.f907b;
    private int g;

    static {
        bgo bgoVar = new bgo();
        a = bgoVar;
        bpk.aI(bgo.class, bgoVar);
    }

    private bgo() {
    }

    public static bgo b() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(bgo bgoVar, String str) {
        str.getClass();
        bgoVar.e = str;
    }

    public static bha j() {
        return (bha) a.ay();
    }

    public final bnz c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final int g() {
        int b2 = bgy.b(this.g);
        return b2 == 0 ? bgy.f : b2;
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
                    return new bha((byte[]) null, (char[][]) null);
                }
                return new bgo();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
