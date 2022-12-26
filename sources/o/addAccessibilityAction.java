package o;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes3.dex */
public final class addAccessibilityAction {
    public static final SimpleDateFormat values() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}
