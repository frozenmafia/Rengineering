package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes4.dex */
final class aty extends AbstractCollection {
    final /* synthetic */ atz a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aty(atz atzVar) {
        this.a = atzVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        for (Collection collection : this.a.w().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.d();
    }
}
