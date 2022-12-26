package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* loaded from: classes4.dex */
final class bma extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        bncVar.j();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (bncVar.r() != 4) {
            String g = bncVar.g();
            int b2 = bncVar.b();
            if ("year".equals(g)) {
                i = b2;
            } else if ("month".equals(g)) {
                i2 = b2;
            } else if ("dayOfMonth".equals(g)) {
                i3 = b2;
            } else if ("hourOfDay".equals(g)) {
                i4 = b2;
            } else if ("minute".equals(g)) {
                i5 = b2;
            } else if ("second".equals(g)) {
                i6 = b2;
            }
        }
        bncVar.l();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            bneVar.g();
            return;
        }
        bneVar.c();
        bneVar.f("year");
        bneVar.h(calendar.get(1));
        bneVar.f("month");
        bneVar.h(calendar.get(2));
        bneVar.f("dayOfMonth");
        bneVar.h(calendar.get(5));
        bneVar.f("hourOfDay");
        bneVar.h(calendar.get(11));
        bneVar.f("minute");
        bneVar.h(calendar.get(12));
        bneVar.f("second");
        bneVar.h(calendar.get(13));
        bneVar.e();
    }
}
