package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes7.dex */
public abstract class recycleAllTiles<K, V> extends removeTile implements requestTiles<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.removeTile
    public abstract requestTiles<K, V> delegate();

    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    public void clear() {
        delegate().clear();
    }

    @Override // o.requestTiles
    public boolean containsEntry(Object obj, Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @Override // o.requestTiles
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // o.requestTiles
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public Collection<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    public Collection<V> get(K k) {
        return delegate().get(k);
    }

    @Override // o.requestTiles
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public refreshData<K> keys() {
        return delegate().keys();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public boolean put(K k, V v) {
        return delegate().put(k, v);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        return delegate().putAll(k, iterable);
    }

    public boolean putAll(requestTiles<? extends K, ? extends V> requesttiles) {
        return delegate().putAll(requesttiles);
    }

    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public Collection<V> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return delegate().replaceValues(k, iterable);
    }

    @Override // o.requestTiles
    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    @Override // o.requestTiles
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // o.requestTiles
    public int hashCode() {
        return delegate().hashCode();
    }
}
