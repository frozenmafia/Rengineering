package o;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class doNotReactToLongPress implements endAnimation {
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$b = 0;
    private static char HaptikSDK$c = 0;
    private static int HaptikSDK$d = 1;
    private static final ThreadLocal<Cipher> ag$a;
    private static long ah$b;
    private static final ThreadLocal<Cipher> values;
    private final int ah$a;
    private final byte[] invoke;
    private final SecretKeySpec toString;
    private final byte[] valueOf;

    static void valueOf() {
        HaptikSDK$a = -1575748670;
        ah$b = 0L;
        HaptikSDK$c = (char) 0;
    }

    static {
        valueOf();
        ag$a = new ThreadLocal<Cipher>() { // from class: o.doNotReactToLongPress.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: values */
            public Cipher initialValue() {
                try {
                    return prepareForDrop.ah$a.ah$a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
        };
        values = new ThreadLocal<Cipher>() { // from class: o.doNotReactToLongPress.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: ah$a */
            public Cipher initialValue() {
                try {
                    return prepareForDrop.ah$a.ah$a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
        };
        int i = HaptikSDK$b + 45;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
    }

    public doNotReactToLongPress(byte[] bArr, int i) throws GeneralSecurityException {
        if (i != 12) {
            if (i != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            int i2 = HaptikSDK$b + 5;
            HaptikSDK$d = i2 % 128;
            int i3 = i2 % 2;
        }
        this.ah$a = i;
        fixLayoutEndGap.toString(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, valueOf((-1773113270) - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{19135, 20592, 39574, 55564}, new char[]{0, 0, 0, 0}, (char) (3227 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), new char[]{39830, 9507, 50551}).intern());
        this.toString = secretKeySpec;
        Cipher cipher = ag$a.get();
        cipher.init(1, secretKeySpec);
        byte[] ah$a = ah$a(cipher.doFinal(new byte[16]));
        this.valueOf = ah$a;
        this.invoke = ah$a(ah$a);
        int i4 = HaptikSDK$b + 61;
        HaptikSDK$d = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    private static byte[] toString(byte[] bArr, byte[] bArr2) {
        int i = HaptikSDK$d + 69;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i3 = HaptikSDK$d + 101;
        HaptikSDK$b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                return bArr3;
            }
            bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
            i5++;
        }
    }

    private static byte[] ah$a(byte[] bArr) {
        byte[] bArr2;
        int i;
        int i2 = HaptikSDK$d + 77;
        HaptikSDK$b = i2 % 128;
        if (i2 % 2 != 0) {
            bArr2 = new byte[34];
            i = 1;
        } else {
            bArr2 = new byte[16];
            i = 0;
        }
        while (true) {
            if ((i < 15 ? (char) 15 : (char) 6) != 15) {
                break;
            }
            int i3 = HaptikSDK$d + 91;
            HaptikSDK$b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i5] & 255) >>> 7)) & 255);
            i = i5;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) == 0 ? 0 : 135));
        return bArr2;
    }

    private byte[] ag$a(byte[] bArr) {
        if (bArr.length != 16) {
            byte[] copyOf = Arrays.copyOf(this.invoke, 16);
            int i = 0;
            while (true) {
                if (i < bArr.length) {
                    int i2 = HaptikSDK$b + 41;
                    HaptikSDK$d = i2 % 128;
                    if (i2 % 2 == 0) {
                        copyOf[i] = (byte) (copyOf[i] | bArr[i]);
                        i += 125;
                    } else {
                        copyOf[i] = (byte) (copyOf[i] ^ bArr[i]);
                        i++;
                    }
                } else {
                    copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
                    return copyOf;
                }
            }
        } else {
            try {
                int i3 = HaptikSDK$b + 25;
                HaptikSDK$d = i3 % 128;
                if ((i3 % 2 == 0 ? (char) 28 : (char) 30) != 30) {
                    byte[] donotreacttolongpress = toString(bArr, this.valueOf);
                    Object obj = null;
                    super.hashCode();
                    return donotreacttolongpress;
                }
                try {
                    return toString(bArr, this.valueOf);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if ((r12 == 0) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r12 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        r8 = r8.doFinal(toString(r0, r7.valueOf));
        r9 = o.doNotReactToLongPress.HaptikSDK$d + 85;
        o.doNotReactToLongPress.HaptikSDK$b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        r9 = r8.doFinal(r0);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if ((r12 - r0) <= 16) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r4 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        return r8.doFinal(toString(r9, ag$a(java.util.Arrays.copyOfRange(r10, r0 + r11, r11 + r12))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        r4 = o.doNotReactToLongPress.HaptikSDK$d + 35;
        o.doNotReactToLongPress.HaptikSDK$b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        if ((r4 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
        if (r4 == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
        if (r4 >= 16) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
        r5 = o.doNotReactToLongPress.HaptikSDK$b + 117;
        o.doNotReactToLongPress.HaptikSDK$d = r5 % 128;
        r5 = r5 % 2;
        r9[r4] = (byte) (r9[r4] ^ r10[(r11 + r0) + r4]);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        r9 = r8.doFinal(r9);
        r0 = r0 + 16;
        r4 = o.doNotReactToLongPress.HaptikSDK$b + 25;
        o.doNotReactToLongPress.HaptikSDK$d = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] ag$a(javax.crypto.Cipher r8, int r9, byte[] r10, int r11, int r12) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        /*
            r7 = this;
            int r0 = o.doNotReactToLongPress.HaptikSDK$b
            int r0 = r0 + 45
            int r1 = r0 % 128
            o.doNotReactToLongPress.HaptikSDK$d = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            r3 = 16
            if (r0 == r2) goto L24
            byte[] r0 = new byte[r3]
            r4 = 15
            byte r9 = (byte) r9
            r0[r4] = r9
            if (r12 != 0) goto L20
            r9 = 1
            goto L21
        L20:
            r9 = 0
        L21:
            if (r9 == 0) goto L44
            goto L2f
        L24:
            r0 = 50
            byte[] r0 = new byte[r0]
            r4 = 22
            byte r9 = (byte) r9
            r0[r4] = r9
            if (r12 != 0) goto L44
        L2f:
            byte[] r9 = r7.valueOf
            byte[] r9 = toString(r0, r9)
            byte[] r8 = r8.doFinal(r9)
            int r9 = o.doNotReactToLongPress.HaptikSDK$d
            int r9 = r9 + 85
            int r10 = r9 % 128
            o.doNotReactToLongPress.HaptikSDK$b = r10
            int r9 = r9 % 2
            return r8
        L44:
            byte[] r9 = r8.doFinal(r0)
            r0 = 0
        L49:
            int r4 = r12 - r0
            if (r4 <= r3) goto L4f
            r4 = 0
            goto L50
        L4f:
            r4 = 1
        L50:
            if (r4 == 0) goto L69
            int r0 = r0 + r11
            int r11 = r11 + r12
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r0, r11)     // Catch: java.lang.Exception -> L67
            byte[] r10 = r7.ag$a(r10)
            byte[] r9 = toString(r9, r10)     // Catch: java.lang.Exception -> L65
            byte[] r8 = r8.doFinal(r9)
            return r8
        L65:
            r8 = move-exception
            goto La8
        L67:
            r8 = move-exception
            throw r8
        L69:
            int r4 = o.doNotReactToLongPress.HaptikSDK$d
            int r4 = r4 + 35
            int r5 = r4 % 128
            o.doNotReactToLongPress.HaptikSDK$b = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L77
            r4 = 0
            goto L78
        L77:
            r4 = 1
        L78:
            if (r4 == r2) goto L7c
            r4 = 1
            goto L7d
        L7c:
            r4 = 0
        L7d:
            if (r4 >= r3) goto L97
            int r5 = o.doNotReactToLongPress.HaptikSDK$b
            int r5 = r5 + 117
            int r6 = r5 % 128
            o.doNotReactToLongPress.HaptikSDK$d = r6
            int r5 = r5 % 2
            r5 = r9[r4]
            int r6 = r11 + r0
            int r6 = r6 + r4
            r6 = r10[r6]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r9[r4] = r5
            int r4 = r4 + 1
            goto L7d
        L97:
            byte[] r9 = r8.doFinal(r9)     // Catch: java.lang.Exception -> L65
            int r0 = r0 + 16
            int r4 = o.doNotReactToLongPress.HaptikSDK$b     // Catch: java.lang.Exception -> L65
            int r4 = r4 + 25
            int r5 = r4 % 128
            o.doNotReactToLongPress.HaptikSDK$d = r5     // Catch: java.lang.Exception -> L65
            int r4 = r4 % 2
            goto L49
        La8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.doNotReactToLongPress.ag$a(javax.crypto.Cipher, int, byte[], int, int):byte[]");
    }

    @Override // o.endAnimation
    public byte[] ah$a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        int i = this.ah$a;
        if ((length <= (Integer.MAX_VALUE - i) - 16 ? '.' : '>') != '.') {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i2 = HaptikSDK$d + 7;
        HaptikSDK$b = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr4 = new byte[bArr.length + i + 16];
        byte[] ah$a = LinearLayoutManager.ah$a(i);
        int i4 = 0;
        System.arraycopy(ah$a, 0, bArr4, 0, this.ah$a);
        Cipher cipher = ag$a.get();
        cipher.init(1, this.toString);
        byte[] ag$a2 = ag$a(cipher, 0, ah$a, 0, ah$a.length);
        if ((bArr2 == null ? '#' : 'X') != '#') {
            bArr3 = bArr2;
        } else {
            int i5 = HaptikSDK$b + 109;
            HaptikSDK$d = i5 % 128;
            bArr3 = i5 % 2 == 0 ? new byte[1] : new byte[0];
        }
        byte[] ag$a3 = ag$a(cipher, 1, bArr3, 0, bArr3.length);
        Cipher cipher2 = values.get();
        cipher2.init(1, this.toString, new IvParameterSpec(ag$a2));
        cipher2.doFinal(bArr, 0, bArr.length, bArr4, this.ah$a);
        byte[] ag$a4 = ag$a(cipher, 2, bArr4, this.ah$a, bArr.length);
        int length2 = bArr.length;
        int i6 = this.ah$a;
        while (true) {
            if ((i4 < 16 ? (char) 23 : (char) 7) != 23) {
                return bArr4;
            }
            int i7 = HaptikSDK$d + 83;
            HaptikSDK$b = i7 % 128;
            if (i7 % 2 != 0) {
                bArr4[(length2 * i6) << i4] = (byte) ((ag$a3[i4] ^ ag$a2[i4]) & ag$a4[i4]);
                i4 += 5;
            } else {
                bArr4[length2 + i6 + i4] = (byte) ((ag$a3[i4] ^ ag$a2[i4]) ^ ag$a4[i4]);
                i4++;
            }
        }
    }

    @Override // o.endAnimation
    public byte[] values(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = (bArr.length - this.ah$a) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            int i = HaptikSDK$d + 117;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            Cipher cipher = ag$a.get();
            cipher.init(1, this.toString);
            byte[] ag$a2 = ag$a(cipher, 0, bArr, 0, this.ah$a);
            if (!(bArr2 != null)) {
                int i3 = HaptikSDK$d + 117;
                HaptikSDK$b = i3 % 128;
                int i4 = i3 % 2;
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] ag$a3 = ag$a(cipher, 1, bArr3, 0, bArr3.length);
            byte[] ag$a4 = ag$a(cipher, 2, bArr, this.ah$a, length);
            int length2 = bArr.length;
            int i5 = 0;
            byte b2 = 0;
            while (i5 < 16) {
                int i6 = HaptikSDK$b + 53;
                HaptikSDK$d = i6 % 128;
                if (!(i6 % 2 == 0)) {
                    b2 = (byte) (b2 | (((bArr[(length2 - 16) + i5] ^ ag$a3[i5]) ^ ag$a2[i5]) ^ ag$a4[i5]));
                    i5++;
                } else {
                    b2 = (byte) (b2 | (((bArr[(length2 - 83) + i5] | ag$a3[i5]) | ag$a2[i5]) ^ ag$a4[i5]));
                    i5 += 33;
                }
            }
            if (b2 != 0) {
                throw new AEADBadTagException("tag mismatch");
            }
            try {
                Cipher cipher2 = values.get();
                cipher2.init(1, this.toString, new IvParameterSpec(ag$a2));
                return cipher2.doFinal(bArr, this.ah$a, length);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String valueOf(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$b) ^ HaptikSDK$a) ^ HaptikSDK$c);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
