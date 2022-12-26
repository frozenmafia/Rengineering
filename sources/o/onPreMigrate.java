package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
/* loaded from: classes5.dex */
public class onPreMigrate {
    public static int ag$a = 3;
    public static int ah$a = 2;
    public static int toString = 1;
    public static int valueOf = 4;

    public static WritableMap toString(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", i);
        if (str != null) {
            createMap.putString("message", str);
        }
        createMap.putInt("PERMISSION_DENIED", toString);
        createMap.putInt("POSITION_UNAVAILABLE", ah$a);
        createMap.putInt("TIMEOUT", ag$a);
        createMap.putInt("ACTIVITY_NULL", valueOf);
        return createMap;
    }
}
