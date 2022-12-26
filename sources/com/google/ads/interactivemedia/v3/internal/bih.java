package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bih extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        return Double.valueOf(bncVar.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bneVar.g();
            return;
        }
        bin.h(number.doubleValue());
        bneVar.j(number);
    }
}
