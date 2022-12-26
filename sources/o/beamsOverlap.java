package o;

import android.media.AudioTrack;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
/* loaded from: classes4.dex */
public final class beamsOverlap implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = 1;
    private static long ag$a = 0;
    private static int ah$b = 0;
    private static int toString = 0;
    private static char values = 29145;
    private final SeekBarBindingAdapter.OnProgressChanged ah$a;
    private final setCurrentTabTag valueOf;

    public boolean equals(Object obj) {
        int i = ah$b + 23;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            if (this == obj) {
                try {
                    int i3 = ah$b + 87;
                    HaptikSDK$a = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                } catch (Exception e) {
                    throw e;
                }
            } else if (obj instanceof beamsOverlap) {
                beamsOverlap beamsoverlap = (beamsOverlap) obj;
                if (!(!runAnimators.values(this.ah$a, beamsoverlap.ah$a))) {
                    return (!runAnimators.values(this.valueOf, beamsoverlap.valueOf) ? 'H' : '^') != 'H';
                }
                int i5 = ah$b + 55;
                HaptikSDK$a = i5 % 128;
                int i6 = i5 % 2;
                return false;
            } else {
                return false;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = ah$b + 97;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        int hashCode = (this.ah$a.hashCode() * 31) + this.valueOf.hashCode();
        int i3 = HaptikSDK$a + 27;
        ah$b = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    public String toString() {
        String str = "PhonebookSyncTabSelection(_selection=" + this.ah$a + ", _source=" + this.valueOf + ')';
        try {
            int i = ah$b + 91;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public beamsOverlap(SeekBarBindingAdapter.OnProgressChanged onProgressChanged, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(onProgressChanged, "_selection");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.ah$a = onProgressChanged;
        this.valueOf = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "PhonebookSyncTabSelection");
        hashMap.put("selection", this.ah$a.ag$a());
        hashMap.put(ah$a(TextUtils.lastIndexOf("", '0', 0) + 1, new char[]{60263, 54478, 33789, 5627}, new char[]{0, 0, 0, 0}, (char) (64388 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), new char[]{51788, 38220, 29509, 25739, 35547, 15484}).intern(), this.valueOf.ah$a());
        int i = HaptikSDK$a + 21;
        ah$b = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String ah$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ag$a) ^ toString) ^ values);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
