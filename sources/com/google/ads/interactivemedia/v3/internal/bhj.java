package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewConfiguration;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.moveToFirst;
/* loaded from: classes4.dex */
public final class bhj implements aze {
    private static int HaptikSDK$c = 1;
    public static final int a;
    private static char ag$a;
    private static char ah$a;

    /* renamed from: b  reason: collision with root package name */
    private static final Collection f834b;
    private static final byte[] c;
    private static int toString;
    private static char valueOf;
    private static char values;
    private final bhv d;
    private final byte[] e;

    static {
        try {
            valueOf();
            try {
                a = bbt.a;
                f834b = Arrays.asList(64);
                c = new byte[16];
                int i = HaptikSDK$c + 61;
                toString = i % 128;
                if ((i % 2 != 0 ? (char) 27 : '=') != '=') {
                    int i2 = 24 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public bhj(byte[] bArr) throws GeneralSecurityException {
        if (bbt.a(a)) {
            Collection collection = f834b;
            int length = bArr.length;
            if (!collection.contains(Integer.valueOf(length))) {
                throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
            }
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.e = Arrays.copyOfRange(bArr, i, length);
            this.d = new bhv(copyOfRange);
            int i2 = HaptikSDK$c + 85;
            toString = i2 % 128;
            if (!(i2 % 2 != 0)) {
                return;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    static void valueOf() {
        values = (char) 43273;
        ag$a = (char) 14376;
        valueOf = (char) 61090;
        ah$a = (char) 33697;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aze
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] z;
        int i = HaptikSDK$c + 125;
        toString = i % 128;
        int i2 = i % 2;
        if (!(bArr.length > 2147483631)) {
            Cipher cipher = (Cipher) bhq.a.a("AES/CTR/NoPadding");
            byte[][] bArr3 = {bArr2, bArr};
            byte[] a2 = this.d.a(c, 16);
            int i3 = 0;
            while (true) {
                if (i3 > 0) {
                    break;
                }
                byte[] bArr4 = bArr3[i3];
                if (bArr4 == null) {
                    bArr4 = new byte[0];
                }
                a2 = bic.z(bic.C(a2), this.d.a(bArr4, 16));
                i3++;
            }
            byte[] bArr5 = bArr3[1];
            int length = bArr5.length;
            if (length >= 16) {
                int length2 = a2.length;
                if (length < length2) {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
                int i4 = HaptikSDK$c + 41;
                toString = i4 % 128;
                int i5 = i4 % 2;
                z = Arrays.copyOf(bArr5, length);
                int i6 = toString + 1;
                HaptikSDK$c = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 0;
                while (true) {
                    if (!(i8 < a2.length)) {
                        break;
                    }
                    int i9 = HaptikSDK$c + 95;
                    toString = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = (length - length2) + i8;
                    z[i11] = (byte) (z[i11] ^ a2[i8]);
                    i8++;
                }
            } else {
                z = bic.z(bic.B(bArr5), bic.C(a2));
            }
            byte[] a3 = this.d.a(z, 16);
            byte[] bArr6 = (byte[]) a3.clone();
            bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
            bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.e, values(new char[]{6284, 41226, 50533, 6678}, 3 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()), new IvParameterSpec(bArr6));
            return bic.y(a3, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    private static String values(char[] cArr, int i) {
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ag$a)) ^ ((cArr3[0] >>> 5) + valueOf)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ah$a)) ^ ((cArr3[1] >>> 5) + values)));
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
