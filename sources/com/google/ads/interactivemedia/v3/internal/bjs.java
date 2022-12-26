package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class bjs extends bjf {
    final /* synthetic */ boolean a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f857b;
    final /* synthetic */ bin c;
    final /* synthetic */ bna d;
    final /* synthetic */ bjt e;
    private bjf f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bjs(bjt bjtVar, boolean z, boolean z2, bin binVar, bna bnaVar) {
        this.e = bjtVar;
        this.a = z;
        this.f857b = z2;
        this.c = binVar;
        this.d = bnaVar;
    }

    private final bjf a() {
        bjf bjfVar = this.f;
        if (bjfVar != null) {
            return bjfVar;
        }
        bjf c = this.c.c(this.e, this.d);
        this.f = c;
        return c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final Object read(bnc bncVar) throws IOException {
        if (this.a) {
            bncVar.o();
            return null;
        }
        return a().read(bncVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final void write(bne bneVar, Object obj) throws IOException {
        if (this.f857b) {
            bneVar.g();
        } else {
            a().write(bneVar, obj);
        }
    }
}
