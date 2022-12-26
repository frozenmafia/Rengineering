package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getHorizontalDirection {
    public static Map<String, Object> ah$a(Map<String, Object> map, Map<String, Object> map2) {
        if (map == null && map2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        return hashMap;
    }

    public static String ag$a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || map.isEmpty() || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return null;
        }
        return obj.toString();
    }
}
