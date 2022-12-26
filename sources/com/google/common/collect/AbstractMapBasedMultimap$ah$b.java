package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class AbstractMapBasedMultimap$ah$b extends AbstractMapBasedMultimap$ag$a implements SortedSet {
    final /* synthetic */ AbstractMapBasedMultimap ah$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$ah$b(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap<K, Collection<V>> sortedMap) {
        super(abstractMapBasedMultimap, sortedMap);
        this.ah$a = abstractMapBasedMultimap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SortedMap<K, Collection<V>> valueOf() {
        return (SortedMap) super.values();
    }

    @Override // java.util.SortedSet
    public Comparator<? super K> comparator() {
        return valueOf().comparator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, K] */
    @Override // java.util.SortedSet
    public K first() {
        return valueOf().firstKey();
    }

    public SortedSet<K> headSet(K k) {
        return new AbstractMapBasedMultimap$ah$b(this.ah$a, valueOf().headMap(k));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, K] */
    @Override // java.util.SortedSet
    public K last() {
        return valueOf().lastKey();
    }

    public SortedSet<K> subSet(K k, K k2) {
        return new AbstractMapBasedMultimap$ah$b(this.ah$a, valueOf().subMap(k, k2));
    }

    public SortedSet<K> tailSet(K k) {
        return new AbstractMapBasedMultimap$ah$b(this.ah$a, valueOf().tailMap(k));
    }
}
