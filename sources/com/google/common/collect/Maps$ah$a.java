package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import o.isRequestedGeneration;
/* loaded from: classes7.dex */
public abstract class Maps$ah$a<K, V> extends isRequestedGeneration<K, V> implements NavigableMap<K, V> {
    private transient Comparator<? super K> ah$a;
    private transient Set<Map.Entry<K, V>> valueOf;
    private transient NavigableSet<K> values;

    protected abstract Iterator<Map.Entry<K, V>> ah$a();

    protected abstract NavigableMap<K, V> valueOf();

    @Override // o.isRequestedGeneration, o.removeTile
    public final Map<K, V> delegate() {
        return valueOf();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        Comparator<? super K> comparator = this.ah$a;
        if (comparator == null) {
            Comparator<? super K> comparator2 = valueOf().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering ah$a = ah$a(comparator2);
            this.ah$a = ah$a;
            return ah$a;
        }
        return comparator;
    }

    private static <T> Ordering<T> ah$a(Comparator<T> comparator) {
        return Ordering.from(comparator).reverse();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return valueOf().lastKey();
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return valueOf().firstKey();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k) {
        return valueOf().higherEntry(k);
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return valueOf().higherKey(k);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k) {
        return valueOf().ceilingEntry(k);
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return valueOf().ceilingKey(k);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k) {
        return valueOf().floorEntry(k);
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return valueOf().floorKey(k);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k) {
        return valueOf().lowerEntry(k);
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k) {
        return valueOf().lowerKey(k);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return valueOf().lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return valueOf().firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return valueOf().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return valueOf().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return valueOf();
    }

    @Override // o.isRequestedGeneration, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.valueOf;
        if (set == null) {
            Set<Map.Entry<K, V>> ag$a = ag$a();
            this.valueOf = ag$a;
            return ag$a;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class toString extends Maps.toString<K, V> {
        toString() {
        }

        @Override // com.google.common.collect.Maps.toString
        Map<K, V> ah$a() {
            return Maps$ah$a.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return Maps$ah$a.this.ah$a();
        }
    }

    Set<Map.Entry<K, V>> ag$a() {
        return new toString();
    }

    @Override // o.isRequestedGeneration, java.util.Map
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        NavigableSet<K> navigableSet = this.values;
        if (navigableSet == null) {
            Maps$HaptikSDK$b maps$HaptikSDK$b = new Maps$HaptikSDK$b(this);
            this.values = maps$HaptikSDK$b;
            return maps$HaptikSDK$b;
        }
        return navigableSet;
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return valueOf().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        return valueOf().subMap(k2, z2, k, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(K k, boolean z) {
        return valueOf().tailMap(k, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(K k, boolean z) {
        return valueOf().headMap(k, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    @Override // o.isRequestedGeneration, java.util.Map, o.latchList
    public Collection<V> values() {
        return new Maps.getSignupData(this);
    }

    @Override // o.removeTile
    public String toString() {
        return standardToString();
    }
}
