package o;

import java.util.Comparator;
import java.util.SortedSet;
/* loaded from: classes7.dex */
public interface getUnfilteredChildCount<K, V> extends attachViewToParent<K, V> {
    @Override // o.attachViewToParent, o.requestTiles, o.recycleTile
    SortedSet<V> get(K k);

    @Override // o.attachViewToParent, o.requestTiles, o.recycleTile
    SortedSet<V> removeAll(Object obj);

    @Override // o.attachViewToParent, o.requestTiles, o.recycleTile
    SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable);

    Comparator<? super V> valueComparator();
}
