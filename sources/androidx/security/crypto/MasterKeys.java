package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;
import o.getShort;
@Deprecated
/* loaded from: classes6.dex */
public final class MasterKeys {
    public static final KeyGenParameterSpec AES256_GCM_SPEC;
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    static final int KEY_SIZE = 256;
    static final String MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    private static char ag$a = 0;
    private static long ah$a = 0;
    private static int toString = 0;
    private static int valueOf = 1;
    private static int values;

    static void ag$a() {
        toString = 0;
        ah$a = -5006888481719877720L;
        ag$a = (char) 0;
    }

    private MasterKeys() {
    }

    static {
        try {
            ag$a();
            AES256_GCM_SPEC = createAES256GCMKeyGenParameterSpec("_androidx_security_master_key_");
            int i = values + 95;
            valueOf = i % 128;
            if (!(i % 2 == 0)) {
                return;
            }
            Object obj = null;
            super.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    private static KeyGenParameterSpec createAES256GCMKeyGenParameterSpec(String str) {
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
        int i = valueOf + 123;
        values = i % 128;
        int i2 = i % 2;
        return build;
    }

    public static String getOrCreate(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        validate(keyGenParameterSpec);
        if ((!keyExists(keyGenParameterSpec.getKeystoreAlias()) ? (char) 20 : (char) 19) == 20) {
            int i = valueOf + 11;
            values = i % 128;
            int i2 = i % 2;
            generateKey(keyGenParameterSpec);
            try {
                int i3 = valueOf + 89;
                values = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if ((r4.isUserAuthenticationRequired()) != true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        if ((r4.isUserAuthenticationRequired()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r4.getUserAuthenticationValidityDurationSeconds() < 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
        throw new java.lang.IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r4 = androidx.security.crypto.MasterKeys.valueOf + 107;
        androidx.security.crypto.MasterKeys.values = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void validate(android.security.keystore.KeyGenParameterSpec r4) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.security.crypto.MasterKeys.validate(android.security.keystore.KeyGenParameterSpec):void");
    }

    private static void generateKey(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        int i = valueOf + 53;
        values = i % 128;
        int i2 = i % 2;
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(values((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40348561, new char[]{37250, 26539, 44034, 34462}, new char[]{52852, 51325, 47860}, new char[]{32680, 6423, 62836, 47747}, (char) (TextUtils.lastIndexOf("", '0') + 40621)).intern(), ANDROID_KEYSTORE);
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
            int i3 = valueOf + 33;
            values = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 24 : 'Y') != 24) {
                return;
            }
            Object[] objArr = null;
            int length = objArr.length;
        } catch (ProviderException e) {
            throw new GeneralSecurityException(e.getMessage(), e);
        }
    }

    private static boolean keyExists(String str) throws GeneralSecurityException, IOException {
        try {
            int i = valueOf + 119;
            values = i % 128;
            Object obj = null;
            if ((i % 2 != 0 ? 'A' : (char) 2) != 'A') {
                KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
                keyStore.load(null);
                return keyStore.containsAlias(str);
            }
            KeyStore keyStore2 = KeyStore.getInstance(ANDROID_KEYSTORE);
            keyStore2.load(null);
            boolean containsAlias = keyStore2.containsAlias(str);
            super.hashCode();
            return containsAlias;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String values(int i, char[] cArr, char[] cArr2, char[] cArr3, char c) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr3.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr2[getShort.valueOf]) ^ ah$a) ^ toString) ^ ag$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
