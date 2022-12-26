package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class aws extends avk {
    static final aws a;
    private static final Object[] d;

    /* renamed from: b  reason: collision with root package name */
    final transient Object[] f749b;
    final transient Object[] c;
    private final transient int e;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        a = new aws(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aws(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f749b = objArr;
        this.e = i;
        this.c = objArr2;
        this.f = i2;
        this.g = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.f749b, 0, objArr, i, this.g);
        return i + this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final int b() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.c;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int F = axb.F(obj);
        while (true) {
            int i = F & this.f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            F = i + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk, com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final axd iterator() {
        return d().listIterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final Object[] g() {
        return this.f749b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk
    final boolean h() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk
    final avb i() {
        return avb.l(this.f749b, this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}
