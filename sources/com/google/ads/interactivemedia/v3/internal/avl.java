package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
/* loaded from: classes4.dex */
final class avl extends avb {
    final /* synthetic */ avh a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public avl(avh avhVar) {
        this.a = avhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        awt awtVar;
        avb avbVar;
        awtVar = this.a.a.f738b;
        E e = awtVar.d.get(i);
        avbVar = this.a.a.c;
        return new AbstractMap.SimpleImmutableEntry(e, avbVar.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }
}
