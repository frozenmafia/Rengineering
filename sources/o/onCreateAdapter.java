package o;

import java.util.Calendar;
import java.util.TimeZone;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class onCreateAdapter {
    private static final onCreateAdapter ah$a = new onCreateAdapter(null, null);
    private final TimeZone ag$a;
    private final Long valueOf;

    private onCreateAdapter(Long l, TimeZone timeZone) {
        this.valueOf = l;
        this.ag$a = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar values() {
        return toString(this.ag$a);
    }

    Calendar toString(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.valueOf;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
