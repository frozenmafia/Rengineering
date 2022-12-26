package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class atm extends awa {
    final /* synthetic */ atw a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atm(atw atwVar, Map map) {
        super(map);
        this.a = atwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        axb.x(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new atl(this, this.d.entrySet().iterator());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            atw.t(this.a, size);
            return size > 0;
        }
        return false;
    }
}
