package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zztf extends zztl {
    private final /* synthetic */ zztc zzbef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zztf(zztc zztcVar) {
        super(zztcVar, null);
        this.zzbef = zztcVar;
    }

    @Override // com.google.android.gms.internal.gtm.zztl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzte(this.zzbef, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zztf(zztc zztcVar, zztd zztdVar) {
        this(zztcVar);
    }
}
