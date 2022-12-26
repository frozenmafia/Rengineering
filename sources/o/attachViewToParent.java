package o;

import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public interface attachViewToParent<K, V> extends requestTiles<K, V> {
    @Override // o.requestTiles
    Set<Map.Entry<K, V>> entries();

    @Override // o.requestTiles, o.recycleTile
    Set<V> get(K k);

    @Override // o.requestTiles, o.recycleTile
    Set<V> removeAll(Object obj);

    @Override // o.requestTiles, o.recycleTile
    Set<V> replaceValues(K k, Iterable<? extends V> iterable);
}
