package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bje extends bjf {
    final /* synthetic */ bjf a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bje(bjf bjfVar) {
        this.a = bjfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        return this.a.read(bncVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final void write(bne bneVar, Object obj) throws IOException {
        if (obj == null) {
            bneVar.g();
        } else {
            this.a.write(bneVar, obj);
        }
    }
}
