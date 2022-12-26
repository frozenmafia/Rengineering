package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.isAfterLast;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class bhh implements azb {
    public static final int a;
    private static int ag$a = 0;
    private static int ah$a = 1;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f832b;
    private static final ThreadLocal c;
    private static int values;
    private final byte[] d;
    private final byte[] e;
    private final SecretKeySpec f;
    private final int g;

    static {
        try {
            values = 121;
            try {
                a = bbt.a;
                f832b = new bhf();
                c = new bhg();
                int i = ag$a + 37;
                ah$a = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                int i2 = 36 / 0;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public bhh(byte[] bArr, int i) throws GeneralSecurityException {
        if (!bbt.a(a)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12) {
            if (i != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            int i2 = ah$a + 59;
            ag$a = i2 % 128;
            int i3 = i2 % 2;
        }
        this.g = i;
        bib.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, toString((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2, (ViewConfiguration.getPressedStateDuration() >> 16) + 193, true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, new char[]{11, 65533, 65529}).intern());
        this.f = secretKeySpec;
        Cipher cipher = (Cipher) f832b.get();
        cipher.init(1, secretKeySpec);
        byte[] b2 = b(cipher.doFinal(new byte[16]));
        this.d = b2;
        this.e = b(b2);
        int i4 = ah$a + 19;
        ag$a = i4 % 128;
        if ((i4 % 2 != 0 ? '$' : 'Q') != '$') {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    private final byte[] c(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if ((i3 == 0 ? (char) 5 : 'F') != 'F') {
            byte[] doFinal = cipher.doFinal(d(bArr3, this.d));
            int i4 = ag$a + 15;
            ah$a = i4 % 128;
            int i5 = i4 % 2;
            return doFinal;
        }
        byte[] doFinal2 = cipher.doFinal(bArr3);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if ((i3 - i7 > 16 ? 'C' : '2') != 'C') {
                break;
            }
            int i8 = ah$a + 111;
            ag$a = i8 % 128;
            if (i8 % 2 != 0) {
            }
            int i9 = 0;
            while (i9 < 16) {
                int i10 = ah$a + 91;
                ag$a = i10 % 128;
                if ((i10 % 2 != 0 ? (char) 19 : '*') != '*') {
                    doFinal2[i9] = (byte) (doFinal2[i9] ^ bArr[(i2 / i7) / i9]);
                    i9 += 61;
                } else {
                    doFinal2[i9] = (byte) (doFinal2[i9] ^ bArr[(i2 + i7) + i9]);
                    i9++;
                }
            }
            doFinal2 = cipher.doFinal(doFinal2);
            i7 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7 + i2, i2 + i3);
        if ((copyOfRange.length == 16 ? (char) 22 : TokenParser.ESCAPE) != '\\') {
            int i11 = ag$a + 69;
            ah$a = i11 % 128;
            int i12 = i11 % 2;
            bArr2 = d(copyOfRange, this.d);
        } else {
            byte[] copyOf = Arrays.copyOf(this.e, 16);
            while (true) {
                length = copyOfRange.length;
                if (i6 >= length) {
                    break;
                }
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
                i6++;
                int i13 = ah$a + 7;
                ag$a = i13 % 128;
                int i14 = i13 % 2;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(d(doFinal2, bArr2));
    }

    private static byte[] b(byte[] bArr) {
        int i;
        int i2 = ah$a + 23;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr2 = new byte[16];
        int i4 = 0;
        while (true) {
            if ((i4 < 15 ? ']' : '<') != '<') {
                int i5 = ag$a + 59;
                ah$a = i5 % 128;
                if ((i5 % 2 == 0 ? TokenParser.ESCAPE : (char) 7) != 7) {
                    byte b2 = bArr[i4];
                    i = i4 / 0;
                    bArr2[i4] = (byte) (((b2 + b2) & ((bArr[i] | 9690) >>> 69)) ^ 22464);
                } else {
                    byte b3 = bArr[i4];
                    i = i4 + 1;
                    bArr2[i4] = (byte) (((b3 + b3) ^ ((bArr[i] & 255) >>> 7)) & 255);
                }
                i4 = i;
            } else {
                byte b4 = bArr[15];
                bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b4 + b4));
                return bArr2;
            }
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        int i = ag$a + 55;
        ah$a = i % 128;
        int i2 = i % 2;
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i3 = 0;
        int i4 = ag$a + 93;
        ah$a = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            if ((i3 < length ? 'C' : TokenParser.SP) != 'C') {
                return bArr3;
            }
            int i6 = ah$a + 79;
            ag$a = i6 % 128;
            if ((i6 % 2 != 0 ? 'Y' : (char) 24) != 'Y') {
                bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
                i3++;
            } else {
                bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
                i3 += 108;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azb
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = ag$a + 21;
        ah$a = i % 128;
        int i2 = i % 2;
        int length = bArr.length;
        int i3 = this.g;
        if (length > (Integer.MAX_VALUE - i3) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i3 + length + 16];
        byte[] b2 = bia.b(i3);
        System.arraycopy(b2, 0, bArr3, 0, this.g);
        Cipher cipher = (Cipher) f832b.get();
        cipher.init(1, this.f);
        byte[] c2 = c(cipher, 0, b2, 0, b2.length);
        byte[] c3 = c(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = (Cipher) c.get();
        cipher2.init(1, this.f, new IvParameterSpec(c2));
        cipher2.doFinal(bArr, 0, length, bArr3, this.g);
        byte[] c4 = c(cipher, 2, bArr3, this.g, length);
        int i4 = this.g;
        int i5 = 0;
        while (true) {
            if (i5 >= 16) {
                return bArr3;
            }
            bArr3[length + i4 + i5] = (byte) ((c3[i5] ^ c2[i5]) ^ c4[i5]);
            i5++;
            int i6 = ah$a + 109;
            ag$a = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static String toString(int i, int i2, boolean z, int i3, char[] cArr) {
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
