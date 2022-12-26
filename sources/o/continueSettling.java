package o;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class continueSettling implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 1;
    private static int ag$a = 55;
    private static int ah$b = 0;
    private static boolean invoke = true;
    private static char[] toString = {170, 166, 172, 169, 154, 156};
    private static boolean values = true;
    private final setCurrentTabTag ah$a;
    private final setCheckedButton valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = HaptikSDK$b + 77;
            ah$b = i % 128;
            return i % 2 == 0;
        }
        if (!(obj instanceof continueSettling)) {
            int i2 = HaptikSDK$b + 73;
            ah$b = i2 % 128;
            return (i2 % 2 != 0 ? (char) 23 : '+') == 23;
        }
        continueSettling continuesettling = (continueSettling) obj;
        if (runAnimators.values(this.valueOf, continuesettling.valueOf)) {
            try {
                try {
                    if (runAnimators.values(this.ah$a, continuesettling.ah$a)) {
                        return true;
                    }
                    int i3 = HaptikSDK$b + 43;
                    ah$b = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        try {
            setCheckedButton setcheckedbutton = this.valueOf;
            if (!(setcheckedbutton == null)) {
                i = setcheckedbutton.hashCode();
                try {
                    int i2 = HaptikSDK$b + 25;
                    ah$b = i2 % 128;
                    int i3 = i2 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                i = 0;
            }
            int hashCode = (i * 31) + this.ah$a.hashCode();
            int i4 = ah$b + 7;
            HaptikSDK$b = i4 % 128;
            if (i4 % 2 != 0) {
                return hashCode;
            }
            Object obj = null;
            super.hashCode();
            return hashCode;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = "RequestIndicatorIconClicked(_request_count=" + this.valueOf + ", _source=" + this.ah$a + ')';
        int i = HaptikSDK$b + 113;
        ah$b = i % 128;
        int i2 = i % 2;
        return str;
    }

    public continueSettling(setCheckedButton setcheckedbutton, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.valueOf = setcheckedbutton;
        this.ah$a = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "RequestIndicatorIconClicked");
        setCheckedButton setcheckedbutton = this.valueOf;
        if (setcheckedbutton != null) {
            int i = HaptikSDK$b + 35;
            ah$b = i % 128;
            int i2 = i % 2;
            hashMap.put("request_count", Integer.valueOf(setcheckedbutton.valueOf()));
            int i3 = ah$b + 121;
            HaptikSDK$b = i3 % 128;
            int i4 = i3 % 2;
        }
        hashMap.put(valueOf(null, null, KeyEvent.getDeadChar(0, 0) + 127, new byte[]{-122, -123, -124, -125, -126, -127}).intern(), this.ah$a.ah$a());
        return hashMap;
    }

    private static String valueOf(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = toString;
            int i2 = ag$a;
            if (invoke) {
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
