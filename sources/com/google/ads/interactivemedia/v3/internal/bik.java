package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes4.dex */
final class bik extends bjf {
    final /* synthetic */ bjf a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bik(bjf bjfVar) {
        this.a = bjfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        return new AtomicLong(((Number) this.a.read(bncVar)).longValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        this.a.write(bneVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
