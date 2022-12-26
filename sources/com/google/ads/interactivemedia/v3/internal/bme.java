package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class bme implements bjg {
    final /* synthetic */ bna a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bjf f884b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bme(bna bnaVar, bjf bjfVar) {
        this.a = bnaVar;
        this.f884b = bjfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjg
    public final bjf a(bin binVar, bna bnaVar) {
        if (bnaVar.equals(this.a)) {
            return this.f884b;
        }
        return null;
    }
}
