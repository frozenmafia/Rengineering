package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.getUnfilteredChildAt;
/* loaded from: classes7.dex */
public abstract class getTileStart<R, C, V> extends removeTile implements getUnfilteredChildAt<R, C, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.removeTile
    public abstract getUnfilteredChildAt<R, C, V> delegate();

    public Set<getUnfilteredChildAt.valueOf<R, C, V>> cellSet() {
        return delegate().cellSet();
    }

    public void clear() {
        delegate().clear();
    }

    public Map<R, V> column(C c) {
        return delegate().column(c);
    }

    public Set<C> columnKeySet() {
        return delegate().columnKeySet();
    }

    public Map<C, Map<R, V>> columnMap() {
        return delegate().columnMap();
    }

    @Override // o.getUnfilteredChildAt
    public boolean contains(Object obj, Object obj2) {
        return delegate().contains(obj, obj2);
    }

    @Override // o.getUnfilteredChildAt
    public boolean containsColumn(Object obj) {
        return delegate().containsColumn(obj);
    }

    @Override // o.getUnfilteredChildAt
    public boolean containsRow(Object obj) {
        return delegate().containsRow(obj);
    }

    @Override // o.getUnfilteredChildAt
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // o.getUnfilteredChildAt
    public V get(Object obj, Object obj2) {
        return delegate().get(obj, obj2);
    }

    @Override // o.getUnfilteredChildAt
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public V put(R r, C c, V v) {
        return delegate().put(r, c, v);
    }

    public void putAll(getUnfilteredChildAt<? extends R, ? extends C, ? extends V> getunfilteredchildat) {
        delegate().putAll(getunfilteredchildat);
    }

    public V remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public Map<C, V> row(R r) {
        return delegate().row(r);
    }

    public Set<R> rowKeySet() {
        return delegate().rowKeySet();
    }

    public Map<R, Map<C, V>> rowMap() {
        return delegate().rowMap();
    }

    @Override // o.getUnfilteredChildAt
    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    @Override // o.getUnfilteredChildAt
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // o.getUnfilteredChildAt
    public int hashCode() {
        return delegate().hashCode();
    }
}
