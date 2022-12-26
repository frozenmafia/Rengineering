package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public interface requestTiles<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(Object obj);

    Collection<V> get(K k);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    refreshData<K> keys();

    boolean put(K k, V v);

    boolean putAll(K k, Iterable<? extends V> iterable);

    boolean putAll(requestTiles<? extends K, ? extends V> requesttiles);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    Collection<V> replaceValues(K k, Iterable<? extends V> iterable);

    int size();

    Collection<V> values();
}
