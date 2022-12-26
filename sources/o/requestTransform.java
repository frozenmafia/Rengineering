package o;

import java.util.Map;
import o.FragmentStateAdapter;
import o.ScrollEventAdapter;
import o.Transition;
/* loaded from: classes8.dex */
public final class requestTransform<K, V> extends ScrollEventAdapter.ScrollEventValues<K, V, Map.Entry<? extends K, ? extends V>> {
    private final FragmentStateAdapter.DataSetChangeObserver values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public static final class toString<K, V> implements Map.Entry<K, V>, Transition.ArrayListManager {
        private final K ah$a;
        private final V values;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof toString) {
                toString tostring = (toString) obj;
                return runAnimators.values(getKey(), tostring.getKey()) && runAnimators.values(getValue(), tostring.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return ((getKey() == null ? 0 : getKey().hashCode()) * 31) + (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + ')';
        }

        public toString(K k, V v) {
            this.ah$a = k;
            this.values = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.ah$a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.values;
        }
    }

    @Override // o.containsItem, o.scheduleGracePeriodEnd
    public FragmentStateAdapter.DataSetChangeObserver values() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ScrollEventAdapter.ScrollEventValues
    /* renamed from: ag$a */
    public Map.Entry<K, V> ah$a(K k, V v) {
        return new toString(k, v);
    }
}
