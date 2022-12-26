package kotlin.collections.builders;

import java.util.Map;
import o.TransitionInflater;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class MapBuilder$ag$a<K, V> implements Map.Entry<K, V>, TransitionInflater {
    private final int ah$a;
    private final MapBuilder<K, V> values;

    public MapBuilder$ag$a(MapBuilder<K, V> mapBuilder, int i) {
        runAnimators.ag$a(mapBuilder, "map");
        this.values = mapBuilder;
        this.ah$a = i;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) ((MapBuilder) this.values).keysArray[this.ah$a];
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        Object[] objArr = ((MapBuilder) this.values).valuesArray;
        runAnimators.toString(objArr);
        return (V) objArr[this.ah$a];
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        Object[] allocateValuesArray;
        this.values.checkIsMutable$kotlin_stdlib();
        allocateValuesArray = this.values.allocateValuesArray();
        int i = this.ah$a;
        V v2 = (V) allocateValuesArray[i];
        allocateValuesArray[i] = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (runAnimators.values(entry.getKey(), getKey()) && runAnimators.values(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
