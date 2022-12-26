package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import o.attachViewToParent;
/* loaded from: classes7.dex */
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements attachViewToParent<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public abstract Set<V> createCollection();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.requestTiles, o.recycleTile
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((AbstractSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.AsyncListDiffer, o.requestTiles, o.recycleTile
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((AbstractSetMultimap<K, V>) obj, iterable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.emptySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new AbstractMapBasedMultimap$HaptikSDK$e(this, k, (Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.requestTiles, o.recycleTile
    public Set<V> get(K k) {
        return (Set) super.get((AbstractSetMultimap<K, V>) k);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.AsyncListDiffer, o.requestTiles
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.requestTiles, o.recycleTile
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.AsyncListDiffer, o.requestTiles, o.recycleTile
    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((AbstractSetMultimap<K, V>) k, (Iterable) iterable);
    }

    @Override // o.AsyncListDiffer, o.requestTiles
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.AsyncListDiffer, o.requestTiles
    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    @Override // o.AsyncListDiffer, o.requestTiles
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
