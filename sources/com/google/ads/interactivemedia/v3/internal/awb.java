package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes4.dex */
final class awb extends AbstractCollection {
    final Map a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awb(Map map) {
        this.a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return axb.q(this.a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.a.entrySet()) {
                if (atc.o(obj, entry.getValue())) {
                    this.a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        try {
            atc.k(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet c = axb.c();
            for (Map.Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    c.add(entry.getKey());
                }
            }
            return this.a.keySet().removeAll(c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        try {
            atc.k(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet c = axb.c();
            for (Map.Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    c.add(entry.getKey());
                }
            }
            return this.a.keySet().retainAll(c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
