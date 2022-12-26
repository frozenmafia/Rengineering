package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes4.dex */
abstract class avz extends awy {
    abstract Map a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object o2 = axb.o(a(), key);
            if (atc.o(o2, entry.getValue()) && (o2 != null || a().containsKey(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            atc.k(collection);
            return axb.h(this, collection);
        } catch (UnsupportedOperationException unused) {
            return axb.i(this, collection.iterator());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            atc.k(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet d = axb.d(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    d.add(((Map.Entry) obj).getKey());
                }
            }
            return a().keySet().retainAll(d);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }
}
