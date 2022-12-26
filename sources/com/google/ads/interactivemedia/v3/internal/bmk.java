package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class bmk extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        try {
            int b2 = bncVar.b();
            if (b2 > 255 || b2 < -128) {
                throw new biz("Lossy conversion from " + b2 + " to byte; at path " + bncVar.f());
            }
            return Byte.valueOf((byte) b2);
        } catch (NumberFormatException e) {
            throw new biz(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        bneVar.j((Number) obj);
    }
}
