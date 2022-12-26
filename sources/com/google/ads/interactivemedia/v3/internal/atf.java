package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes4.dex */
public final class atf extends axd {
    final /* synthetic */ Iterator a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ asz f710b;
    private Object c;
    private int d;

    protected atf() {
        this.d = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atf(Iterator it, asz aszVar) {
        this();
        this.a = it;
        this.f710b = aszVar;
    }

    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.f710b.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }

    protected final void b() {
        this.d = 3;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.d = 2;
            Object obj = this.c;
            this.c = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0) {
                    if (i2 != 2) {
                        this.d = 4;
                        this.c = a();
                        if (this.d != 3) {
                            this.d = 1;
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            throw null;
        }
        throw new IllegalStateException();
    }
}
