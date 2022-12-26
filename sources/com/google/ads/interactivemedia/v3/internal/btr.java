package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class btr {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final int f989b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btr(Object obj) {
        this.f989b = System.identityHashCode(obj);
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btr) {
            btr btrVar = (btr) obj;
            return this.f989b == btrVar.f989b && this.a == btrVar.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f989b;
    }
}
