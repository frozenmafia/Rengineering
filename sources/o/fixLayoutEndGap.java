package o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;
/* loaded from: classes7.dex */
public final class fixLayoutEndGap {
    private static final Pattern values = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
    private static final Pattern ag$a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    public static void toString(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static void valueOf(int i, int i2) throws GeneralSecurityException {
        if (i < 0 || i > i2) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static String ag$a(String str, String str2) {
        if (!str2.toLowerCase(Locale.US).startsWith(str)) {
            throw new IllegalArgumentException(String.format("key URI must start with %s", str));
        }
        return str2.substring(str.length());
    }
}
