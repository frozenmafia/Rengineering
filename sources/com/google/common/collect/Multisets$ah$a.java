package com.google.common.collect;

import com.google.common.collect.Sets;
import java.util.Collection;
import o.refreshData;
/* loaded from: classes7.dex */
public abstract class Multisets$ah$a<E> extends Sets.valueOf<E> {
    protected abstract refreshData<E> ag$a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        ag$a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return ag$a().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return ag$a().containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return ag$a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return ag$a().remove(obj, Integer.MAX_VALUE) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return ag$a().entrySet().size();
    }
}
