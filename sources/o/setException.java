package o;

import java.net.URI;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public class setException {
    public boolean ag$a(String str) {
        if (str.indexOf("gameid_") >= 0) {
            return str.substring(str.indexOf("gameid_")).startsWith("gameid_");
        }
        return false;
    }

    public static String valueOf(Map<String, String> map) {
        String setexception = toString(isCancelled.values(map));
        if (setexception.isEmpty()) {
            String valueOf = isCancelled.valueOf(map);
            return !valueOf.isEmpty() ? valueOf : "";
        }
        return setexception;
    }

    public static String toString(String str) {
        if (str != null) {
            try {
                return ah$a(str) ? valueOf(str) : "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static boolean ah$a(String str) {
        if (str.indexOf("redirectUrl_") >= 0) {
            return str.substring(str.indexOf("redirectUrl_")).startsWith("redirectUrl_");
        }
        return false;
    }

    private static String valueOf(String str) {
        if (str.indexOf("redirectUrl_") >= 0) {
            String[] split = str.substring(str.indexOf("redirectUrl_")).split("_");
            return split.length == 2 ? split[1] : "";
        }
        return "";
    }

    public boolean values(String str) {
        if (str != null) {
            str = str.trim();
        }
        return str != null && loadFont.values(Arrays.asList(URI.create(str).getPath().split("/")), "referral") && loadFont.ak(loadFont.ag$a(str, "referralCode"));
    }
}
