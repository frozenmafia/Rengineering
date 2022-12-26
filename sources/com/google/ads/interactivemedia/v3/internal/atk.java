package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes4.dex */
final class atk implements Iterator {
    final Iterator a;

    /* renamed from: b  reason: collision with root package name */
    Collection f713b;
    Iterator c;
    final /* synthetic */ atw d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public atk(atw atwVar, byte[] bArr) {
        this(atwVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f713b = collection;
            this.c = collection.iterator();
        }
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.c.remove();
        Collection collection = this.f713b;
        collection.getClass();
        if (collection.isEmpty()) {
            this.a.remove();
        }
        atw.r(this.d);
    }

    atk(atw atwVar) {
        Map map;
        this.d = atwVar;
        map = atwVar.a;
        this.a = map.entrySet().iterator();
        this.f713b = null;
        this.c = avv.a;
    }
}
