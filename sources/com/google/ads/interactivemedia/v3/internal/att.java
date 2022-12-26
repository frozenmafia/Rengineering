package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* loaded from: classes4.dex */
class att extends AbstractCollection {
    final Object a;

    /* renamed from: b  reason: collision with root package name */
    Collection f717b;
    final att c;
    final Collection d;
    final /* synthetic */ atw e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public att(atw atwVar, Object obj, Collection collection, att attVar) {
        this.e = atwVar;
        this.a = obj;
        this.f717b = collection;
        this.c = attVar;
        this.d = attVar == null ? null : attVar.f717b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        att attVar = this.c;
        if (attVar != null) {
            attVar.a();
        } else {
            atw.h(this.e).put(this.a, this.f717b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.f717b.isEmpty();
        boolean add = this.f717b.add(obj);
        if (add) {
            atw.q(this.e);
            if (isEmpty) {
                a();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f717b.addAll(collection);
        if (addAll) {
            atw.s(this.e, this.f717b.size() - size);
            if (size == 0) {
                a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Collection collection;
        att attVar = this.c;
        if (attVar != null) {
            attVar.b();
            if (this.c.f717b != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (!this.f717b.isEmpty() || (collection = (Collection) atw.h(this.e).get(this.a)) == null) {
        } else {
            this.f717b = collection;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        att attVar = this.c;
        if (attVar != null) {
            attVar.c();
        } else if (this.f717b.isEmpty()) {
            atw.h(this.e).remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f717b.clear();
        atw.t(this.e, size);
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.f717b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.f717b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f717b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.f717b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new ats(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.f717b.remove(obj);
        if (remove) {
            atw.r(this.e);
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f717b.removeAll(collection);
        if (removeAll) {
            atw.s(this.e, this.f717b.size() - size);
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        atc.k(collection);
        int size = size();
        boolean retainAll = this.f717b.retainAll(collection);
        if (retainAll) {
            atw.s(this.e, this.f717b.size() - size);
            c();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.f717b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f717b.toString();
    }
}
