package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class blc implements bjg {
    final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f876b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public blc(bjd bjdVar, int i) {
        this.f876b = i;
        this.a = bjdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public blc(blb blbVar, int i) {
        this.f876b = i;
        this.a = blbVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ads.interactivemedia.v3.internal.bjd, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.bjg
    public final bjf a(bin binVar, bna bnaVar) {
        if (this.f876b != 0) {
            if (bnaVar.c() == Number.class) {
                return (bjf) this.a;
            }
            return null;
        } else if (bnaVar.c() == Object.class) {
            return new bld(binVar, this.a);
        } else {
            return null;
        }
    }
}
