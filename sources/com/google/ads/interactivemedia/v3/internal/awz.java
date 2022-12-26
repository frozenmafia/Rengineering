package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class awz extends avk {
    final transient Object a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awz(Object obj) {
        atc.k(obj);
        this.a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk, com.google.ads.interactivemedia.v3.internal.auv
    public final avb d() {
        return avb.p(this.a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk, com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final axd iterator() {
        return new avu(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final boolean f() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.a.toString() + ']';
    }
}
