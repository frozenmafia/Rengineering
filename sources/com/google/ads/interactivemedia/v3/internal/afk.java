package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class afk extends bpk implements bqr {
    private static final afk a;
    private int e;
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private String k = "";

    static {
        afk afkVar = new afk();
        a = afkVar;
        bpk.aI(afk.class, afkVar);
    }

    private afk() {
    }

    public static /* synthetic */ afk a() {
        return a;
    }

    public static afk b() {
        return a;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.k;
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
                    return new afg((byte[]) null, (short[]) null);
                }
                return new afk();
            }
            return aH(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"e", "f", "g", "h", "i", "j", "k"});
        }
        return (byte) 1;
    }
}
