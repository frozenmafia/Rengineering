package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
/* loaded from: classes7.dex */
public class Maps$HaptikSDK$b<K, V> extends Maps$HaptikSDK$a<K, V> implements NavigableSet<K> {
    public Maps$HaptikSDK$b(NavigableMap<K, V> navigableMap) {
        super(navigableMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Maps$HaptikSDK$a, com.google.common.collect.Maps.values
    /* renamed from: valueOf */
    public NavigableMap<K, V> values() {
        return (NavigableMap) this.toString;
    }

    @Override // java.util.NavigableSet
    public K lower(K k) {
        return values().lowerKey(k);
    }

    @Override // java.util.NavigableSet
    public K floor(K k) {
        return values().floorKey(k);
    }

    @Override // java.util.NavigableSet
    public K ceiling(K k) {
        return values().ceilingKey(k);
    }

    @Override // java.util.NavigableSet
    public K higher(K k) {
        return values().higherKey(k);
    }

    @Override // java.util.NavigableSet
    public K pollFirst() {
        return (K) Maps.values(values().pollFirstEntry());
    }

    @Override // java.util.NavigableSet
    public K pollLast() {
        return (K) Maps.values(values().pollLastEntry());
    }

    @Override // java.util.NavigableSet
    public NavigableSet<K> descendingSet() {
        return values().descendingKeySet();
    }

    @Override // java.util.NavigableSet
    public Iterator<K> descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
        return values().subMap(k, z, k2, z2).navigableKeySet();
    }

    @Override // com.google.common.collect.Maps$HaptikSDK$a, java.util.SortedSet
    public SortedSet<K> subSet(K k, K k2) {
        return subSet(k, true, k2, false);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<K> headSet(K k, boolean z) {
        return values().headMap(k, z).navigableKeySet();
    }

    @Override // com.google.common.collect.Maps$HaptikSDK$a, java.util.SortedSet
    public SortedSet<K> headSet(K k) {
        return headSet(k, false);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<K> tailSet(K k, boolean z) {
        return values().tailMap(k, z).navigableKeySet();
    }

    @Override // com.google.common.collect.Maps$HaptikSDK$a, java.util.SortedSet
    public SortedSet<K> tailSet(K k) {
        return tailSet(k, true);
    }
}
