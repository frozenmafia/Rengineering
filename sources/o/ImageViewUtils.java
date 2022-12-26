package o;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.collections.builders.MapBuilder;
/* loaded from: classes.dex */
public class ImageViewUtils extends GhostViewUtils {
    public static final int toString(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> ag$a(kotlin.Pair<? extends K, ? extends V> pair) {
        runAnimators.ag$a(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        runAnimators.ah$a(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> ag$a(int i) {
        return new MapBuilder(i);
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toString(Map<? extends K, ? extends V> map) {
        runAnimators.ag$a(map, "<this>");
        return new TreeMap(map);
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toString(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        runAnimators.ag$a(pairArr, "pairs");
        TreeMap treeMap = new TreeMap();
        fetchDrawMatrixField.valueOf((Map) treeMap, (kotlin.Pair[]) pairArr);
        return treeMap;
    }

    public static final <K, V> Map<K, V> values(Map<? extends K, ? extends V> map) {
        runAnimators.ag$a(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        runAnimators.ah$a(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
