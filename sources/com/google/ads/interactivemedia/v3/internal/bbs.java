package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewConfiguration;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.moveToFirst;
/* loaded from: classes4.dex */
public final class bbs implements azb {
    private static final ThreadLocal a;
    private static char ag$a = 0;
    private static char ah$a = 0;
    private static int invoke = 1;
    private static char toString;
    private static char valueOf;
    private static int values;

    /* renamed from: b  reason: collision with root package name */
    private final SecretKey f790b;

    static {
        try {
            values();
            try {
                a = new bbr();
                int i = invoke + 107;
                values = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public bbs(byte[] bArr) throws GeneralSecurityException {
        bib.a(bArr.length);
        this.f790b = new SecretKeySpec(bArr, ag$a(new char[]{31170, 16162, 61172, 5395}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3).intern());
    }

    static void values() {
        ag$a = (char) 63256;
        toString = (char) 44467;
        ah$a = (char) 30360;
        valueOf = (char) 44997;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azb
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        int i = values + 65;
        invoke = i % 128;
        int i2 = i % 2;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] b2 = bia.b(12);
            System.arraycopy(b2, 0, bArr3, 0, 12);
            int length2 = b2.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                ivParameterSpec = new GCMParameterSpec(128, b2, 0, length2);
            } catch (ClassNotFoundException unused) {
                if (bic.d()) {
                    ivParameterSpec = new IvParameterSpec(b2, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal threadLocal = a;
            ((Cipher) threadLocal.get()).init(1, this.f790b, ivParameterSpec);
            int length3 = bArr.length;
            int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length3, bArr3, 12);
            if (doFinal == length3 + 16) {
                int i3 = invoke + 7;
                values = i3 % 128;
                int i4 = i3 % 2;
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length3)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + toString)) ^ ((cArr3[0] >>> 5) + ah$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + valueOf)) ^ ((cArr3[1] >>> 5) + ag$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
