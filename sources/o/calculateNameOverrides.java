package o;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.util.RCTLog;
/* loaded from: classes4.dex */
public class calculateNameOverrides {
    private static String values(int i) {
        return (i == 2 || i == 3) ? "log" : (i == 4 || i == 5) ? "warn" : i != 6 ? "none" : "error";
    }

    public static void toString(ReactContext reactContext, String str) {
        valueOf(reactContext, str, 5);
        FragmentActivity.ah$a("ReactNative", str);
    }

    public static void valueOf(String str) {
        FragmentActivity.values("ReactNative", str);
    }

    private static void valueOf(ReactContext reactContext, String str, int i) {
        if (i < 5 || reactContext == null || str == null) {
            return;
        }
        ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(values(i), str);
    }
}
