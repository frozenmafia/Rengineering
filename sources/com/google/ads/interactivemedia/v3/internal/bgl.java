package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgl {
    public static final int a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f826b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 1;
    private static final /* synthetic */ int[] g = {a, f826b, c, d, e, f};

    public static int a(int i) {
        if (i != f) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i) {
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
            return f826b;
        }
        return a;
    }

    public static int[] values$ar$edu$3535e494_0() {
        return new int[]{a, f826b, c, d, e, f};
    }
}
