package com.google.android.gms.internal.gtm;

import java.util.Iterator;
/* loaded from: classes7.dex */
final class zztw implements Iterator<String> {
    private final /* synthetic */ zztu zzber;
    private Iterator<String> zzbes;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztw(zztu zztuVar) {
        zzrt zzrtVar;
        this.zzber = zztuVar;
        zzrtVar = zztuVar.zzbeo;
        this.zzbes = zzrtVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzbes.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzbes.next();
    }
}
