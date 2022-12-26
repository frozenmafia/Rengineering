package o;

import com.appsamurai.storyly.exoplayer2.core.drm.DrmSession;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.WidevineUtil;
import java.util.Map;
/* loaded from: classes3.dex */
public final class getAdjustedDefault {
    public static android.util.Pair<Long, Long> ag$a(DrmSession drmSession) {
        Map<String, String> HaptikSDK$c = drmSession.HaptikSDK$c();
        if (HaptikSDK$c == null) {
            return null;
        }
        return new android.util.Pair<>(Long.valueOf(ag$a(HaptikSDK$c, WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING)), Long.valueOf(ag$a(HaptikSDK$c, WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING)));
    }

    private static long ag$a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = map.get(str);
                return str2 != null ? Long.parseLong(str2) : C.TIME_UNSET;
            } catch (NumberFormatException unused) {
                return C.TIME_UNSET;
            }
        }
        return C.TIME_UNSET;
    }
}
