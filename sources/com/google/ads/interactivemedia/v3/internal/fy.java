package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final /* synthetic */ class fy {
    public static final eq a(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        return new eq(0.97f, 1.03f, 1000L, 1.0E-7f, j2, j3, 0.999f);
    }

    public static int b(int i) {
        return c(i, 0, 0);
    }

    public static int c(int i, int i2, int i3) {
        return d(i, i2, i3, 0, 128);
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        return i | i2 | i3 | i4 | i5;
    }

    public static int e(int i) {
        return i & 128;
    }

    public static int f(int i) {
        return i & 7;
    }

    public static int g(int i) {
        return i & 64;
    }

    public static int h(zz zzVar, k kVar, int i, boolean z) throws IOException {
        return zzVar.h(kVar, i, z);
    }

    public static void i(zz zzVar, ci ciVar, int i) {
        zzVar.i(ciVar, i);
    }

    public static List j(byte[] bArr) {
        byte b2 = bArr[11];
        byte b3 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(o(n(((b2 & 255) << 8) | (b3 & 255))));
        arrayList.add(o(n(3840L)));
        return arrayList;
    }

    public static void k(boolean z, String str) throws as {
        if (!z) {
            throw as.a(str, null);
        }
    }

    public static void l(long j, ci ciVar, zz[] zzVarArr) {
        int i;
        while (true) {
            if (ciVar.a() <= 1) {
                return;
            }
            int p = p(ciVar);
            int p2 = p(ciVar);
            int c = ciVar.c() + p2;
            if (p2 == -1 || p2 > ciVar.a()) {
                cc.e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                c = ciVar.d();
            } else if (p == 4 && p2 >= 8) {
                int i2 = ciVar.i();
                int m = ciVar.m();
                if (m == 49) {
                    i = ciVar.e();
                    m = 49;
                } else {
                    i = 0;
                }
                int i3 = ciVar.i();
                if (m == 47) {
                    ciVar.G(1);
                }
                boolean z = i2 == 181 && (m == 49 || m == 47) && i3 == 3;
                if (m == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    m(j, ciVar, zzVarArr);
                }
            }
            ciVar.F(c);
        }
    }

    public static void m(long j, ci ciVar, zz[] zzVarArr) {
        int i = ciVar.i();
        if ((i & 64) != 0) {
            ciVar.G(1);
            int i2 = (i & 31) * 3;
            int c = ciVar.c();
            for (zz zzVar : zzVarArr) {
                ciVar.F(c);
                zzVar.e(ciVar, i2);
                if (j != C.TIME_UNSET) {
                    zzVar.f(j, 1, i2, 0, null);
                }
            }
        }
    }

    private static long n(long j) {
        return (j * C.NANOS_PER_SECOND) / 48000;
    }

    private static byte[] o(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static int p(ci ciVar) {
        int i = 0;
        while (ciVar.a() != 0) {
            int i2 = ciVar.i();
            i += i2;
            if (i2 != 255) {
                return i;
            }
        }
        return -1;
    }
}
