package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* loaded from: classes7.dex */
class Maps$HaptikSDK$a<K, V> extends Maps.values<K, V> implements SortedSet<K> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Maps$HaptikSDK$a(SortedMap<K, V> sortedMap) {
        super(sortedMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Maps.values
    /* renamed from: ag$a */
    public SortedMap<K, V> values() {
        return (SortedMap) super.values();
    }

    @Override // java.util.SortedSet
    public Comparator<? super K> comparator() {
        return values().comparator();
    }

    @Override // java.util.SortedSet
    public SortedSet<K> subSet(K k, K k2) {
        return new Maps$HaptikSDK$a(values().subMap(k, k2));
    }

    @Override // java.util.SortedSet
    public SortedSet<K> headSet(K k) {
        return new Maps$HaptikSDK$a(values().headMap(k));
    }

    @Override // java.util.SortedSet
    public SortedSet<K> tailSet(K k) {
        return new Maps$HaptikSDK$a(values().tailMap(k));
    }

    @Override // java.util.SortedSet
    public K first() {
        return values().firstKey();
    }

    @Override // java.util.SortedSet
    public K last() {
        return values().lastKey();
    }
}
