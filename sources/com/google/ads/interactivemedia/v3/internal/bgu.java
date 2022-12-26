package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgu extends bpk implements bqr {
    private static final bgu a;
    private int e;
    private bgv f;

    static {
        bgu bguVar = new bgu();
        a = bguVar;
        bpk.aI(bgu.class, bguVar);
    }

    private bgu() {
    }

    public static /* synthetic */ bgu b() {
        return a;
    }

    public static bgu c(bnz bnzVar, boy boyVar) throws bpt {
        return (bgu) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void e(bgu bguVar, bgv bgvVar) {
        bgvVar.getClass();
        bguVar.f = bgvVar;
    }

    public static /* synthetic */ void f(bgu bguVar) {
        bguVar.e = 0;
    }

    public static bha g() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bgv d() {
        bgv bgvVar = this.f;
        return bgvVar == null ? bgv.b() : bgvVar;
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
                    return new bha((byte[]) null, (byte[]) null, (byte[]) null);
                }
                return new bgu();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
