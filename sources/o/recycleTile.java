package o;

import java.util.List;
/* loaded from: classes5.dex */
public interface recycleTile<K, V> extends requestTiles<K, V> {
    @Override // 
    List<V> get(K k);

    @Override // 
    List<V> removeAll(Object obj);

    @Override // 
    List<V> replaceValues(K k, Iterable<? extends V> iterable);
}
