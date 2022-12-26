package o;

import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
public class onCreateLayoutManager {
    static AtomicReference<onCreateAdapter> valueOf = new AtomicReference<>();

    static onCreateAdapter ah$a() {
        onCreateAdapter oncreateadapter;
        onCreateAdapter oncreateadapter2 = valueOf.get();
        if (oncreateadapter2 == null) {
            oncreateadapter = onCreateAdapter.ah$a;
            return oncreateadapter;
        }
        return oncreateadapter2;
    }

    public static Calendar valueOf() {
        Calendar values = ah$a().values();
        values.set(11, 0);
        values.set(12, 0);
        values.set(13, 0);
        values.set(14, 0);
        values.setTimeZone(TimeZone.getTimeZone("UTC"));
        return values;
    }

    public static Calendar values() {
        return toString(null);
    }

    static Calendar toString(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    public static Calendar ag$a(Calendar calendar) {
        Calendar oncreatelayoutmanager = toString(calendar);
        Calendar values = values();
        values.set(oncreatelayoutmanager.get(1), oncreatelayoutmanager.get(2), oncreatelayoutmanager.get(5));
        return values;
    }

    public static long valueOf(long j) {
        Calendar values = values();
        values.setTimeInMillis(j);
        return ag$a(values).getTimeInMillis();
    }

    public static DateFormat ah$a(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    private static java.text.DateFormat toString(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateInstance;
    }

    public static DateFormat valueOf(Locale locale) {
        return ah$a("MMMEd", locale);
    }

    public static DateFormat ag$a(Locale locale) {
        return ah$a("yMMMEd", locale);
    }

    public static java.text.DateFormat values(Locale locale) {
        return toString(0, locale);
    }
}
