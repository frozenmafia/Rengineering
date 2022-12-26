package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class bmi extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        int r = bncVar.r();
        if (r == 9) {
            bncVar.m();
            return null;
        } else if (r == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(bncVar.h()));
        } else {
            return Boolean.valueOf(bncVar.q());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        bneVar.i((Boolean) obj);
    }
}
