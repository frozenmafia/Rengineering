package o;

import java.util.Map;
import kotlin.KotlinNothingValueException;
/* loaded from: classes7.dex */
public final class readParcelable$ag$a<K, V> implements Map.Entry<K, V>, TransitionInflater {
    private final V toString;
    private final K values;

    public readParcelable$ag$a(K k, V v) {
        this.values = k;
        this.toString = v;
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
    public V setValue(V v) {
        readSerializable.ah$a();
        throw new KotlinNothingValueException();
    }
}
