package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class blo extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        int r = bncVar.r();
        if (r == 9) {
            bncVar.m();
            return null;
        } else if (r == 8) {
            return Boolean.toString(bncVar.q());
        } else {
            return bncVar.h();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        bneVar.k((String) obj);
    }
}
