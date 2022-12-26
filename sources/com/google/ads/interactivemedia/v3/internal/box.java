package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class box {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final int f921b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public box(Object obj, int i) {
        this.a = obj;
        this.f921b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof box) {
            box boxVar = (box) obj;
            return this.a == boxVar.a && this.f921b == boxVar.f921b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.f921b;
    }
}
