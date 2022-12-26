package o;

import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public interface latchList<K, V> extends Map<K, V> {
    V forcePut(K k, V v);

    latchList<V, K> inverse();

    @Override // o.latchList
    Set<V> values();
}
