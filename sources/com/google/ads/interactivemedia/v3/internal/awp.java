package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class awp extends avk {
    private final transient avf a;

    /* renamed from: b  reason: collision with root package name */
    private final transient avb f746b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awp(avf avfVar, avb avbVar) {
        this.a = avfVar;
        this.f746b = avbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final int a(Object[] objArr, int i) {
        return this.f746b.a(objArr, i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk, com.google.ads.interactivemedia.v3.internal.auv
    public final avb d() {
        return this.f746b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk, com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final axd iterator() {
        return this.f746b.listIterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
