package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bjz extends AbstractSet {
    final /* synthetic */ bke a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bjz(bke bkeVar) {
        this.a = bkeVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.a.b((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new bjy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        bkd b2;
        if ((obj instanceof Map.Entry) && (b2 = this.a.b((Map.Entry) obj)) != null) {
            this.a.e(b2, true);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c;
    }
}
