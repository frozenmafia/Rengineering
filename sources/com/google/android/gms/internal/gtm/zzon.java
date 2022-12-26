package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes7.dex */
final class zzon implements Iterator<zzoa<?>> {
    private int currentIndex = 0;
    private final /* synthetic */ zzom zzauw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzon(zzom zzomVar) {
        this.zzauw = zzomVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.currentIndex;
        str = this.zzauw.value;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzoa<?> next() {
        String str;
        int i = this.currentIndex;
        str = this.zzauw.value;
        if (i >= str.length()) {
            throw new NoSuchElementException();
        }
        int i2 = this.currentIndex;
        this.currentIndex = i2 + 1;
        return new zzoe(Double.valueOf(i2));
    }
}
