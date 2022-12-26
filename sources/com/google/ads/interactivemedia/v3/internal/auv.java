package com.google.ads.interactivemedia.v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes4.dex */
public abstract class auv<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] aV = new Object[0];

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        axd it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public avb d() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract axd iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] g() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(aV);
    }

    Object writeReplace() {
        return new auz(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        atc.k(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] g = g();
            if (g == null) {
                objArr = axb.j(objArr, size);
            } else {
                return Arrays.copyOfRange(g, c(), b(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }
}
