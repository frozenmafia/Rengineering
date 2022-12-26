package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class apb extends bpk implements bqr {
    private static final apb a;
    private int e;
    private String f = "";
    private String g = "";
    private long h;
    private long i;
    private long j;

    static {
        apb apbVar = new apb();
        a = apbVar;
        bpk.aI(apb.class, apbVar);
    }

    private apb() {
    }

    public static apa d() {
        return (apa) a.ay();
    }

    public static apb f() {
        return a;
    }

    public static apb g(bnz bnzVar) throws bpt {
        return (apb) bpk.aA(a, bnzVar);
    }

    public static apb h(bnz bnzVar, boy boyVar) throws bpt {
        return (apb) bpk.aB(a, bnzVar, boyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void l(apb apbVar, String str) {
        str.getClass();
        apbVar.e |= 1;
        apbVar.f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void m(apb apbVar, long j) {
        apbVar.e |= 16;
        apbVar.j = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void n(apb apbVar, String str) {
        str.getClass();
        apbVar.e |= 2;
        apbVar.g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void o(apb apbVar, long j) {
        apbVar.e |= 4;
        apbVar.h = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p(apb apbVar, long j) {
        apbVar.e |= 8;
        apbVar.i = j;
    }

    public final long a() {
        return this.i;
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.j;
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
                    return new apa(null);
                }
                return new apb();
            }
            return aH(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"e", "f", "g", "h", "i", "j"});
        }
        return (byte) 1;
    }

    public final String j() {
        return this.g;
    }

    public final String k() {
        return this.f;
    }
}
