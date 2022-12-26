package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.isAfterLast;
/* loaded from: classes4.dex */
final class oi implements cx {
    private static int toString = 0;
    private static int valueOf = 1;
    private static int values = 63;
    private final cx a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f1194b;
    private final byte[] c;
    private CipherInputStream d;

    public oi(cx cxVar, byte[] bArr, byte[] bArr2) {
        try {
            this.a = cxVar;
            try {
                this.f1194b = bArr;
                this.c = bArr2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        af.s(this.d);
        int read = this.d.read(bArr, i, i2);
        if ((read < 0 ? '@' : 'B') != '@') {
            return read;
        }
        try {
            int i3 = toString + 101;
            valueOf = i3 % 128;
            if ((i3 % 2 == 0 ? 'O' : 'a') != 'a') {
                Object obj = null;
                super.hashCode();
            }
            int i4 = toString + 109;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            return -1;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final long b(db dbVar) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f1194b, values((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 134, false, 3 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{11, 65529, 65533}).intern()), new IvParameterSpec(this.c));
                cz czVar = new cz(this.a, dbVar);
                this.d = new CipherInputStream(czVar, cipher);
                czVar.a();
                int i = toString + 93;
                valueOf = i % 128;
                int i2 = i % 2;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Uri c() {
        Uri c;
        int i = valueOf + 123;
        toString = i % 128;
        if (i % 2 != 0) {
            c = this.a.c();
            Object obj = null;
            super.hashCode();
        } else {
            try {
                c = this.a.c();
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = valueOf + 67;
        toString = i2 % 128;
        int i3 = i2 % 2;
        return c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void d() throws IOException {
        int i = valueOf + 79;
        toString = i % 128;
        int i2 = i % 2;
        try {
            if ((this.d != null ? (char) 31 : (char) 5) == 31) {
                this.d = null;
                this.a.d();
            }
            int i3 = toString + 57;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Map e() {
        int i = valueOf + 97;
        toString = i % 128;
        int i2 = i % 2;
        try {
            Map e = this.a.e();
            int i3 = toString + 71;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return e;
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void f(dv dvVar) {
        int i = toString + 119;
        valueOf = i % 128;
        if ((i % 2 == 0 ? '#' : '6') != '#') {
            try {
                af.s(dvVar);
                try {
                    this.a.f(dvVar);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            af.s(dvVar);
            this.a.f(dvVar);
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = valueOf + 105;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    private static String values(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - values);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
