package o;

import android.util.Base64;
import com.sendbird.android.constant.StringSet;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Objects;
import o.Visibility;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes4.dex */
public final class getAttributeRange {
    public static final getAttributeRange values = new getAttributeRange();

    private getAttributeRange() {
    }

    public final String values() {
        char[] charArray = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ~ -_.".toCharArray();
        runAnimators.ah$a(charArray, "(this as java.lang.String).toCharArray()");
        SecureRandom secureRandom = new SecureRandom();
        char[] cArr = new char[128];
        int i = 128;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                boolean z = false;
                char c = charArray[secureRandom.nextInt(66) + 0];
                if (!(56320 <= c && c <= 57343)) {
                    if (!(55296 <= c && c <= 56191)) {
                        if (56192 <= c && c <= 56319) {
                            z = true;
                        }
                        if (z) {
                            i = i2 + 1;
                        } else {
                            cArr[i2] = c;
                            i = i2;
                        }
                    } else if (i2 == 0) {
                        i = i2 + 1;
                    } else {
                        cArr[i2] = (char) (secureRandom.nextInt(128) + 56320);
                        i2--;
                        cArr[i2] = c;
                        i = i2;
                    }
                } else if (i2 == 0) {
                    i = i2 + 1;
                } else {
                    cArr[i2] = c;
                    i = i2 - 1;
                    cArr[i] = (char) (secureRandom.nextInt(128) + 55296);
                }
            } else {
                return new String(cArr);
            }
        }
    }

    public final String values(String str) {
        MessageDigest messageDigest;
        byte[] digest;
        runAnimators.ag$a(str, "codeVerifier");
        try {
            messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest == null) {
            digest = null;
        } else {
            Charset defaultCharset = Charset.defaultCharset();
            runAnimators.ah$a(defaultCharset, "defaultCharset()");
            byte[] bytes = str.getBytes(defaultCharset);
            runAnimators.ah$a(bytes, "(this as java.lang.String).getBytes(charset)");
            digest = messageDigest.digest(bytes);
        }
        if (digest == null) {
            return null;
        }
        return values.ag$a(digest);
    }

    private final String ag$a(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 0);
        runAnimators.ah$a(encodeToString, StringSet.s);
        Object[] array = Visibility.Mode.toString((CharSequence) encodeToString, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String str = ((String[]) array)[0];
        runAnimators.ah$a(str, StringSet.s);
        String ah$a = Visibility.Mode.ah$a(str, '+', (char) Soundex.SILENT_MARKER, false, 4, (Object) null);
        runAnimators.ah$a(ah$a, StringSet.s);
        String ah$a2 = Visibility.Mode.ah$a(ah$a, '/', '_', false, 4, (Object) null);
        runAnimators.ah$a(ah$a2, StringSet.s);
        return ah$a2;
    }
}
