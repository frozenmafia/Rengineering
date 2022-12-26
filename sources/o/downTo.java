package o;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public final class downTo {
    private static final SimpleDateFormat HaptikSDK$c;
    private static final SimpleDateFormat ag$a;
    private static final SimpleDateFormat ah$a;
    private static final SimpleDateFormat invoke;
    private static final SimpleDateFormat toString;
    private static final SimpleDateFormat valueOf;
    private static final SimpleDateFormat values;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        ah$a = simpleDateFormat;
        ag$a = new SimpleDateFormat("d'suffix' MMM HH.mm aaa");
        valueOf = new SimpleDateFormat("EEE',' d'suffix' MMM',' hh:mm aaa");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'UTC' yyyy");
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        values = simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
        simpleDateFormat3.setTimeZone(TimeZone.getTimeZone("UTC"));
        toString = simpleDateFormat3;
        HaptikSDK$c = new SimpleDateFormat("hh.mm aaa");
        invoke = new SimpleDateFormat("EEE',' d MMM - hh.mm aaa");
    }

    public static final SimpleDateFormat values() {
        return ah$a;
    }

    public static /* synthetic */ String ag$a(long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ah$a(j, z);
    }

    public static final String ah$a(long j, boolean z) {
        if (j < 0) {
            j = 0;
        }
        long days = TimeUnit.MILLISECONDS.toDays(j);
        long millis = j - TimeUnit.DAYS.toMillis(days);
        long hours = TimeUnit.MILLISECONDS.toHours(millis);
        long millis2 = millis - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis2);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2 - TimeUnit.MINUTES.toMillis(minutes));
        StringBuilder sb = new StringBuilder(64);
        if (days > 0) {
            sb.append(days);
            sb.append(" Days ");
        }
        if (hours > 0) {
            sb.append(hours);
            sb.append(" Hours ");
        }
        if (minutes > 0) {
            sb.append(minutes);
            sb.append(" Minutes ");
        }
        if (seconds > 0 && z) {
            sb.append(seconds);
            sb.append(" Seconds");
        }
        String sb2 = sb.toString();
        runAnimators.ah$a(sb2, "sb.toString()");
        return sb2;
    }

    public static final String toString(int i) {
        if (!(11 <= i && i < 14)) {
            int i2 = i % 10;
            if (i2 == 1) {
                return "st";
            }
            if (i2 == 2) {
                return "nd";
            }
            if (i2 == 3) {
                return "rd";
            }
        }
        return "th";
    }
}
