package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bdi {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f804b;

    /* synthetic */ bdi(Class cls, Class cls2) {
        this.a = cls;
        this.f804b = cls2;
    }

    bdi(Class cls, Class cls2, byte[] bArr) {
        this(cls, cls2);
    }

    public static bdi c(bei beiVar, Class cls, Class cls2) {
        return new bdi(cls, cls2, null);
    }

    public final Class a() {
        return (Class) this.a;
    }

    public final Class b() {
        return (Class) this.f804b;
    }

    public final byte[] d() {
        return ((bie) this.a).b();
    }

    public final byte[] e() {
        return ((bie) this.f804b).b();
    }

    public bdi(byte[] bArr, byte[] bArr2) {
        this.a = bie.a(bArr);
        this.f804b = bie.a(bArr2);
    }
}
