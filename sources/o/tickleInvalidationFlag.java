package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Collection;
import java.util.Map;
/* loaded from: classes6.dex */
public class tickleInvalidationFlag {
    public static WritableMap valueOf(Map<String, ? extends Object> map) {
        WritableMap createMap = Arguments.createMap();
        if (map == null) {
            return createMap;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                createMap.putString(key, (String) value);
            } else if (value instanceof Integer) {
                createMap.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Number) {
                createMap.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                createMap.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Map) {
                createMap.putMap(key, valueOf((Map) value));
            } else if (value instanceof Collection) {
                createMap.putArray(key, ag$a((Collection) value));
            } else if (value == null) {
                createMap.putNull(key);
            }
        }
        return createMap;
    }

    static WritableArray ag$a(Collection<? extends Object> collection) {
        WritableArray createArray = Arguments.createArray();
        if (collection == null) {
            return createArray;
        }
        for (Object obj : collection) {
            if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Number) {
                createArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Map) {
                createArray.pushMap(valueOf((Map) obj));
            } else if (obj instanceof Collection) {
                createArray.pushArray(ag$a((Collection) obj));
            } else if (obj == null) {
                createArray.pushNull();
            }
        }
        return createArray;
    }
}
