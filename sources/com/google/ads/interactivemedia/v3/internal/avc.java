package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class avc {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f734b;
    private final Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public avc(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.f734b = obj2;
        this.c = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.a + "=" + this.f734b + " and " + this.a + "=" + this.c);
    }
}
