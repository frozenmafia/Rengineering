package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
/* loaded from: classes4.dex */
final class brv implements Iterator {
    final Iterator a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ brw f963b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brv(brw brwVar) {
        bqc bqcVar;
        this.f963b = brwVar;
        bqcVar = brwVar.a;
        this.a = bqcVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
