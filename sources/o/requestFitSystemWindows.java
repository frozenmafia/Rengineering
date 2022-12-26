package o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes3.dex */
public final class requestFitSystemWindows {
    public static final requestFitSystemWindows ag$a = new requestFitSystemWindows();
    private static final values values = new values();

    private requestFitSystemWindows() {
    }

    /* loaded from: classes3.dex */
    public static final class values extends ThreadLocal<DateFormat> {
        values() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: ag$a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    private final DateFormat valueOf() {
        DateFormat dateFormat = values.get();
        if (dateFormat != null) {
            return dateFormat;
        }
        throw new IllegalArgumentException("Unable to find valid dateformatter".toString());
    }

    public static final String toString(Date date) {
        runAnimators.valueOf(date, "date");
        String format = ag$a.valueOf().format(date);
        runAnimators.toString(format, "iso8601Format.format(date)");
        return format;
    }

    public static final Date values(String str) {
        runAnimators.valueOf(str, "date");
        try {
            Date parse = ag$a.valueOf().parse(str);
            if (parse != null) {
                return parse;
            }
            throw new java.text.ParseException("DateFormat.parse returned null", 0);
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException("Failed to parse timestamp", e);
        }
    }
}
