package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
final class bmo extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        return new AtomicBoolean(bncVar.q());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        bneVar.l(((AtomicBoolean) obj).get());
    }
}
