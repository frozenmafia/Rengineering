package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class aur extends AbstractSet {

    /* renamed from: b  reason: collision with root package name */
    final aus f728b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aur(aus ausVar) {
        this.f728b = ausVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object a(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f728b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new auq(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f728b.c;
    }
}
