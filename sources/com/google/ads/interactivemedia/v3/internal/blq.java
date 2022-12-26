package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.math.BigInteger;
/* loaded from: classes4.dex */
final class blq extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        String h = bncVar.h();
        try {
            return new BigInteger(h);
        } catch (NumberFormatException e) {
            throw new biz("Failed parsing '" + h + "' as BigInteger; at path " + bncVar.f(), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        bneVar.j((BigInteger) obj);
    }
}
