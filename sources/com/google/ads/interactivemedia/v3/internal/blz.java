package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Currency;
/* loaded from: classes4.dex */
final class blz extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        String h = bncVar.h();
        try {
            return Currency.getInstance(h);
        } catch (IllegalArgumentException e) {
            throw new biz("Failed parsing '" + h + "' as Currency; at path " + bncVar.f(), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        bneVar.k(((Currency) obj).getCurrencyCode());
    }
}
