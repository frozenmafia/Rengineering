package o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.MediaBrowserServiceCompat;
/* loaded from: classes7.dex */
public class findMethod extends MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 {
    private DateFormat toString;
    private TimeUnit valueOf;
    private long values;

    public findMethod(String str, long j, TimeUnit timeUnit, Locale locale) {
        this.values = 0L;
        this.toString = new SimpleDateFormat(str, locale);
        this.values = j;
        this.valueOf = timeUnit;
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String valueOf(float f) {
        return this.toString.format(new Date(this.values + this.valueOf.toMillis(f)));
    }
}
