package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes7.dex */
final class zzte implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzbee;
    private final /* synthetic */ zztc zzbef;

    private zzte(zztc zztcVar) {
        List list;
        this.zzbef = zztcVar;
        list = zztcVar.zzbdz;
        this.pos = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzbef.zzbdz;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzrf().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzrf() {
        Map map;
        if (this.zzbee == null) {
            map = this.zzbef.zzbec;
            this.zzbee = map.entrySet().iterator();
        }
        return this.zzbee;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (zzrf().hasNext()) {
            return (Map.Entry) zzrf().next();
        }
        list = this.zzbef.zzbdz;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzte(zztc zztcVar, zztd zztdVar) {
        this(zztcVar);
    }
}
