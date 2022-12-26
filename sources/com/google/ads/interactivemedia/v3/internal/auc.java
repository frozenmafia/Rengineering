package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class auc extends AbstractCollection {
    final Collection a;

    /* renamed from: b  reason: collision with root package name */
    final asz f722b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public auc(Collection collection, asz aszVar) {
        this.a = collection;
        this.f722b = aszVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        atc.e(this.f722b.a(obj));
        return this.a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            atc.e(this.f722b.a(obj));
        }
        return this.a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        axb.D(this.a, this.f722b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (axb.H(this.a, obj)) {
            return this.f722b.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection<Object> collection = this.a;
        asz aszVar = this.f722b;
        atc.l(aszVar, "predicate");
        int i = 0;
        for (Object obj : collection) {
            if (aszVar.a(obj)) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        asz aszVar = this.f722b;
        atc.k(it);
        atc.k(aszVar);
        return new atf(it, aszVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f722b.a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f722b.a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (Object obj : this.a) {
            if (this.f722b.a(obj)) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return axb.t(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return axb.t(iterator()).toArray(objArr);
    }
}
