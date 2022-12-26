package o;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes5.dex */
final class setMeasureSpecs$ah$a implements removeAndRecycleViewAt<Date> {
    private static final DateFormat toString;

    private setMeasureSpecs$ah$a() {
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        toString = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // o.onAddFocusables
    /* renamed from: ah$a */
    public void ag$a(Date date, requestSimpleAnimationsInNextLayout requestsimpleanimationsinnextlayout) throws IOException {
        requestsimpleanimationsinnextlayout.toString(toString.format(date));
    }
}
