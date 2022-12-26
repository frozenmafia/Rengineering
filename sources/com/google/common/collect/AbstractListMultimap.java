package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.recycleTile;
/* loaded from: classes5.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements recycleTile<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public abstract List<V> createCollection();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.requestTiles, o.recycleTile
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((AbstractListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.AsyncListDiffer, o.requestTiles, o.recycleTile
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((AbstractListMultimap<K, V>) obj, iterable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public List<V> createUnmodifiableEmptyCollection() {
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection<V> wrapCollection(K k, Collection<V> collection) {
        return wrapList(k, (List) collection, null);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.requestTiles, o.recycleTile
    public List<V> get(K k) {
        return (List) super.get((AbstractListMultimap<K, V>) k);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.requestTiles, o.recycleTile
    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.AsyncListDiffer, o.requestTiles, o.recycleTile
    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((AbstractListMultimap<K, V>) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, o.AsyncListDiffer, o.requestTiles
    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    @Override // o.AsyncListDiffer, o.requestTiles
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // o.AsyncListDiffer, o.requestTiles
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
