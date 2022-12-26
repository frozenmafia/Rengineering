package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes4.dex */
final class auq implements Iterator {
    final /* synthetic */ aur a;

    /* renamed from: b  reason: collision with root package name */
    private int f727b;
    private int c = -1;
    private int d;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public auq(aur aurVar) {
        this.a = aurVar;
        this.f727b = aus.a(aurVar.f728b);
        aus ausVar = aurVar.f728b;
        this.d = ausVar.d;
        this.e = ausVar.c;
    }

    private final void a() {
        if (this.a.f728b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f727b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = this.a.a(this.f727b);
        this.c = this.f727b;
        this.f727b = aus.l(this.a.f728b)[this.f727b];
        this.e--;
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        axb.J(this.c != -1);
        aus ausVar = this.a.f728b;
        int i = this.c;
        ausVar.j(i, axb.F(ausVar.a[i]));
        int i2 = this.f727b;
        aus ausVar2 = this.a.f728b;
        if (i2 == ausVar2.c) {
            this.f727b = this.c;
        }
        this.c = -1;
        this.d = ausVar2.d;
    }
}
