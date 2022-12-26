package com.google.android.gms.internal.gtm;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class zztl extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zztc zzbef;

    private zztl(zztc zztcVar) {
        this.zzbef = zztcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new zztk(this.zzbef, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.zzbef.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzbef.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.zzbef.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.zzbef.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzbef.zza((zztc) ((Comparable) entry.getKey()), (Comparable) entry.getValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zztl(zztc zztcVar, zztd zztdVar) {
        this(zztcVar);
    }
}
