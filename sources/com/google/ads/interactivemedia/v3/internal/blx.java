package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.net.InetAddress;
/* loaded from: classes4.dex */
final class blx extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        return InetAddress.getByName(bncVar.h());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        bneVar.k(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
