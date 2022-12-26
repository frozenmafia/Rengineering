package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bpy implements Iterator {
    private final Iterator a;

    public bpy(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return entry.getValue() instanceof bpz ? new bpx(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
