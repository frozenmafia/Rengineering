package o;

import java.util.Map;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class GhostViewUtils {
    public static final <K, V> V valueOf(Map<K, ? extends V> map, K k) {
        runAnimators.ag$a(map, "<this>");
        if (map instanceof setGhostView) {
            return (V) ((setGhostView) map).toString(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }
}
