package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes4.dex */
final class atl implements Iterator {
    Map.Entry a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Iterator f714b;
    final /* synthetic */ atm c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public atl(atm atmVar, Iterator it) {
        this.c = atmVar;
        this.f714b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f714b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f714b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        atc.i(this.a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.a.getValue();
        this.f714b.remove();
        atw.t(this.c.a, collection.size());
        collection.clear();
        this.a = null;
    }
}
