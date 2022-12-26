package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
class ats implements Iterator {
    final Iterator a;

    /* renamed from: b  reason: collision with root package name */
    final Collection f716b;
    final /* synthetic */ att c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ats(att attVar) {
        Iterator it;
        this.c = attVar;
        this.f716b = attVar.f717b;
        Collection collection = attVar.f717b;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.a = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ats(att attVar, Iterator it) {
        this.c = attVar;
        this.f716b = attVar.f717b;
        this.a = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.b();
        if (this.c.f717b != this.f716b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        atw.r(this.c.e);
        this.c.c();
    }
}
