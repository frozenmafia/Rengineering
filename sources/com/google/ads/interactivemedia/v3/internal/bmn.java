package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes4.dex */
final class bmn extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        try {
            return new AtomicInteger(bncVar.b());
        } catch (NumberFormatException e) {
            throw new biz(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        bneVar.h(((AtomicInteger) obj).get());
    }
}
