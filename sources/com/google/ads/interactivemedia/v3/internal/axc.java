package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
/* loaded from: classes4.dex */
abstract class axc implements Iterator {
    final Iterator a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public axc(Iterator it) {
        atc.k(it);
        this.a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
