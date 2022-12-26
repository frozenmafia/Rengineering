package o;

import com.google.logging.type.LogSeverity;
import com.horcrux.svg.TextProperties;
/* loaded from: classes5.dex */
class setNotificationUris$ah$a {
    private static final TextProperties.FontWeight[] ah$a = {TextProperties.FontWeight.w100, TextProperties.FontWeight.w100, TextProperties.FontWeight.w200, TextProperties.FontWeight.w300, TextProperties.FontWeight.Normal, TextProperties.FontWeight.w500, TextProperties.FontWeight.w600, TextProperties.FontWeight.Bold, TextProperties.FontWeight.w800, TextProperties.FontWeight.w900, TextProperties.FontWeight.w900};
    private static final int[] valueOf = {400, LogSeverity.ALERT_VALUE, 100, 200, 300, 400, 500, LogSeverity.CRITICAL_VALUE, LogSeverity.ALERT_VALUE, LogSeverity.EMERGENCY_VALUE, 900};

    private static int ah$a(int i) {
        if (i < 350) {
            return 400;
        }
        if (i < 550) {
            return LogSeverity.ALERT_VALUE;
        }
        if (i < 900) {
            return 900;
        }
        return i;
    }

    private static int valueOf(int i) {
        if (i < 100) {
            return i;
        }
        if (i < 550) {
            return 100;
        }
        if (i < 750) {
            return 400;
        }
        return LogSeverity.ALERT_VALUE;
    }

    setNotificationUris$ah$a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TextProperties.FontWeight ag$a(int i) {
        return ah$a[Math.round(i / 100.0f)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int values(TextProperties.FontWeight fontWeight, setNotificationUris setnotificationuris) {
        if (fontWeight == TextProperties.FontWeight.Bolder) {
            return ah$a(setnotificationuris.toString);
        }
        if (fontWeight == TextProperties.FontWeight.Lighter) {
            return valueOf(setnotificationuris.toString);
        }
        return valueOf[fontWeight.ordinal()];
    }
}
