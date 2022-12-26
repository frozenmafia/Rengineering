package o;

import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class RewriteQueriesToDropUnusedColumns {
    public static boolean valueOf(char c) {
        return c >= 'A' && c <= 'Z';
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
}
