package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class auy extends avb {
    private final transient avb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public auy(avb avbVar) {
        this.a = avbVar;
    }

    private final int u(int i) {
        return (size() - 1) - i;
    }

    private final int v(int i) {
        return size() - i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avb, com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final boolean f() {
        return this.a.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        atc.j(i, size());
        return this.a.get(u(i));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avb
    public final avb h() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avb
    public final avb i(int i, int i2) {
        atc.h(i, i2, size());
        return this.a.subList(v(i2), v(i)).h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avb, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return u(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avb, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return u(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avb, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
