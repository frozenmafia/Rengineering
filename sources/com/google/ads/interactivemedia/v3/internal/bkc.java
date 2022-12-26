package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes4.dex */
abstract class bkc implements Iterator {
    bkd a;

    /* renamed from: b  reason: collision with root package name */
    bkd f860b = null;
    int c;
    final /* synthetic */ bke d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkc(bke bkeVar) {
        this.d = bkeVar;
        this.a = bkeVar.e.d;
        this.c = bkeVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bkd a() {
        bkd bkdVar = this.a;
        bke bkeVar = this.d;
        if (bkdVar != bkeVar.e) {
            if (bkeVar.d != this.c) {
                throw new ConcurrentModificationException();
            }
            this.a = bkdVar.d;
            this.f860b = bkdVar;
            return bkdVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        bkd bkdVar = this.f860b;
        if (bkdVar == null) {
            throw new IllegalStateException();
        }
        this.d.e(bkdVar, true);
        this.f860b = null;
        this.c = this.d.d;
    }
}
