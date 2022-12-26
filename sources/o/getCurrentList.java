package o;

import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps$HaptikSDK$b;
import com.google.common.collect.Maps$ah$a;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
/* loaded from: classes7.dex */
public abstract class getCurrentList<K, V> extends Maps.valueOf<K, V> implements NavigableMap<K, V> {
    protected abstract Iterator<Map.Entry<K, V>> valueOf();

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) Iterators.values(ag$a(), (Object) null);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) Iterators.values(valueOf(), (Object) null);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) Iterators.HaptikSDK$c(ag$a());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) Iterators.HaptikSDK$c(valueOf());
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry == null) {
            throw new NoSuchElementException();
        }
        return firstEntry.getKey();
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry == null) {
            throw new NoSuchElementException();
        }
        return lastEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return (K) Maps.values(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return (K) Maps.values(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return (K) Maps.values(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k) {
        return (K) Maps.values(higherEntry(k));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new Maps$HaptikSDK$b(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return new valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class valueOf extends Maps$ah$a<K, V> {
        private valueOf() {
        }

        @Override // com.google.common.collect.Maps$ah$a
        public NavigableMap<K, V> valueOf() {
            return getCurrentList.this;
        }

        @Override // com.google.common.collect.Maps$ah$a
        public Iterator<Map.Entry<K, V>> ah$a() {
            return getCurrentList.this.valueOf();
        }
    }
}
