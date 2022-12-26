package o;

import java.util.Comparator;
import java.util.SortedMap;
/* loaded from: classes7.dex */
public abstract class acquireTile<K, V> extends isRequestedGeneration<K, V> implements SortedMap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.isRequestedGeneration, o.removeTile
    public abstract SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return delegate().firstKey();
    }

    public SortedMap<K, V> headMap(K k) {
        return delegate().headMap(k);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return delegate().lastKey();
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return delegate().subMap(k, k2);
    }

    public SortedMap<K, V> tailMap(K k) {
        return delegate().tailMap(k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int unsafeCompare(Comparator<?> comparator, Object obj, Object obj2) {
        if (comparator == null) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.isRequestedGeneration
    protected boolean standardContainsKey(Object obj) {
        return unsafeCompare(comparator(), tailMap(obj).firstKey(), obj) == 0;
    }

    protected SortedMap<K, V> standardSubMap(K k, K k2) {
        markViewHoldersUpdated.toString(unsafeCompare(comparator(), k, k2) <= 0, "fromKey must be <= toKey");
        return tailMap(k).headMap(k2);
    }
}
