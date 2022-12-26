package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes4.dex */
public final class brw extends AbstractList implements RandomAccess, bqc {
    private final bqc a;

    public brw(bqc bqcVar) {
        this.a = bqcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqc
    public final bqc e() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqc
    public final Object f(int i) {
        return this.a.f(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return ((bqb) this.a).get(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqc
    public final List h() {
        return this.a.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqc
    public final void i(bnz bnzVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new brv(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new bru(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
