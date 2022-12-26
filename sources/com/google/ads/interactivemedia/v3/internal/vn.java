package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class vn implements Comparable {
    private final boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1317b;

    public vn(s sVar, int i) {
        this.a = 1 == (sVar.d & 1);
        this.f1317b = vy.j(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(vn vnVar) {
        return aug.j().d(this.f1317b, vnVar.f1317b).d(this.a, vnVar.a).a();
    }
}
