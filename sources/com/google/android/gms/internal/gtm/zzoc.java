package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes7.dex */
final class zzoc implements Iterator<zzoa<?>> {
    private zzoc() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzoa<?> next() {
        throw new NoSuchElementException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzoc(zzob zzobVar) {
        this();
    }
}
