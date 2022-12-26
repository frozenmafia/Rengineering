package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class bpr {
    static final Charset a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f934b;
    public static final ByteBuffer c;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f934b = bArr;
        c = ByteBuffer.wrap(bArr);
        int i = bod.e;
        bod.H(bArr, 0, 0, false);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d = d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    public static int c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(Object obj, Object obj2) {
        return ((bqq) obj).bo().aS((bqq) obj2).aY();
    }

    public static String f(byte[] bArr) {
        return new String(bArr, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(bqq bqqVar) {
        if (bqqVar instanceof bnj) {
            bnj bnjVar = (bnj) bqqVar;
            throw null;
        }
        return false;
    }

    public static boolean h(byte[] bArr) {
        return bsf.i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }
}
