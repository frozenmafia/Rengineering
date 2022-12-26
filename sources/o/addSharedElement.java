package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes6.dex */
public class addSharedElement {
    public static WritableMap values(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString(StringSet.key, str);
        }
        return createMap;
    }

    public static WritableMap ag$a(String str) {
        return values(str, "Invalid key");
    }

    public static WritableMap values(String str) {
        return values(str, "Invalid Value");
    }

    public static WritableMap valueOf(String str) {
        return values(str, "Database Error");
    }
}
