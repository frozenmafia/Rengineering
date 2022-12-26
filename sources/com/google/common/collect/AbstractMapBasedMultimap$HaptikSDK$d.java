package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class AbstractMapBasedMultimap$HaptikSDK$d extends AbstractMapBasedMultimap$HaptikSDK$a implements SortedSet {
    final /* synthetic */ AbstractMapBasedMultimap HaptikSDK$b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/SortedSet<TV;>;Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.a;)V */
    public AbstractMapBasedMultimap$HaptikSDK$d(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, SortedSet sortedSet, AbstractMapBasedMultimap$HaptikSDK$a abstractMapBasedMultimap$HaptikSDK$a) {
        super(abstractMapBasedMultimap, obj, sortedSet, abstractMapBasedMultimap$HaptikSDK$a);
        this.HaptikSDK$b = abstractMapBasedMultimap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SortedSet<V> HaptikSDK$a() {
        return (SortedSet) values();
    }

    @Override // java.util.SortedSet
    public Comparator<? super V> comparator() {
        return HaptikSDK$a().comparator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [V, java.lang.Object] */
    @Override // java.util.SortedSet
    public V first() {
        ah$b();
        return HaptikSDK$a().first();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [V, java.lang.Object] */
    @Override // java.util.SortedSet
    public V last() {
        ah$b();
        return HaptikSDK$a().last();
    }

    @Override // java.util.SortedSet
    public SortedSet<V> headSet(V v) {
        ah$b();
        return new AbstractMapBasedMultimap$HaptikSDK$d(this.HaptikSDK$b, ag$a(), HaptikSDK$a().headSet(v), valueOf() == null ? this : valueOf());
    }

    @Override // java.util.SortedSet
    public SortedSet<V> subSet(V v, V v2) {
        ah$b();
        return new AbstractMapBasedMultimap$HaptikSDK$d(this.HaptikSDK$b, ag$a(), HaptikSDK$a().subSet(v, v2), valueOf() == null ? this : valueOf());
    }

    @Override // java.util.SortedSet
    public SortedSet<V> tailSet(V v) {
        ah$b();
        return new AbstractMapBasedMultimap$HaptikSDK$d(this.HaptikSDK$b, ag$a(), HaptikSDK$a().tailSet(v), valueOf() == null ? this : valueOf());
    }
}
