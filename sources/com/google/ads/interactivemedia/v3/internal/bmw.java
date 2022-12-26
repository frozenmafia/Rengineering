package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes4.dex */
final class bmw extends bjf {
    static final bjg a = new bmu(2);

    /* renamed from: b  reason: collision with root package name */
    private final bjf f893b;

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        Date date = (Date) this.f893b.read(bncVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* bridge */ /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        this.f893b.write(bneVar, (Timestamp) obj);
    }
}
