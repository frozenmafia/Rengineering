package o;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class doesReturn {
    static final String[] toString = {"", com.dreampay.commons.constants.Constants.WHITE_SPACE, "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    private static final ThreadLocal<StringBuilder> ah$a = new ThreadLocal<StringBuilder>() { // from class: o.doesReturn.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: valueOf */
        public StringBuilder initialValue() {
            return new StringBuilder(8192);
        }
    };

    public static boolean ag$a(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13 || i == 160;
    }

    public static boolean valueOf(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static String toString(Iterator it, String str) {
        if (it.hasNext()) {
            String obj = it.next().toString();
            if (it.hasNext()) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append(str);
                    sb.append(it.next());
                }
                return sb.toString();
            }
            return obj;
        }
        return "";
    }

    public static String values(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        String[] strArr = toString;
        if (i < strArr.length) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = TokenParser.SP;
        }
        return String.valueOf(cArr);
    }

    public static boolean valueOf(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!valueOf(str.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean ag$a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean toString(int i) {
        return Character.getType(i) == 16 && (i == 8203 || i == 8204 || i == 8205 || i == 173);
    }

    public static String toString(String str) {
        StringBuilder valueOf = valueOf();
        values(valueOf, str, false);
        return valueOf.toString();
    }

    public static void values(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (ag$a(codePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(TokenParser.SP);
                    z3 = true;
                }
            } else if (!toString(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z2 = true;
                z3 = false;
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static boolean values(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean valueOf(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static URL toString(URL url, String str) throws MalformedURLException {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        if (str.indexOf(46) == 0 && url.getFile().indexOf(47) != 0) {
            url = new URL(url.getProtocol(), url.getHost(), url.getPort(), "/" + url.getFile());
        }
        return new URL(url, str);
    }

    public static String values(String str, String str2) {
        try {
            try {
                return toString(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(str2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return "";
        }
    }

    public static StringBuilder valueOf() {
        ThreadLocal<StringBuilder> threadLocal = ah$a;
        StringBuilder sb = threadLocal.get();
        if (sb.length() > 8192) {
            StringBuilder sb2 = new StringBuilder(8192);
            threadLocal.set(sb2);
            return sb2;
        }
        sb.delete(0, sb.length());
        return sb;
    }
}
