package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgf {
    public static final int a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f824b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 1;
    private static final /* synthetic */ int[] f = {a, f824b, c, d, e};

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "HKDF_SHA512" : "HKDF_SHA384" : "HKDF_SHA256" : "KDF_UNKNOWN" : "UNRECOGNIZED";
    }

    public static int b(int i) {
        if (i != e) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0;
                    }
                    return d;
                }
                return c;
            }
            return f824b;
        }
        return a;
    }

    public static int[] values$ar$edu$2d9d4195_0() {
        return new int[]{a, f824b, c, d, e};
    }
}
