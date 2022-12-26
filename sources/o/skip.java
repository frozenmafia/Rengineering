package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes3.dex */
public final class skip {
    public static final Date valueOf(String str, String str2, TimeZone timeZone) {
        runAnimators.ag$a(str, "<this>");
        runAnimators.ag$a(str2, "dateFormat");
        runAnimators.ag$a(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        Date parse = simpleDateFormat.parse(str);
        runAnimators.ah$a(parse, "parser.parse(this)");
        return parse;
    }

    public static /* synthetic */ String valueOf(Date date, String str, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
            runAnimators.ah$a(timeZone, "getDefault()");
        }
        return ag$a(date, str, timeZone);
    }

    public static final String ag$a(Date date, String str, TimeZone timeZone) {
        runAnimators.ag$a(date, "<this>");
        runAnimators.ag$a(str, "dateFormat");
        runAnimators.ag$a(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        runAnimators.ah$a(format, "formatter.format(this)");
        return format;
    }
}
