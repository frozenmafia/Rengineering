package o;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
/* loaded from: classes7.dex */
public abstract class inMemoryDatabaseBuilder<K, V> extends internalBeginTransaction implements projection<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.internalBeginTransaction
    public abstract projection<K, V> delegate();

    @Override // o.projection
    public V getIfPresent(Object obj) {
        return delegate().getIfPresent(obj);
    }

    @Override // o.projection
    public V get(K k, Callable<? extends V> callable) throws ExecutionException {
        return delegate().get(k, callable);
    }

    @Override // o.projection
    public Map<K, V> getAllPresent(Iterable<?> iterable) {
        return delegate().getAllPresent(iterable);
    }

    @Override // o.projection
    public void put(K k, V v) {
        delegate().put(k, v);
    }

    @Override // o.projection
    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @Override // o.projection
    public void invalidate(Object obj) {
        delegate().invalidate(obj);
    }

    @Override // o.projection
    public void invalidateAll(Iterable<?> iterable) {
        delegate().invalidateAll(iterable);
    }

    @Override // o.projection
    public void invalidateAll() {
        delegate().invalidateAll();
    }

    @Override // o.projection
    public long size() {
        return delegate().size();
    }

    @Override // o.projection
    public ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    @Override // o.projection
    public void cleanUp() {
        delegate().cleanUp();
    }
}
