package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* loaded from: classes7.dex */
final class zzak implements Iterator {
    final /* synthetic */ Iterator zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzak(Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new zzat((String) this.zza.next());
    }
}
