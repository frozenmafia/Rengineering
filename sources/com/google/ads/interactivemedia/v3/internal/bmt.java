package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes4.dex */
final class bmt extends bjf {
    static final bjg a = new bmu(1);

    /* renamed from: b  reason: collision with root package name */
    private final DateFormat f891b = new SimpleDateFormat("MMM d, yyyy");

    private bmt() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    /* renamed from: a */
    public final Date read(bnc bncVar) throws IOException {
        java.util.Date parse;
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        String h = bncVar.h();
        try {
            synchronized (this) {
                parse = this.f891b.parse(h);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            throw new biz("Failed parsing '" + h + "' as SQL Date; at path " + bncVar.f(), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bneVar.g();
            return;
        }
        synchronized (this) {
            format = this.f891b.format((java.util.Date) date);
        }
        bneVar.k(format);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bmt(byte[] bArr) {
    }
}
