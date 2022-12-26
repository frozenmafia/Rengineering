package o;

import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class postponeAndUpdateViewHolders {
    public static boolean ag$a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean valueOf(char c) {
        return c >= 'a' && c <= 'z';
    }

    private static int values(char c) {
        return (char) ((c | TokenParser.SP) - 97);
    }

    public static String valueOf(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (ag$a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (ag$a(c)) {
                        charArray[i] = (char) (c ^ TokenParser.SP);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String ag$a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (valueOf(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (valueOf(c)) {
                        charArray[i] = (char) (c ^ TokenParser.SP);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static char toString(char c) {
        return valueOf(c) ? (char) (c ^ TokenParser.SP) : c;
    }

    public static boolean values(CharSequence charSequence, CharSequence charSequence2) {
        int values;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((values = values(charAt)) >= 26 || values != values(charAt2))) {
                return false;
            }
        }
        return true;
    }
}
