package o;

import java.util.Map;
/* loaded from: classes6.dex */
class setNextClusterForwardId {
    setNextClusterForwardId() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T toString(Map<String, Object> map, String str) {
        T t = (T) map.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T valueOf(Map<String, Object> map, String str) {
        T t = (T) map.get(str);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Missing required parameter " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long ah$a(Map<String, Object> map, String str) {
        Number number = (Number) toString(map, str);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer ag$a(Map<String, Object> map, String str) {
        Number number = (Number) toString(map, str);
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }
}
