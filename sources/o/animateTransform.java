package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyMap;
/* loaded from: classes.dex */
public class animateTransform extends ImageViewUtils {
    public static final <K, V> Map<K, V> valueOf() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        runAnimators.values((Object) emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static final <K, V> Map<K, V> values(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        runAnimators.ag$a(pairArr, "pairs");
        return pairArr.length > 0 ? fetchDrawMatrixField.values(pairArr, new LinkedHashMap(fetchDrawMatrixField.toString(pairArr.length))) : fetchDrawMatrixField.valueOf();
    }

    public static final <K, V> Map<K, V> valueOf(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        runAnimators.ag$a(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fetchDrawMatrixField.toString(pairArr.length));
        fetchDrawMatrixField.valueOf((Map) linkedHashMap, (kotlin.Pair[]) pairArr);
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> ah$a(kotlin.Pair<? extends K, ? extends V>... pairArr) {
        runAnimators.ag$a(pairArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(fetchDrawMatrixField.toString(pairArr.length));
        fetchDrawMatrixField.valueOf((Map) hashMap, (kotlin.Pair[]) pairArr);
        return hashMap;
    }

    public static final <K, V> void valueOf(Map<? super K, ? super V> map, kotlin.Pair<? extends K, ? extends V>[] pairArr) {
        runAnimators.ag$a(map, "<this>");
        runAnimators.ag$a(pairArr, "pairs");
        for (kotlin.Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((K) pair.component1(), (V) pair.component2());
        }
    }

    public static final <K, V> void values(Map<? super K, ? super V> map, Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        runAnimators.ag$a(map, "<this>");
        runAnimators.ag$a(iterable, "pairs");
        for (kotlin.Pair<? extends K, ? extends V> pair : iterable) {
            map.put((K) pair.component1(), (V) pair.component2());
        }
    }

    public static final <K, V> Map<K, V> valueOf(Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        runAnimators.ag$a(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return fetchDrawMatrixField.ag$a(iterable, new LinkedHashMap(fetchDrawMatrixField.toString(collection.size())));
                }
                return fetchDrawMatrixField.ag$a(iterable instanceof List ? (kotlin.Pair<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return fetchDrawMatrixField.valueOf();
        }
        return fetchDrawMatrixField.valueOf(fetchDrawMatrixField.ag$a(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M ag$a(Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable, M m) {
        runAnimators.ag$a(iterable, "<this>");
        runAnimators.ag$a(m, "destination");
        fetchDrawMatrixField.values(m, iterable);
        return m;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M values(kotlin.Pair<? extends K, ? extends V>[] pairArr, M m) {
        runAnimators.ag$a(pairArr, "<this>");
        runAnimators.ag$a(m, "destination");
        fetchDrawMatrixField.valueOf((Map) m, (kotlin.Pair[]) pairArr);
        return m;
    }

    public static final <K, V> Map<K, V> ag$a(Map<? extends K, ? extends V> map) {
        runAnimators.ag$a(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                return fetchDrawMatrixField.values(map);
            }
            return fetchDrawMatrixField.HaptikSDK$a(map);
        }
        return fetchDrawMatrixField.valueOf();
    }

    public static final <K, V> Map<K, V> HaptikSDK$a(Map<? extends K, ? extends V> map) {
        runAnimators.ag$a(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final <K, V> Map<K, V> ag$a(Map<? extends K, ? extends V> map, kotlin.Pair<? extends K, ? extends V> pair) {
        runAnimators.ag$a(map, "<this>");
        runAnimators.ag$a(pair, "pair");
        if (map.isEmpty()) {
            return fetchDrawMatrixField.ag$a(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> ag$a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        runAnimators.ag$a(map, "<this>");
        runAnimators.ag$a(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> valueOf(Map<K, ? extends V> map) {
        runAnimators.ag$a(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : fetchDrawMatrixField.values(map);
        }
        return fetchDrawMatrixField.valueOf();
    }
}
