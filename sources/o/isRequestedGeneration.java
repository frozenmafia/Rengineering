package o;

import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public abstract class isRequestedGeneration<K, V> extends removeTile implements Map<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.removeTile
    public abstract Map<K, V> delegate();

    public int size() {
        return delegate().size();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    protected void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.valueOf((Map) this, (Map) map);
    }

    protected V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (recycleUpdateOp.values(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected void standardClear() {
        Iterators.values(entrySet().iterator());
    }

    protected boolean standardContainsKey(Object obj) {
        return Maps.values(this, obj);
    }

    public boolean standardContainsValue(Object obj) {
        boolean iterators;
        iterators = Iterators.toString(Maps.valueOf(entrySet().iterator()), obj);
        return iterators;
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public boolean standardEquals(Object obj) {
        return Maps.toString(this, obj);
    }

    public int standardHashCode() {
        return Sets.toString(entrySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String standardToString() {
        return Maps.valueOf(this);
    }
}
