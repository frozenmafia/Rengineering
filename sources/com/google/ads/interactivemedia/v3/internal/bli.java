package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bli implements bjg {
    private final bna a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f881b;
    private final biy c;
    private final bir d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bli(Object obj, bna bnaVar, boolean z) {
        biy biyVar = obj instanceof biy ? (biy) obj : null;
        this.c = biyVar;
        bir birVar = obj instanceof bir ? (bir) obj : null;
        this.d = birVar;
        boolean z2 = true;
        if (biyVar == null && birVar == null) {
            z2 = false;
        }
        bic.f(z2);
        this.a = bnaVar;
        this.f881b = z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjg
    public final bjf a(bin binVar, bna bnaVar) {
        if (this.a.equals(bnaVar) || (this.f881b && this.a.d() == bnaVar.c())) {
            return new blj(this.c, this.d, binVar, bnaVar, this);
        }
        return null;
    }
}
