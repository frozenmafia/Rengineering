package org.apache.http.conn.util;

import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public class DnsUtils {
    private static boolean isUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private DnsUtils() {
    }

    public static String normalize(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i = 0;
        while (length > 0 && !isUpper(str.charAt(i))) {
            i++;
            length--;
        }
        if (length > 0) {
            StringBuilder sb = new StringBuilder(str.length());
            sb.append((CharSequence) str, 0, i);
            while (length > 0) {
                char charAt = str.charAt(i);
                if (isUpper(charAt)) {
                    sb.append((char) (charAt + TokenParser.SP));
                } else {
                    sb.append(charAt);
                }
                i++;
                length--;
            }
            return sb.toString();
        }
        return str;
    }
}
