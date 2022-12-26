package com.apxor.androidsdk.core.utils;

import com.apxor.androidsdk.core.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes3.dex */
public class DateTimeUtils {
    private SimpleDateFormat a;

    /* renamed from: b  reason: collision with root package name */
    private SimpleDateFormat f274b;

    public DateTimeUtils() {
        Locale locale = Locale.US;
        this.a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
        this.f274b = new SimpleDateFormat("yyyy-MM-dd", locale);
    }

    public String getCurrentTimeStamp() {
        return getTimeStampFromDate(new Date());
    }

    public Date getDateFromTimeStamp(String str) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = this.a;
        return simpleDateFormat != null ? simpleDateFormat.parse(str) : date;
    }

    public String getDateString(Date date) {
        SimpleDateFormat simpleDateFormat = this.f274b;
        return (simpleDateFormat == null || date == null) ? Constants.DEFAULT_DATE : simpleDateFormat.format(date);
    }

    public long getTimeFromDate(String str) {
        try {
            return this.f274b.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public String getTimeStampFromDate(Date date) {
        SimpleDateFormat simpleDateFormat = this.a;
        return (simpleDateFormat == null || date == null) ? Constants.DEFAULT_DATE : simpleDateFormat.format(date);
    }

    public String getTimeStampFromMilliSeconds(long j) {
        SimpleDateFormat simpleDateFormat = this.a;
        return simpleDateFormat == null ? Constants.DEFAULT_DATE : simpleDateFormat.format(new Date(j));
    }
}
