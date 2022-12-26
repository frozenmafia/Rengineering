package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.net.URL;
/* loaded from: classes4.dex */
final class blv extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        String h = bncVar.h();
        if ("null".equals(h)) {
            return null;
        }
        return new URL(h);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        URL url = (URL) obj;
        bneVar.k(url == null ? null : url.toExternalForm());
    }
}
