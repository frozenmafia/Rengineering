package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
/* loaded from: classes4.dex */
final class awn extends avb {
    final /* synthetic */ awo a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awn(awo awoVar) {
        this.a = awoVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.a.c;
        atc.j(i, i2);
        awo awoVar = this.a;
        int i3 = i + i;
        objArr = awoVar.f745b;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = awoVar.f745b;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.a.c;
        return i;
    }
}
