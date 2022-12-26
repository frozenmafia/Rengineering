package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgg {
    public static final int a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f825b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 1;
    private static final /* synthetic */ int[] g = {a, f825b, c, d, e, f};

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "UNRECOGNIZED";
            case 2:
                return "KEM_UNKNOWN";
            case 3:
                return "DHKEM_X25519_HKDF_SHA256";
            case 4:
                return "DHKEM_P256_HKDF_SHA256";
            case 5:
                return "DHKEM_P384_HKDF_SHA384";
            case 6:
                return "DHKEM_P521_HKDF_SHA512";
            default:
                return "null";
        }
    }

    public static int b(int i) {
        if (i != f) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return 0;
                        }
                        return e;
                    }
                    return d;
                }
                return c;
            }
            return f825b;
        }
        return a;
    }

    public static int[] values$ar$edu$969b5a7a_0() {
        return new int[]{a, f825b, c, d, e, f};
    }
}
