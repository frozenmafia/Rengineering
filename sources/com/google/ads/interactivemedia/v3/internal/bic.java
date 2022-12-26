package com.google.ads.interactivemedia.v3.internal;

import androidx.exifinterface.media.ExifInterface;
import com.dreampay.commons.constants.Constants;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyAgreement;
/* loaded from: classes4.dex */
public final class bic {
    public static final byte[] A(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] B(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        copyOf[length] = Byte.MIN_VALUE;
        return copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] C(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            byte b3 = (byte) ((b2 + b2) & 254);
            bArr2[i] = b3;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b3);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    private static ECParameterSpec D(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger(ExifInterface.GPS_MEASUREMENT_3D)), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        copyOf[0] = (byte) (copyOf[0] & 248);
        int i = copyOf[31] & Byte.MAX_VALUE;
        copyOf[31] = (byte) i;
        copyOf[31] = (byte) (i | 64);
        int i2 = bhl.f835b;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
        copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
        for (int i3 = 0; i3 < 7; i3++) {
            if (x(bhl.a[i3], copyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(String.valueOf(h(bhl.a[i3]))));
            }
        }
        long[] k = bht.k(copyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        System.arraycopy(k, 0, jArr2, 0, 10);
        int i4 = 32;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = copyOf[(32 - i5) - 1] & 255;
            int i7 = 0;
            while (i7 < 8) {
                int i8 = (i6 >> (7 - i7)) & 1;
                bhl.a(jArr4, jArr2, i8);
                bhl.a(jArr5, jArr3, i8);
                byte[] bArr3 = copyOf;
                long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                int i9 = i6;
                long[] jArr10 = new long[19];
                long[] jArr11 = jArr;
                long[] jArr12 = new long[19];
                int i10 = i5;
                long[] jArr13 = new long[19];
                int i11 = i7;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                bht.i(jArr4, jArr4, jArr5);
                bht.h(jArr5, copyOf3, jArr5);
                long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                bht.i(jArr2, jArr2, jArr3);
                bht.h(jArr3, copyOf4, jArr3);
                bht.b(jArr14, jArr2, jArr5);
                bht.b(jArr15, jArr4, jArr3);
                bht.e(jArr14);
                bht.d(jArr14);
                bht.e(jArr15);
                bht.d(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                bht.i(jArr14, jArr14, jArr15);
                bht.h(jArr15, copyOf4, jArr15);
                bht.g(jArr18, jArr14);
                bht.g(jArr17, jArr15);
                bht.b(jArr15, jArr17, k);
                bht.e(jArr15);
                bht.d(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                bht.g(jArr12, jArr4);
                bht.g(jArr13, jArr5);
                bht.b(jArr8, jArr12, jArr13);
                bht.e(jArr8);
                bht.d(jArr8);
                bht.h(jArr13, jArr12, jArr13);
                long[] jArr20 = jArr3;
                Arrays.fill(jArr10, 10, 18, 0L);
                bht.f(jArr10, jArr13, 121665L);
                bht.d(jArr10);
                bht.i(jArr10, jArr10, jArr12);
                bht.b(jArr16, jArr13, jArr10);
                bht.e(jArr16);
                bht.d(jArr16);
                bhl.a(jArr8, jArr6, i8);
                bhl.a(jArr16, jArr7, i8);
                i7 = i11 + 1;
                jArr3 = jArr7;
                jArr7 = jArr20;
                jArr9 = jArr5;
                jArr2 = jArr6;
                i6 = i9;
                jArr = jArr11;
                i5 = i10;
                jArr6 = jArr19;
                jArr5 = jArr16;
                copyOf = bArr3;
                long[] jArr21 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr21;
            }
            i5++;
            i4 = 32;
            jArr9 = jArr9;
            copyOf = copyOf;
        }
        long[] jArr22 = jArr;
        long[] jArr23 = new long[10];
        long[] jArr24 = new long[10];
        long[] jArr25 = new long[10];
        long[] jArr26 = new long[10];
        long[] jArr27 = new long[10];
        long[] jArr28 = new long[10];
        long[] jArr29 = new long[10];
        long[] jArr30 = new long[10];
        long[] jArr31 = new long[10];
        long[] jArr32 = new long[10];
        long[] jArr33 = jArr2;
        long[] jArr34 = new long[10];
        bht.g(jArr24, jArr5);
        bht.g(jArr34, jArr24);
        bht.g(jArr32, jArr34);
        bht.a(jArr25, jArr32, jArr5);
        bht.a(jArr26, jArr25, jArr24);
        bht.g(jArr32, jArr26);
        bht.a(jArr27, jArr32, jArr25);
        bht.g(jArr32, jArr27);
        bht.g(jArr34, jArr32);
        bht.g(jArr32, jArr34);
        bht.g(jArr34, jArr32);
        bht.g(jArr32, jArr34);
        bht.a(jArr28, jArr32, jArr27);
        bht.g(jArr32, jArr28);
        bht.g(jArr34, jArr32);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            bht.g(jArr32, jArr34);
            bht.g(jArr34, jArr32);
        }
        bht.a(jArr29, jArr34, jArr28);
        bht.g(jArr32, jArr29);
        bht.g(jArr34, jArr32);
        for (int i13 = 2; i13 < 20; i13 += 2) {
            bht.g(jArr32, jArr34);
            bht.g(jArr34, jArr32);
        }
        bht.a(jArr32, jArr34, jArr29);
        bht.g(jArr34, jArr32);
        bht.g(jArr32, jArr34);
        for (int i14 = 2; i14 < 10; i14 += 2) {
            bht.g(jArr34, jArr32);
            bht.g(jArr32, jArr34);
        }
        bht.a(jArr30, jArr32, jArr28);
        bht.g(jArr32, jArr30);
        bht.g(jArr34, jArr32);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            bht.g(jArr32, jArr34);
            bht.g(jArr34, jArr32);
        }
        bht.a(jArr31, jArr34, jArr30);
        bht.g(jArr34, jArr31);
        bht.g(jArr32, jArr34);
        for (int i16 = 2; i16 < 100; i16 += 2) {
            bht.g(jArr34, jArr32);
            bht.g(jArr32, jArr34);
        }
        bht.a(jArr34, jArr32, jArr31);
        bht.g(jArr32, jArr34);
        bht.g(jArr34, jArr32);
        for (int i17 = 2; i17 < 50; i17 += 2) {
            bht.g(jArr32, jArr34);
            bht.g(jArr34, jArr32);
        }
        bht.a(jArr32, jArr34, jArr30);
        bht.g(jArr34, jArr32);
        bht.g(jArr32, jArr34);
        bht.g(jArr34, jArr32);
        bht.g(jArr32, jArr34);
        bht.g(jArr34, jArr32);
        bht.a(jArr23, jArr34, jArr26);
        bht.a(jArr22, jArr4, jArr23);
        long[] jArr35 = new long[10];
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[11];
        long[] jArr38 = new long[11];
        long[] jArr39 = new long[11];
        bht.a(jArr35, k, jArr22);
        bht.i(jArr36, k, jArr22);
        long[] jArr40 = new long[10];
        jArr40[0] = 486662;
        bht.i(jArr38, jArr36, jArr40);
        bht.a(jArr38, jArr38, jArr3);
        bht.i(jArr38, jArr38, jArr33);
        bht.a(jArr38, jArr38, jArr35);
        bht.a(jArr38, jArr38, jArr33);
        bht.f(jArr37, jArr38, 4L);
        bht.d(jArr37);
        bht.a(jArr38, jArr35, jArr3);
        bht.h(jArr38, jArr38, jArr3);
        bht.a(jArr39, jArr36, jArr33);
        bht.i(jArr38, jArr38, jArr39);
        bht.g(jArr38, jArr38);
        if (x(bht.j(jArr37), bht.j(jArr38))) {
            return bht.j(jArr22);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(String.valueOf(h(bArr2))));
    }

    public static byte[] b() {
        byte[] b2 = bia.b(32);
        b2[0] = (byte) (b2[0] | 7);
        int i = b2[31] & 63;
        b2[31] = (byte) i;
        b2[31] = (byte) (i | 128);
        return b2;
    }

    public static byte[] c(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return a(bArr, bArr2);
    }

    public static boolean d() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static DateFormat e(int i, int i2) {
        return new SimpleDateFormat("MMM d, yyyy" + Constants.WHITE_SPACE + "h:mm:ss a", Locale.US);
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(Object obj) {
        obj.getClass();
    }

    public static String h(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append("0123456789abcdef".charAt(i >> 4));
            sb.append("0123456789abcdef".charAt(i & 15));
        }
        return sb.toString();
    }

    public static int i(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (j(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger j(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static BigInteger k(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger j = j(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(j);
        if (j.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger mod2 = mod.mod(j);
        if (mod2.equals(BigInteger.ZERO)) {
            bigInteger3 = BigInteger.ZERO;
        } else {
            if (!j.testBit(0) || !j.testBit(1)) {
                if (j.testBit(0) && !j.testBit(1)) {
                    bigInteger2 = BigInteger.ONE;
                    BigInteger shiftRight = j.subtract(BigInteger.ONE).shiftRight(1);
                    int i = 0;
                    while (true) {
                        BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(j);
                        if (mod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger modPow = mod3.modPow(shiftRight, j);
                        if (!modPow.add(BigInteger.ONE).equals(j)) {
                            if (modPow.equals(BigInteger.ONE)) {
                                bigInteger2 = bigInteger2.add(BigInteger.ONE);
                                i++;
                                if (i == 128 && !j.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        } else {
                            BigInteger shiftRight2 = j.add(BigInteger.ONE).shiftRight(1);
                            BigInteger bigInteger4 = BigInteger.ONE;
                            BigInteger bigInteger5 = bigInteger2;
                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                BigInteger mod4 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(j).multiply(mod3)).mod(j);
                                BigInteger mod5 = multiply.add(multiply).mod(j);
                                if (shiftRight2.testBit(bitLength)) {
                                    BigInteger mod6 = mod4.multiply(bigInteger2).add(mod5.multiply(mod3)).mod(j);
                                    bigInteger4 = bigInteger2.multiply(mod5).add(mod4).mod(j);
                                    bigInteger5 = mod6;
                                } else {
                                    bigInteger5 = mod4;
                                    bigInteger4 = mod5;
                                }
                            }
                            bigInteger2 = bigInteger5;
                        }
                    }
                } else {
                    bigInteger2 = null;
                }
            } else {
                bigInteger2 = mod2.modPow(j.add(BigInteger.ONE).shiftRight(2), j);
            }
            if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(j).compareTo(mod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
            bigInteger3 = bigInteger2;
        }
        return z != bigInteger3.testBit(0) ? j.subtract(bigInteger3).mod(j) : bigInteger3;
    }

    public static KeyPair l(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) bhq.d.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger j = j(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(j) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(j) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(j).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(j))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static void n(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        o(eCPublicKey, eCPrivateKey);
        m(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    static void o(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                return;
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] p(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        o(eCPublicKey, eCPrivateKey);
        ECPoint w = eCPublicKey.getW();
        m(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) bhq.e.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) bhq.c.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(j(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            k(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static KeyPair q(int i) throws GeneralSecurityException {
        return l(u(i));
    }

    public static ECPrivateKey r(int i, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) ((KeyFactory) bhq.e.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), u(i)));
    }

    public static ECPublicKey s(int i, int i2, byte[] bArr) throws GeneralSecurityException {
        ECParameterSpec u = u(i);
        EllipticCurve curve = u.getCurve();
        int i3 = i(curve);
        int length = bArr.length;
        if (length != i3 + i3 + 1) {
            throw new GeneralSecurityException("invalid point size");
        }
        if (bArr[0] != 4) {
            throw new GeneralSecurityException("invalid point format");
        }
        int i4 = i3 + 1;
        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i4)), new BigInteger(1, Arrays.copyOfRange(bArr, i4, length)));
        m(eCPoint, curve);
        return (ECPublicKey) ((KeyFactory) bhq.e.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, u));
    }

    public static ECPublicKey t(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec u = u(i);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m(eCPoint, u.getCurve());
        return (ECPublicKey) ((KeyFactory) bhq.e.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, u));
    }

    public static byte[] v(EllipticCurve ellipticCurve, int i, ECPoint eCPoint) throws GeneralSecurityException {
        m(eCPoint, ellipticCurve);
        int i2 = i(ellipticCurve);
        int i3 = i - 1;
        if (i3 == 0) {
            int i4 = i2 + i2 + 1;
            byte[] bArr = new byte[i4];
            byte[] byteArray = eCPoint.getAffineX().toByteArray();
            byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
            int length = byteArray2.length;
            System.arraycopy(byteArray2, 0, bArr, i4 - length, length);
            int length2 = byteArray.length;
            System.arraycopy(byteArray, 0, bArr, (i2 + 1) - length2, length2);
            bArr[0] = 4;
            return bArr;
        }
        if (i3 != 2) {
            int i5 = i2 + 1;
            byte[] bArr2 = new byte[i5];
            byte[] byteArray3 = eCPoint.getAffineX().toByteArray();
            int length3 = byteArray3.length;
            System.arraycopy(byteArray3, 0, bArr2, i5 - length3, length3);
            bArr2[0] = true == eCPoint.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
            return bArr2;
        }
        int i6 = i2 + i2;
        byte[] bArr3 = new byte[i6];
        byte[] byteArray4 = eCPoint.getAffineX().toByteArray();
        int length4 = byteArray4.length;
        if (length4 > i2) {
            byteArray4 = Arrays.copyOfRange(byteArray4, length4 - i2, length4);
        }
        byte[] byteArray5 = eCPoint.getAffineY().toByteArray();
        int length5 = byteArray5.length;
        if (length5 > i2) {
            byteArray5 = Arrays.copyOfRange(byteArray5, length5 - i2, length5);
        }
        int length6 = byteArray5.length;
        System.arraycopy(byteArray5, 0, bArr3, i6 - length6, length6);
        int length7 = byteArray4.length;
        System.arraycopy(byteArray4, 0, bArr3, i2 - length7, length7);
        return bArr3;
    }

    public static final void w(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean x(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i = 0;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                i |= bArr[i2] ^ bArr2[i2];
            }
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] y(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i > Integer.MAX_VALUE - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i2, length2);
            i2 += length2;
        }
        return bArr3;
    }

    public static final byte[] z(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length) {
            throw new IllegalArgumentException("The lengths of x and y should match.");
        }
        return A(bArr, 0, bArr2, 0, length);
    }

    public static ECParameterSpec u(int i) throws NoSuchAlgorithmException {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return D("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
            }
            return D("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        return D("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }
}
