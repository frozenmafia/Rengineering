package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes4.dex */
final class ati implements Iterator {
    final Iterator a;

    /* renamed from: b  reason: collision with root package name */
    Collection f711b;
    final /* synthetic */ atj c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ati(atj atjVar) {
        this.c = atjVar;
        this.a = atjVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.f711b = (Collection) entry.getValue();
        return this.c.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        atc.i(this.f711b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        atw.t(this.c.f712b, this.f711b.size());
        this.f711b.clear();
        this.f711b = null;
    }
}
