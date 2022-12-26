package com.google.ads.interactivemedia.v3.internal;

import android.graphics.PointF;
import android.os.Process;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import o.isFirst;
/* loaded from: classes4.dex */
public final class bbk {
    public static final int a;
    private static char[] ag$a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f787b;
    private static int toString = 0;
    private static char valueOf = 0;
    private static int values = 1;
    private final SecretKey c;
    private final boolean d;

    static {
        ag$a();
        a = bbt.f791b;
        f787b = new bbj();
        int i = values + 73;
        toString = i % 128;
        if (!(i % 2 != 0)) {
            return;
        }
        int i2 = 46 / 0;
    }

    public bbk(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (!bbt.a(a)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        bib.a(bArr.length);
        this.c = new SecretKeySpec(bArr, values((byte) (((Process.getThreadPriority(0) + 20) >> 6) + 6), new char[]{1, 2, 13775}, 3 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        this.d = z;
        int i = toString + 57;
        values = i % 128;
        if (!(i % 2 == 0)) {
            return;
        }
        int i2 = 43 / 0;
    }

    static void ag$a() {
        valueOf = (char) 2;
        ag$a = new char[]{13787, 13769, 13788, 13791};
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(byte[] r14, byte[] r15) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bbk.a(byte[], byte[]):byte[]");
    }

    private static String values(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = ag$a;
            char c = valueOf;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
