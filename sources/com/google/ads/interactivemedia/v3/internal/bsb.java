package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bsb {
    static final long a;

    /* renamed from: b  reason: collision with root package name */
    static final boolean f964b;
    private static final Unsafe c;
    private static final Class d;
    private static final boolean e;
    private static final boolean f;
    private static final bsa g;
    private static final boolean h;
    private static final boolean i;
    private static final long j;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            sun.misc.Unsafe r5 = j()
            com.google.ads.interactivemedia.v3.internal.bsb.c = r5
            java.lang.Class r6 = com.google.ads.interactivemedia.v3.internal.bnl.a()
            com.google.ads.interactivemedia.v3.internal.bsb.d = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = z(r6)
            com.google.ads.interactivemedia.v3.internal.bsb.e = r6
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r7 = z(r7)
            com.google.ads.interactivemedia.v3.internal.bsb.f = r7
            if (r5 != 0) goto L29
            goto L39
        L29:
            if (r6 == 0) goto L31
            com.google.ads.interactivemedia.v3.internal.brz r6 = new com.google.ads.interactivemedia.v3.internal.brz
            r6.<init>(r5)
            goto L3a
        L31:
            if (r7 == 0) goto L39
            com.google.ads.interactivemedia.v3.internal.bry r6 = new com.google.ads.interactivemedia.v3.internal.bry
            r6.<init>(r5)
            goto L3a
        L39:
            r6 = 0
        L3a:
            com.google.ads.interactivemedia.v3.internal.bsb.g = r6
            r5 = 0
            if (r6 != 0) goto L41
            r7 = 0
            goto L45
        L41:
            boolean r7 = r6.t()
        L45:
            com.google.ads.interactivemedia.v3.internal.bsb.h = r7
            if (r6 != 0) goto L4b
            r7 = 0
            goto L4f
        L4b:
            boolean r7 = r6.s()
        L4f:
            com.google.ads.interactivemedia.v3.internal.bsb.i = r7
            java.lang.Class<byte[]> r7 = byte[].class
            int r7 = F(r7)
            long r7 = (long) r7
            com.google.ads.interactivemedia.v3.internal.bsb.a = r7
            F(r4)
            K(r4)
            F(r3)
            K(r3)
            F(r2)
            K(r2)
            F(r1)
            K(r1)
            F(r0)
            K(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            F(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            K(r0)
            java.lang.reflect.Field r0 = G()
            r1 = -1
            if (r0 == 0) goto L91
            if (r6 != 0) goto L8d
            goto L91
        L8d:
            long r1 = r6.n(r0)
        L91:
            com.google.ads.interactivemedia.v3.internal.bsb.j = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L9c
            r5 = 1
        L9c:
            com.google.ads.interactivemedia.v3.internal.bsb.f964b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bsb.<clinit>():void");
    }

    private bsb() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean A(Object obj, long j2) {
        return g.i(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B() {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C() {
        return h;
    }

    private static byte D(Object obj, long j2) {
        return (byte) ((d(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    private static byte E(Object obj, long j2) {
        return (byte) ((d(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    private static int F(Class cls) {
        if (i) {
            return g.j(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field G() {
        int i2 = bnl.a;
        Field H = H(Buffer.class, "effectiveDirectAddress");
        if (H == null) {
            Field H2 = H(Buffer.class, "address");
            if (H2 == null || H2.getType() != Long.TYPE) {
                return null;
            }
            return H2;
        }
        return H;
    }

    private static Field H(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((~((int) j2)) & 3) << 3;
        int i3 = (b2 & 255) << i2;
        u(obj, j3, ((~(255 << i2)) & d(obj, j3)) | i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        int i3 = (b2 & 255) << i2;
        u(obj, j3, ((~(255 << i2)) & d(obj, j3)) | i3);
    }

    private static void K(Class cls) {
        if (i) {
            g.k(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(long j2) {
        return g.a(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double b(Object obj, long j2) {
        return g.b(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(Object obj, long j2) {
        return g.c(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Object obj, long j2) {
        return g.l(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(ByteBuffer byteBuffer) {
        return g.m(byteBuffer, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long f(Object obj, long j2) {
        return g.m(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object g(Class cls) {
        try {
            return c.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Object obj, long j2) {
        return g.o(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new brx());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void p(long j2, byte[] bArr, long j3, long j4) {
        g.d(j2, bArr, j3, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void q(Object obj, long j2, boolean z) {
        g.e(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(byte[] bArr, long j2, byte b2) {
        g.f(bArr, a + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(Object obj, long j2, double d2) {
        g.g(obj, j2, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(Object obj, long j2, float f2) {
        g.h(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(Object obj, long j2, int i2) {
        g.p(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(Object obj, long j2, long j3) {
        g.q(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Object obj, long j2, Object obj2) {
        g.r(obj, j2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean x(Object obj, long j2) {
        return D(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean y(Object obj, long j2) {
        return E(obj, j2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean z(Class cls) {
        int i2 = bnl.a;
        try {
            Class cls2 = d;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
