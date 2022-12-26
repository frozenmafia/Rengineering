package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/* loaded from: classes4.dex */
final class blw extends bjf {
    public static final URI a(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        try {
            String h = bncVar.h();
            if ("null".equals(h)) {
                return null;
            }
            return new URI(h);
        } catch (URISyntaxException e) {
            throw new bit(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        return a(bncVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        bneVar.k(uri == null ? null : uri.toASCIIString());
    }
}
