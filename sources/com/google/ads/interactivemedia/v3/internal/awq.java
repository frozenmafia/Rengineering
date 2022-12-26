package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class awq extends avb {
    private final transient Object[] a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f747b;
    private final transient int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awq(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.f747b = i;
        this.c = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv
    final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        atc.j(i, this.c);
        Object obj = this.a[i + i + this.f747b];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
