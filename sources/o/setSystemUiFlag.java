package o;
/* loaded from: classes3.dex */
public final class setSystemUiFlag<K, V> extends androidx.collection.ArrayMap<K, V> {
    private int valueOf;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        this.valueOf = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i, V v) {
        this.valueOf = 0;
        return (V) super.setValueAt(i, v);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k, V v) {
        this.valueOf = 0;
        return (V) super.put(k, v);
    }

    @Override // androidx.collection.SimpleArrayMap
    public void putAll(androidx.collection.SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.valueOf = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i) {
        this.valueOf = 0;
        return (V) super.removeAt(i);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public int hashCode() {
        if (this.valueOf == 0) {
            this.valueOf = super.hashCode();
        }
        return this.valueOf;
    }
}
