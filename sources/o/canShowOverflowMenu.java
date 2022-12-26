package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class canShowOverflowMenu {
    public static final Pattern values = Pattern.compile("(?:(?:https?|ftp|file):\\/\\/|www\\.|ftp\\.)(?:\\([-A-Z0-9+&@#\\/%=~_|$?!:,.]*\\)|[-A-Z0-9+&@#\\/%=~_|$?!:,.])*(?:\\([-A-Z0-9+&@#\\/%=~_|$?!:,.]*\\)|[A-Z0-9+&@#\\/%=~_|$])", 42);

    public static boolean valueOf(String str) {
        return values.matcher(str).matches();
    }

    public static String ah$a(String str) {
        try {
            Matcher matcher = values.matcher(str);
            if (matcher.find()) {
                return str.substring(matcher.start(0), matcher.end(0));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
