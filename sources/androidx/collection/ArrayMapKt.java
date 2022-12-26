package androidx.collection;

import kotlin.Pair;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class ArrayMapKt {
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    public static final <K, V> ArrayMap<K, V> arrayMapOf(Pair<? extends K, ? extends V>... pairArr) {
        runAnimators.valueOf(pairArr, "pairs");
        ArrayMap<K, V> arrayMap = new ArrayMap<>(pairArr.length);
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            arrayMap.put(pair.getFirst(), pair.getSecond());
        }
        return arrayMap;
    }
}
