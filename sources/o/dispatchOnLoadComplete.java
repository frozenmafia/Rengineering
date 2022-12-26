package o;

import com.fasterxml.jackson.core.Base64Variant;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes6.dex */
public final class dispatchOnLoadComplete {
    public static final Base64Variant ag$a;
    public static final Base64Variant ah$a;
    public static final Base64Variant toString;
    public static final Base64Variant values;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        toString = base64Variant;
        values = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        ag$a = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), Soundex.SILENT_MARKER);
        sb.setCharAt(sb.indexOf("/"), '_');
        ah$a = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static Base64Variant ah$a(String str) throws IllegalArgumentException {
        String str2;
        Base64Variant base64Variant = toString;
        if (base64Variant._name.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = values;
        if (base64Variant2._name.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = ag$a;
        if (base64Variant3._name.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = ah$a;
        if (base64Variant4._name.equals(str)) {
            return base64Variant4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}
