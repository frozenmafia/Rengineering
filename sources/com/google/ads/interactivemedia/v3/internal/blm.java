package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class blm extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        try {
            return Long.valueOf(bncVar.c());
        } catch (NumberFormatException e) {
            throw new biz(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        bneVar.j((Number) obj);
    }
}
