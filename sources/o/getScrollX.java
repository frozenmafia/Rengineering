package o;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
/* loaded from: classes4.dex */
public class getScrollX {
    getScrollX() {
    }

    public static String valueOf(CleverTapInstanceConfig cleverTapInstanceConfig) {
        StringBuilder sb = new StringBuilder();
        sb.append(cleverTapInstanceConfig != null ? cleverTapInstanceConfig.valueOf() : "");
        sb.append("[Product Config]");
        return sb.toString();
    }

    public static boolean ag$a(Object obj) {
        return (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean);
    }
}
