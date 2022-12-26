package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class atv extends att implements List {
    final /* synthetic */ atw f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atv(atw atwVar, Object obj, List list, att attVar) {
        super(atwVar, obj, list, attVar);
        this.f = atwVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.f717b.isEmpty();
        d().add(i, obj);
        atw.q(this.f);
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = d().addAll(i, collection);
        if (addAll) {
            atw.s(this.f, this.f717b.size() - size);
            if (size == 0) {
                a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List d() {
        return (List) this.f717b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return d().get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new atu(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = d().remove(i);
        atw.r(this.f);
        c();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return d().set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        atw atwVar = this.f;
        Object obj = this.a;
        List subList = d().subList(i, i2);
        att attVar = this.c;
        if (attVar == null) {
            attVar = this;
        }
        return atwVar.g(obj, subList, attVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new atu(this, i);
    }
}
