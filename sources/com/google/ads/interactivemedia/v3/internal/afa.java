package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class afa extends bpk implements bqr {
    private static final afa a;
    private int e;
    private int f;
    private boolean i;
    private boolean g = true;
    private String h = "unknown_host";
    private boolean j = true;

    static {
        afa afaVar = new afa();
        a = afaVar;
        bpk.aI(afa.class, afaVar);
    }

    private afa() {
    }

    public static /* synthetic */ afa a() {
        return a;
    }

    public static /* synthetic */ void f(afa afaVar) {
        afaVar.e |= 16;
        afaVar.j = false;
    }

    public static /* synthetic */ void g(afa afaVar) {
        afaVar.e |= 4;
        afaVar.h = "a.3.28.2";
    }

    public static /* synthetic */ void h(afa afaVar) {
        afaVar.e |= 8;
        afaVar.i = false;
    }

    public static /* synthetic */ void k(afa afaVar, int i) {
        afaVar.f = afb.b(i);
        afaVar.e |= 1;
    }

    public static afg l() {
        return (afg) a.ay();
    }

    public final String b() {
        return this.h;
    }

    public final boolean c() {
        return this.i;
    }

    public final boolean d() {
        return this.j;
    }

    public final boolean e() {
        return this.g;
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
                    return new afg(null, null, null);
                }
                return new afa();
            }
            return aH(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"e", "f", afb.a(), "g", "h", "i", "j"});
        }
        return (byte) 1;
    }

    public final int j() {
        int c = afb.c(this.f);
        return c == 0 ? afb.a : c;
    }
}
