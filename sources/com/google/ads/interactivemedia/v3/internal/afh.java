package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class afh extends bpk implements bqr {
    private static final afh a;
    private int e;
    private afi f;
    private afk g;

    static {
        afh afhVar = new afh();
        a = afhVar;
        bpk.aI(afh.class, afhVar);
    }

    private afh() {
    }

    public static /* synthetic */ afh a() {
        return a;
    }

    public static afh b(byte[] bArr, boy boyVar) throws bpt {
        return (afh) bpk.aC(a, bArr, boyVar);
    }

    public final afi c() {
        afi afiVar = this.f;
        return afiVar == null ? afi.b() : afiVar;
    }

    public final afk d() {
        afk afkVar = this.g;
        return afkVar == null ? afk.b() : afkVar;
    }

    public final boolean e() {
        return (this.e & 1) != 0;
    }

    public final boolean f() {
        return (this.e & 2) != 0;
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
                    return new afg(null);
                }
                return new afh();
            }
            return aH(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
