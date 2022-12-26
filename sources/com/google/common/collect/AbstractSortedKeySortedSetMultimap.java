package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
/* loaded from: classes7.dex */
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractSortedKeySortedSetMultimap(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, o.AsyncListDiffer, o.requestTiles
    public SortedMap<K, Collection<V>> asMap() {
        return (SortedMap) super.asMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public SortedMap<K, Collection<V>> backingMap() {
        return (SortedMap) super.backingMap();
    }

    @Override // o.AsyncListDiffer, o.requestTiles
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.AsyncListDiffer
    public Set<K> createKeySet() {
        return createMaybeNavigableKeySet();
    }
}
