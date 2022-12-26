package com.google.ads.interactivemedia.v3.internal;

import java.util.ListIterator;
/* loaded from: classes4.dex */
final class bru implements ListIterator {
    final ListIterator a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f962b;
    final /* synthetic */ brw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bru(brw brwVar, int i) {
        bqc bqcVar;
        this.c = brwVar;
        this.f962b = i;
        bqcVar = brwVar.a;
        this.a = bqcVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
