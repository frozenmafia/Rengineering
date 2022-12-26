package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzmi extends AbstractSet {
    final /* synthetic */ zzmk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzmi(zzmk zzmkVar, zzmh zzmhVar) {
        this.zza = zzmkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zza.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zza.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzmg(this.zza, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.zza.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
