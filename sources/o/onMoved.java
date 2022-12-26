package o;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
/* loaded from: classes7.dex */
public abstract class onMoved<K, V> extends removeTile implements cmdToString<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.removeTile
    public abstract cmdToString<K, V> delegate();

    @Override // o.cmdToString
    public V getIfPresent(Object obj) {
        return delegate().getIfPresent(obj);
    }

    @Override // o.cmdToString
    public V get(K k, Callable<? extends V> callable) throws ExecutionException {
        return delegate().get(k, callable);
    }

    @Override // o.cmdToString
    public ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> iterable) {
        return delegate().getAllPresent(iterable);
    }

    @Override // o.cmdToString
    public void put(K k, V v) {
        delegate().put(k, v);
    }

    @Override // o.cmdToString
    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @Override // o.cmdToString
    public void invalidate(Object obj) {
        delegate().invalidate(obj);
    }

    @Override // o.cmdToString
    public void invalidateAll(Iterable<? extends Object> iterable) {
        delegate().invalidateAll(iterable);
    }

    @Override // o.cmdToString
    public void invalidateAll() {
        delegate().invalidateAll();
    }

    @Override // o.cmdToString
    public long size() {
        return delegate().size();
    }

    @Override // o.cmdToString
    public onRemoved stats() {
        return delegate().stats();
    }

    @Override // o.cmdToString
    public ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    @Override // o.cmdToString
    public void cleanUp() {
        delegate().cleanUp();
    }
}
