package o;

import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getSupportedActivities implements getViewHorizontalDragRange {
    private static int HaptikSDK$c = 1;
    private static int ag$a = 96;
    private static char[] ah$a = {211, 207, 213, 210, 195, 197};
    private static int ah$b = 0;
    private static boolean toString = true;
    private static boolean values = true;
    private final setCurrentTabTag valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = ah$b + 73;
            HaptikSDK$c = i % 128;
            if (i % 2 != 0) {
                return true;
            }
            int i2 = 30 / 0;
            return true;
        }
        if ((!(obj instanceof getSupportedActivities) ? (char) 6 : '`') == 6) {
            int i3 = HaptikSDK$c + 89;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = HaptikSDK$c + 39;
            ah$b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        try {
            if (runAnimators.values(this.valueOf, ((getSupportedActivities) obj).valueOf)) {
                return true;
            }
            int i7 = HaptikSDK$c + 33;
            ah$b = i7 % 128;
            int i8 = i7 % 2;
            return false;
        } catch (Exception e) {
            throw e;
        }
    }

    public int hashCode() {
        try {
            int i = HaptikSDK$c + 35;
            try {
                ah$b = i % 128;
                int i2 = i % 2;
                int hashCode = this.valueOf.hashCode();
                int i3 = ah$b + 59;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                return hashCode;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = "FollowersListPageLoaded(_source=" + this.valueOf + ')';
        int i = ah$b + 51;
        HaptikSDK$c = i % 128;
        if (!(i % 2 == 0)) {
            return str;
        }
        int i2 = 14 / 0;
        return str;
    }

    public getSupportedActivities(setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.valueOf = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "FollowersListPageLoaded");
        hashMap.put(ah$a(null, null, 127 - (ViewConfiguration.getTouchSlop() >> 8), new byte[]{-122, -123, -124, -125, -126, -127}).intern(), this.valueOf.ah$a());
        int i = HaptikSDK$c + 9;
        ah$b = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String ah$a(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = ah$a;
            int i2 = ag$a;
            if (toString) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (values) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
