package o;

import com.nytimes.android.external.cache.RemovalCause;
import java.util.Map;
/* loaded from: classes5.dex */
public final class getQueryExecutor<K, V> implements Map.Entry<K, V> {
    private final V toString;
    private final RemovalCause valueOf;
    private final K values;

    public static <K, V> getQueryExecutor<K, V> toString(K k, V v, RemovalCause removalCause) {
        return new getQueryExecutor<>(k, v, removalCause);
    }

    private getQueryExecutor(K k, V v, RemovalCause removalCause) {
        this.values = k;
        this.toString = v;
        this.valueOf = (RemovalCause) assertNotMainThread.valueOf(removalCause);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.values;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.toString;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (createOpenHelper.values(getKey(), entry.getKey()) && createOpenHelper.values(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
