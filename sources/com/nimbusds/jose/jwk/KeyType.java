package com.nimbusds.jose.jwk;

import android.text.TextUtils;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.Requirement;
import java.io.Serializable;
import o.QueryInterceptorStatement$$ExternalSyntheticLambda0;
import o.isLast;
/* loaded from: classes7.dex */
public final class KeyType implements Serializable {
    public static final KeyType EC;
    private static int HaptikSDK$b = 1;
    public static final KeyType OCT;
    public static final KeyType OKP;
    public static final KeyType RSA;
    private static int ag$a = 0;
    private static boolean ah$a = false;
    private static final long serialVersionUID = 1;
    private static char[] toString;
    private static boolean valueOf;
    private static int values;
    private final Requirement requirement;
    private final String value;

    static void valueOf() {
        ah$a = true;
        valueOf = true;
        values = 297;
        toString = new char[]{379, 380, 362};
    }

    static {
        valueOf();
        EC = new KeyType("EC", Requirement.RECOMMENDED);
        RSA = new KeyType(ah$a(null, null, TextUtils.lastIndexOf("", '0') + 128, new byte[]{-125, -126, -127}).intern(), Requirement.REQUIRED);
        OCT = new KeyType("oct", Requirement.OPTIONAL);
        OKP = new KeyType("OKP", Requirement.OPTIONAL);
        int i = HaptikSDK$b + 17;
        ag$a = i % 128;
        if (!(i % 2 != 0)) {
            return;
        }
        int i2 = 85 / 0;
    }

    public KeyType(String str, Requirement requirement) {
        if (str == null) {
            throw new IllegalArgumentException("The key type value must not be null");
        }
        this.value = str;
        this.requirement = requirement;
        int i = ag$a + 35;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
    }

    public String getValue() {
        int i = HaptikSDK$b + 15;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = this.value;
        try {
            int i3 = ag$a + 71;
            HaptikSDK$b = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public Requirement getRequirement() {
        try {
            int i = HaptikSDK$b + 107;
            try {
                ag$a = i % 128;
                if ((i % 2 != 0 ? ']' : (char) 7) != ']') {
                    return this.requirement;
                }
                int i2 = 84 / 0;
                return this.requirement;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int hashCode;
        try {
            int i = ag$a + 15;
            HaptikSDK$b = i % 128;
            if (i % 2 == 0) {
                hashCode = this.value.hashCode();
                int i2 = 19 / 0;
            } else {
                hashCode = this.value.hashCode();
            }
            int i3 = HaptikSDK$b + 97;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean equals(Object obj) {
        int i = HaptikSDK$b + 39;
        ag$a = i % 128;
        int i2 = i % 2;
        if (obj instanceof KeyType) {
            try {
                int i3 = HaptikSDK$b + 61;
                ag$a = i3 % 128;
                int i4 = i3 % 2;
                if ((toString().equals(obj.toString()) ? 'E' : (char) 15) == 'E') {
                    return true;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return false;
    }

    public String toString() {
        try {
            int i = ag$a + 13;
            HaptikSDK$b = i % 128;
            if ((i % 2 == 0 ? 'Q' : 'Z') != 'Z') {
                String str = this.value;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return this.value;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toJSONString() {
        int i = HaptikSDK$b + 77;
        ag$a = i % 128;
        if (i % 2 == 0) {
            return QueryInterceptorStatement$$ExternalSyntheticLambda0.ag$a(this.value);
        }
        String ag$a2 = QueryInterceptorStatement$$ExternalSyntheticLambda0.ag$a(this.value);
        Object obj = null;
        super.hashCode();
        return ag$a2;
    }

    public static KeyType parse(String str) {
        if (!(str != null)) {
            try {
                throw new IllegalArgumentException("The key type to parse must not be null");
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            KeyType keyType = EC;
            if ((str.equals(keyType.getValue()) ? (char) 17 : 'N') == 17) {
                int i = ag$a + 19;
                HaptikSDK$b = i % 128;
                int i2 = i % 2;
                return keyType;
            }
            KeyType keyType2 = RSA;
            if (str.equals(keyType2.getValue())) {
                return keyType2;
            }
            KeyType keyType3 = OCT;
            if (str.equals(keyType3.getValue())) {
                return keyType3;
            }
            KeyType keyType4 = OKP;
            if (str.equals(keyType4.getValue())) {
                int i3 = ag$a + 63;
                HaptikSDK$b = i3 % 128;
                int i4 = i3 % 2;
                return keyType4;
            }
            return new KeyType(str, null);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static KeyType forAlgorithm(Algorithm algorithm) {
        int i = ag$a + 45;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        if ((algorithm == null ? '\b' : '8') != '\b') {
            if (JWSAlgorithm.Family.RSA.contains(algorithm)) {
                int i3 = ag$a + 113;
                HaptikSDK$b = i3 % 128;
                int i4 = i3 % 2;
                return RSA;
            }
            if (!(!JWSAlgorithm.Family.EC.contains(algorithm))) {
                return EC;
            }
            if (JWSAlgorithm.Family.HMAC_SHA.contains(algorithm)) {
                return OCT;
            }
            if (JWEAlgorithm.Family.RSA.contains(algorithm)) {
                return RSA;
            }
            if (JWEAlgorithm.Family.ECDH_ES.contains(algorithm)) {
                try {
                    return EC;
                } catch (Exception e) {
                    throw e;
                }
            }
            try {
                if (JWEAlgorithm.DIR.equals(algorithm)) {
                    return OCT;
                }
                if (JWEAlgorithm.Family.AES_GCM_KW.contains(algorithm)) {
                    return OCT;
                }
                if (JWEAlgorithm.Family.AES_KW.contains(algorithm)) {
                    int i5 = HaptikSDK$b + 107;
                    ag$a = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 74 / 0;
                        return OCT;
                    }
                    return OCT;
                } else if (JWEAlgorithm.Family.PBES2.contains(algorithm)) {
                    return OCT;
                } else {
                    if ((JWSAlgorithm.Family.ED.contains(algorithm) ? (char) 27 : (char) 4) != 27) {
                        return null;
                    }
                    int i7 = ag$a + 67;
                    HaptikSDK$b = i7 % 128;
                    int i8 = i7 % 2;
                    return OKP;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return null;
    }

    private static String ah$a(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = toString;
            int i2 = values;
            if (valueOf) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (ah$a) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
