package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes4.dex */
final class bmv extends bjf {
    static final bjg a = new bmu(0);

    /* renamed from: b  reason: collision with root package name */
    private final DateFormat f892b = new SimpleDateFormat("hh:mm:ss a");

    private bmv() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    /* renamed from: a */
    public final Time read(bnc bncVar) throws IOException {
        Time time;
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        String h = bncVar.h();
        try {
            synchronized (this) {
                time = new Time(this.f892b.parse(h).getTime());
            }
            return time;
        } catch (ParseException e) {
            throw new biz("Failed parsing '" + h + "' as SQL Time; at path " + bncVar.f(), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bneVar.g();
            return;
        }
        synchronized (this) {
            format = this.f892b.format((Date) time);
        }
        bneVar.k(format);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bmv(byte[] bArr) {
    }
}
