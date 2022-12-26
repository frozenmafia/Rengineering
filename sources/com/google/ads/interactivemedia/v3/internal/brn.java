package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes4.dex */
final class brn implements Iterator {
    final /* synthetic */ brp a;

    /* renamed from: b  reason: collision with root package name */
    private int f959b = -1;
    private boolean c;
    private Iterator d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ brn(brp brpVar) {
        this.a = brpVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f959b + 1 >= this.a.f960b.size()) {
            return !this.a.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.c = true;
        int i = this.f959b + 1;
        this.f959b = i;
        if (i < this.a.f960b.size()) {
            return (Map.Entry) this.a.f960b.get(this.f959b);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        this.a.o();
        if (this.f959b < this.a.f960b.size()) {
            brp brpVar = this.a;
            int i = this.f959b;
            this.f959b = i - 1;
            brpVar.m(i);
            return;
        }
        a().remove();
    }
}
