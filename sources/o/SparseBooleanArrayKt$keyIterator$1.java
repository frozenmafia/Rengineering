package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public final class SparseBooleanArrayKt$keyIterator$1 {
    private static final Pattern ag$a = Pattern.compile("^NOTE([ \t].*)?$");

    public static void ag$a(C$default$setContentDescription c$default$setContentDescription) throws ParserException {
        int valueOf = c$default$setContentDescription.valueOf();
        if (ah$a(c$default$setContentDescription)) {
            return;
        }
        c$default$setContentDescription.HaptikSDK$b(valueOf);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + c$default$setContentDescription.HaptikWebView(), null);
    }

    public static boolean ah$a(C$default$setContentDescription c$default$setContentDescription) {
        String HaptikWebView = c$default$setContentDescription.HaptikWebView();
        return HaptikWebView != null && HaptikWebView.startsWith("WEBVTT");
    }

    public static long ag$a(String str) throws NumberFormatException {
        String[] valueOf = getElevationDegrees.valueOf(str, "\\.");
        long j = 0;
        for (String str2 : getElevationDegrees.ah$a(valueOf[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (valueOf.length == 2) {
            j2 += Long.parseLong(valueOf[1]);
        }
        return j2 * 1000;
    }

    public static float values(String str) throws NumberFormatException {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    public static Matcher toString(C$default$setContentDescription c$default$setContentDescription) {
        String HaptikWebView;
        while (true) {
            String HaptikWebView2 = c$default$setContentDescription.HaptikWebView();
            if (HaptikWebView2 == null) {
                return null;
            }
            if (ag$a.matcher(HaptikWebView2).matches()) {
                do {
                    HaptikWebView = c$default$setContentDescription.HaptikWebView();
                    if (HaptikWebView != null) {
                    }
                } while (!HaptikWebView.isEmpty());
            } else {
                Matcher matcher = SparseIntArrayKt.ah$a.matcher(HaptikWebView2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
