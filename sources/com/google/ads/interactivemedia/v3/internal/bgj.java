package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgj extends bpk implements bqr {
    private static final bgj a;
    private int e;
    private bgk f;
    private bnz g = bnz.f907b;

    static {
        bgj bgjVar = new bgj();
        a = bgjVar;
        bpk.aI(bgj.class, bgjVar);
    }

    private bgj() {
    }

    public static bgj c(bnz bnzVar, boy boyVar) throws bpt {
        return (bgj) bpk.aB(a, bnzVar, boyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f(bgj bgjVar, bgk bgkVar) {
        bgkVar.getClass();
        bgjVar.f = bgkVar;
    }

    public static bha k() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bgk d() {
        bgk bgkVar = this.f;
        return bgkVar == null ? bgk.d() : bgkVar;
    }

    public final bnz e() {
        return this.g;
    }

    public final boolean h() {
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
                    return new bha((byte[]) null, (char[]) null, (char[]) null);
                }
                return new bgj();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
