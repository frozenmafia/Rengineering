package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class bln extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        String h = bncVar.h();
        if (h.length() != 1) {
            throw new biz("Expecting character, got: " + h + "; at " + bncVar.f());
        }
        return Character.valueOf(h.charAt(0));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        bneVar.k(ch == null ? null : ch.toString());
    }
}
