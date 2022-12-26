package com.google.android.gms.internal.gtm;

import java.util.Iterator;
/* loaded from: classes7.dex */
final class zzob implements Iterator<zzoa<?>> {
    private final /* synthetic */ Iterator zzaue;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzob(zzoa zzoaVar, Iterator it) {
        this.zzaue = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzaue.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzaue.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzoa<?> next() {
        return new zzom((String) this.zzaue.next());
    }
}
