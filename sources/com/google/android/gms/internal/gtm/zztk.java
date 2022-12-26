package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes7.dex */
final class zztk implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzbee;
    private final /* synthetic */ zztc zzbef;
    private boolean zzbej;

    private zztk(zztc zztcVar) {
        this.zzbef = zztcVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzbef.zzbdz;
        if (i >= list.size()) {
            map = this.zzbef.zzbea;
            if (map.isEmpty() || !zzrf().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzbej) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzbej = false;
        this.zzbef.zzrd();
        int i = this.pos;
        list = this.zzbef.zzbdz;
        if (i < list.size()) {
            zztc zztcVar = this.zzbef;
            int i2 = this.pos;
            this.pos = i2 - 1;
            zztcVar.zzbw(i2);
            return;
        }
        zzrf().remove();
    }

    private final Iterator<Map.Entry<K, V>> zzrf() {
        Map map;
        if (this.zzbee == null) {
            map = this.zzbef.zzbea;
            this.zzbee = map.entrySet().iterator();
        }
        return this.zzbee;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzbej = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzbef.zzbdz;
        if (i >= list.size()) {
            return (Map.Entry) zzrf().next();
        }
        list2 = this.zzbef.zzbdz;
        return (Map.Entry) list2.get(this.pos);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zztk(zztc zztcVar, zztd zztdVar) {
        this(zztcVar);
    }
}
