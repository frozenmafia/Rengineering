package com.nimbusds.jose;

import com.nimbusds.jose.Algorithm;
import java.util.Collection;
import java.util.LinkedHashSet;
/* loaded from: classes7.dex */
class AlgorithmFamily<T extends Algorithm> extends LinkedHashSet<T> {
    private static final long serialVersionUID = 1;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((AlgorithmFamily<T>) ((Algorithm) obj));
    }

    public AlgorithmFamily(T... tArr) {
        for (T t : tArr) {
            super.add((AlgorithmFamily<T>) t);
        }
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
}
