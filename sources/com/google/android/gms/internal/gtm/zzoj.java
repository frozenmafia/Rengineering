package com.google.android.gms.internal.gtm;

import java.util.Iterator;
/* loaded from: classes7.dex */
final class zzoj implements Iterator<zzoa<?>> {
    private final /* synthetic */ Iterator zzaur;
    private final /* synthetic */ Iterator zzaus;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzoj(zzoh zzohVar, Iterator it, Iterator it2) {
        this.zzaur = it;
        this.zzaus = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzaur.hasNext() || this.zzaus.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzoa<?> next() {
        if (this.zzaur.hasNext()) {
            return (zzoa) this.zzaur.next();
        }
        return (zzoa) this.zzaus.next();
    }
}
