package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import o.AsyncListUtil;
import o.extendRangeInto;
/* loaded from: classes7.dex */
public final class HashMultiset<E> extends AbstractMapBasedMultiset<E> {
    private static final long serialVersionUID = 0;

    @Override // o.addListListener, java.util.AbstractCollection, java.util.Collection, o.refreshData
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // o.addListListener, o.refreshData
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // o.addListListener, o.refreshData
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // o.addListListener, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> HashMultiset<E> create() {
        return create(3);
    }

    public static <E> HashMultiset<E> create(int i) {
        return new HashMultiset<>(i);
    }

    public static <E> HashMultiset<E> create(Iterable<? extends E> iterable) {
        HashMultiset<E> create = create(Multisets.ah$a(iterable));
        AsyncListUtil.DataCallback.ah$a((Collection) create, (Iterable) iterable);
        return create;
    }

    HashMultiset(int i) {
        super(i);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    extendRangeInto<E> newBackingMap(int i) {
        return new extendRangeInto<>(i);
    }
}
