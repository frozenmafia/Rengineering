package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public final class biq extends bis implements Iterable {
    private final List a = new ArrayList();

    public final void a(bis bisVar) {
        this.a.add(bisVar);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof biq) && ((biq) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
