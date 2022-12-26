package com.google.crypto.tink.subtle;

import android.telephony.cdma.CdmaCellLocation;
import android.view.ViewConfiguration;
import androidx.databinding.library.baseAdapters.BR;
import com.google.crypto.tink.subtle.Enums;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import o.ItemTouchHelper;
import o.isFirst;
import o.prepareForDrop;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum RSA_PSS_2048_SHA256 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class PemKeyType {
    private static final /* synthetic */ PemKeyType[] $VALUES;
    private static final String BEGIN = "-----BEGIN ";
    public static final PemKeyType ECDSA_P256_SHA256;
    public static final PemKeyType ECDSA_P384_SHA384;
    public static final PemKeyType ECDSA_P521_SHA512;
    private static final String END = "-----END ";
    private static final String MARKER = "-----";
    private static final String PRIVATE_KEY = "PRIVATE KEY";
    private static final String PUBLIC_KEY = "PUBLIC KEY";
    public static final PemKeyType RSA_PSS_2048_SHA256;
    public static final PemKeyType RSA_PSS_3072_SHA256;
    public static final PemKeyType RSA_PSS_4096_SHA256;
    public static final PemKeyType RSA_PSS_4096_SHA512;
    public static final PemKeyType RSA_SIGN_PKCS1_2048_SHA256;
    public static final PemKeyType RSA_SIGN_PKCS1_3072_SHA256;
    public static final PemKeyType RSA_SIGN_PKCS1_4096_SHA256;
    public static final PemKeyType RSA_SIGN_PKCS1_4096_SHA512;
    private static int ah$a = 0;
    private static int toString = 1;
    private static char valueOf;
    private static char[] values;
    public final String algorithm;
    public final Enums.HashType hash;
    public final int keySizeInBits;
    public final String keyType;

    static void ah$a() {
        valueOf = (char) 2;
        values = new char[]{13769, 13770, 13768, 13787};
    }

    public static PemKeyType valueOf(String str) {
        int i = ah$a + 101;
        toString = i % 128;
        char c = i % 2 == 0 ? '5' : '\f';
        PemKeyType pemKeyType = (PemKeyType) Enum.valueOf(PemKeyType.class, str);
        if (c == '5') {
            Object[] objArr = null;
            int length = objArr.length;
        }
        return pemKeyType;
    }

    public static PemKeyType[] values() {
        int i = toString + 125;
        ah$a = i % 128;
        int i2 = i % 2;
        PemKeyType[] pemKeyTypeArr = (PemKeyType[]) $VALUES.clone();
        int i3 = toString + 57;
        ah$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            int i4 = 78 / 0;
            return pemKeyTypeArr;
        }
        return pemKeyTypeArr;
    }

    static {
        ah$a();
        String intern = ah$a((byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 64), new char[]{0, 2, 13851}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3).intern();
        PemKeyType pemKeyType = new PemKeyType("RSA_PSS_2048_SHA256", 0, intern, "RSASSA-PSS", 2048, Enums.HashType.SHA256);
        RSA_PSS_2048_SHA256 = pemKeyType;
        PemKeyType pemKeyType2 = new PemKeyType("RSA_PSS_3072_SHA256", 1, intern, "RSASSA-PSS", 3072, Enums.HashType.SHA256);
        RSA_PSS_3072_SHA256 = pemKeyType2;
        PemKeyType pemKeyType3 = new PemKeyType("RSA_PSS_4096_SHA256", 2, intern, "RSASSA-PSS", 4096, Enums.HashType.SHA256);
        RSA_PSS_4096_SHA256 = pemKeyType3;
        PemKeyType pemKeyType4 = new PemKeyType("RSA_PSS_4096_SHA512", 3, intern, "RSASSA-PSS", 4096, Enums.HashType.SHA512);
        RSA_PSS_4096_SHA512 = pemKeyType4;
        PemKeyType pemKeyType5 = new PemKeyType("RSA_SIGN_PKCS1_2048_SHA256", 4, intern, "RSASSA-PKCS1-v1_5", 2048, Enums.HashType.SHA256);
        RSA_SIGN_PKCS1_2048_SHA256 = pemKeyType5;
        PemKeyType pemKeyType6 = new PemKeyType("RSA_SIGN_PKCS1_3072_SHA256", 5, intern, "RSASSA-PKCS1-v1_5", 3072, Enums.HashType.SHA256);
        RSA_SIGN_PKCS1_3072_SHA256 = pemKeyType6;
        PemKeyType pemKeyType7 = new PemKeyType("RSA_SIGN_PKCS1_4096_SHA256", 6, intern, "RSASSA-PKCS1-v1_5", 4096, Enums.HashType.SHA256);
        RSA_SIGN_PKCS1_4096_SHA256 = pemKeyType7;
        PemKeyType pemKeyType8 = new PemKeyType("RSA_SIGN_PKCS1_4096_SHA512", 7, intern, "RSASSA-PKCS1-v1_5", 4096, Enums.HashType.SHA512);
        RSA_SIGN_PKCS1_4096_SHA512 = pemKeyType8;
        PemKeyType pemKeyType9 = new PemKeyType("ECDSA_P256_SHA256", 8, "EC", "ECDSA", 256, Enums.HashType.SHA256);
        ECDSA_P256_SHA256 = pemKeyType9;
        PemKeyType pemKeyType10 = new PemKeyType("ECDSA_P384_SHA384", 9, "EC", "ECDSA", 384, Enums.HashType.SHA384);
        ECDSA_P384_SHA384 = pemKeyType10;
        PemKeyType pemKeyType11 = new PemKeyType("ECDSA_P521_SHA512", 10, "EC", "ECDSA", BR.userContactVM, Enums.HashType.SHA512);
        ECDSA_P521_SHA512 = pemKeyType11;
        $VALUES = new PemKeyType[]{pemKeyType, pemKeyType2, pemKeyType3, pemKeyType4, pemKeyType5, pemKeyType6, pemKeyType7, pemKeyType8, pemKeyType9, pemKeyType10, pemKeyType11};
        int i = ah$a + 57;
        toString = i % 128;
        int i2 = i % 2;
    }

    private PemKeyType(String str, int i, String str2, String str3, int i2, Enums.HashType hashType) {
        try {
            this.keyType = str2;
            this.algorithm = str3;
            this.keySizeInBits = i2;
            this.hash = hashType;
        } catch (Exception e) {
            throw e;
        }
    }

    public Key readKey(BufferedReader bufferedReader) throws IOException {
        boolean z;
        String readLine = bufferedReader.readLine();
        int i = ah$a + 1;
        toString = i % 128;
        int i2 = i % 2;
        while (true) {
            z = false;
            if ((readLine != null ? (char) 0 : (char) 7) != 0) {
                break;
            }
            try {
                if (readLine.startsWith(BEGIN)) {
                    break;
                }
                int i3 = ah$a + 109;
                toString = i3 % 128;
                int i4 = i3 % 2;
                readLine = bufferedReader.readLine();
            } catch (Exception e) {
                throw e;
            }
        }
        if ((readLine == null ? ',' : 'V') != ',') {
            String substring = readLine.trim().substring(11);
            int indexOf = substring.indexOf(MARKER);
            if (indexOf < 0) {
                return null;
            }
            String substring2 = substring.substring(0, indexOf);
            String str = END + substring2 + MARKER;
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine2 = bufferedReader.readLine();
                if (readLine2 != null) {
                    if (readLine2.indexOf(":") <= 0) {
                        if (!readLine2.contains(str)) {
                            sb.append(readLine2);
                        }
                    }
                }
                try {
                    byte[] simpleCallback = ItemTouchHelper.SimpleCallback.toString(sb.toString(), 0);
                    if (substring2.contains(PUBLIC_KEY)) {
                        return getPublicKey(simpleCallback);
                    }
                    if (!substring2.contains(PRIVATE_KEY)) {
                        z = true;
                    }
                    if (!z) {
                        return getPrivateKey(simpleCallback);
                    }
                } catch (IllegalArgumentException | GeneralSecurityException unused) {
                }
            }
        }
        return null;
    }

    private Key getPublicKey(byte[] bArr) throws GeneralSecurityException {
        Key validate = validate(prepareForDrop.ag$a.ah$a(this.keyType).generatePublic(new X509EncodedKeySpec(bArr)));
        try {
            int i = ah$a + 31;
            toString = i % 128;
            int i2 = i % 2;
            return validate;
        } catch (Exception e) {
            throw e;
        }
    }

    private Key getPrivateKey(byte[] bArr) throws GeneralSecurityException {
        Key validate = validate(prepareForDrop.ag$a.ah$a(this.keyType).generatePrivate(new PKCS8EncodedKeySpec(bArr)));
        int i = ah$a + 23;
        toString = i % 128;
        int i2 = i % 2;
        return validate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r0 == r11.keySizeInBits) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
        throw new java.security.GeneralSecurityException(java.lang.String.format("invalid RSA key size, want %d got %d", java.lang.Integer.valueOf(r11.keySizeInBits), java.lang.Integer.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
        if (r0 == r2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r0 == r11.keySizeInBits) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
        throw new java.security.GeneralSecurityException(java.lang.String.format("invalid EC key size, want %d got %d", java.lang.Integer.valueOf(r11.keySizeInBits), java.lang.Integer.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
        if (r0 == r2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.security.Key validate(java.security.Key r12) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.subtle.PemKeyType.validate(java.security.Key):java.security.Key");
    }

    private static String ah$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = values;
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
