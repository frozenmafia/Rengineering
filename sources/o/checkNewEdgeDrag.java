package o;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes4.dex */
public final class checkNewEdgeDrag implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = 1;
    private static int ag$a = -816207925;
    private static long toString;
    private static int valueOf;
    private static char values;
    private final setCurrentTabTag ah$a;

    public boolean equals(Object obj) {
        int i = valueOf + 65;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        if (this == obj) {
            int i3 = valueOf + 107;
            HaptikSDK$a = i3 % 128;
            return i3 % 2 != 0;
        }
        if ((!(obj instanceof checkNewEdgeDrag) ? Soundex.SILENT_MARKER : 'M') != 'M') {
            return false;
        }
        return (!runAnimators.values(this.ah$a, ((checkNewEdgeDrag) obj).ah$a) ? '$' : '6') != '$';
    }

    public int hashCode() {
        try {
            int i = HaptikSDK$a + 29;
            valueOf = i % 128;
            int i2 = i % 2;
            int hashCode = this.ah$a.hashCode();
            int i3 = valueOf + 1;
            HaptikSDK$a = i3 % 128;
            if (i3 % 2 != 0) {
                return hashCode;
            }
            int i4 = 92 / 0;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        String str = "ReferralFAQviewed(_source=" + this.ah$a + ')';
        int i = HaptikSDK$a + 67;
        valueOf = i % 128;
        if ((i % 2 != 0 ? (char) 28 : ',') != ',') {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public checkNewEdgeDrag(setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.ah$a = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ReferralFAQviewed");
        hashMap.put(values(KeyEvent.getDeadChar(0, 0), new char[]{41964, 36912, 49698, 12286}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 65218), new char[]{23600, 37173, 882, 838, 62591, 1967}).intern(), this.ah$a.ah$a());
        int i = valueOf + 93;
        HaptikSDK$a = i % 128;
        if ((i % 2 == 0 ? '\f' : '@') != '\f') {
            return hashMap;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return hashMap;
    }

    private static String values(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ toString) ^ ag$a) ^ values);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
