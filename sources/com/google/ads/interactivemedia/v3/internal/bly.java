package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.UUID;
/* loaded from: classes4.dex */
final class bly extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        String h = bncVar.h();
        try {
            return UUID.fromString(h);
        } catch (IllegalArgumentException e) {
            throw new biz("Failed parsing '" + h + "' as UUID; at path " + bncVar.f(), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        bneVar.k(uuid == null ? null : uuid.toString());
    }
}
