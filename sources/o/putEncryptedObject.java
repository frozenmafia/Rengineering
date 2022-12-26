package o;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.MediaControllerCompat;
/* loaded from: classes5.dex */
public final class putEncryptedObject {
    public static boolean ag$a = values();
    private static final String toString = "cp";

    public static int ag$a(String str, String str2) {
        return Log.e(str, str2);
    }

    public static int ag$a(String str, String str2, String str3) {
        return toString(str, str2, str3, null);
    }

    private static int ah$a(String str, String str2, String str3, Throwable th, int i) {
        String values = values(str2, str3);
        return th != null ? i == 4 ? Log.i(str, values, th) : Log.d(str, values, th) : i == 4 ? Log.i(str, values) : Log.d(str, values);
    }

    public static int toString(String str, String str2) {
        return Log.w(str, str2);
    }

    public static int toString(String str, String str2, String str3, Throwable th) {
        if (str == null) {
            str = "NULL_TAG";
        }
        String str4 = str + ".PII";
        char c = 3;
        if (!ag$a) {
            str3 = (!(MediaControllerCompat.Callback.MessageHandler.ah$a() && Log.isLoggable("com.amazon.identity.pii", 3)) && MediaControllerCompat.Callback.MessageHandler.ah$a()) ? "<obscured>" : "<obscured>";
            return ah$a(str4, str2, str3, th, 3);
        }
        c = 4;
        String values = values(str2, str3);
        return th != null ? c == 4 ? Log.i(str4, values, th) : Log.d(str4, values, th) : c == 4 ? Log.i(str4, values) : Log.d(str4, values);
    }

    public static int valueOf(String str, String str2) {
        return Log.i(str, str2);
    }

    public static int values(String str, String str2, Throwable th) {
        return Log.e(str, str2, th);
    }

    private static String values(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer(str);
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append(":");
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    private static boolean values() {
        String str;
        try {
            str = Build.VERSION.INCREMENTAL;
        } catch (Exception e) {
            values(toString, e.getMessage(), e);
        }
        if (TextUtils.isEmpty(str)) {
            toString(toString, "Incremental version was empty");
            return false;
        }
        Pattern compile = Pattern.compile("^(?:(.*?)_)??(?:([^_]*)_)?([0-9]+)$");
        String str2 = toString;
        toString(str2, "Extracting verison incremental", "Build.VERSION.INCREMENTAL: " + str, null);
        Matcher matcher = compile.matcher(str);
        if (!matcher.find()) {
            toString(str2, "Incremental version '%s' was in invalid format.", "ver=" + str, null);
            return false;
        } else if (matcher.groupCount() < 3) {
            Log.e(str2, "Error parsing build version string.");
            return false;
        } else {
            String group = matcher.group(2);
            toString(str2, "Extracting flavor", "Build flavor: " + group, null);
            if (!TextUtils.isEmpty(group) && (group.equals("userdebug") || group.equals("eng"))) {
                valueOf(str2, "MAP is running on 1st party debug");
                return true;
            }
            return false;
        }
    }
}
