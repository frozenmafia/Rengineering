package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class awm extends avb {
    static final avb a = new awm(new Object[0], 0);

    /* renamed from: b  reason: collision with root package name */
    final transient Object[] f744b;
    private final transient int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awm(Object[] objArr, int i) {
        this.f744b = objArr;
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avb, com.google.ads.interactivemedia.v3.internal.auv
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.f744b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv
    final int b() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv
    final int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv
    final boolean f() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv
    final Object[] g() {
        return this.f744b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        atc.j(i, this.c);
        Object obj = this.f744b[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
