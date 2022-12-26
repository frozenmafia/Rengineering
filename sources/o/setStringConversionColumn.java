package o;

import android.graphics.Color;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
import o.TextViewBindingAdapter;
/* loaded from: classes4.dex */
public final class setStringConversionColumn implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 1;
    private static int ah$a = 0;
    private static int ah$b = 0;
    private static char invoke = 30652;
    private static long toString;
    private final SeekBarBindingAdapter.OnProgressChanged ag$a;
    private final TextViewBindingAdapter.AfterTextChanged valueOf;
    private final ObservableShort values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setStringConversionColumn)) {
            int i = HaptikSDK$b + 87;
            ah$b = i % 128;
            int i2 = i % 2;
            return false;
        }
        setStringConversionColumn setstringconversioncolumn = (setStringConversionColumn) obj;
        if (runAnimators.values(this.values, setstringconversioncolumn.values)) {
            if (!(!runAnimators.values(this.ag$a, setstringconversioncolumn.ag$a))) {
                if ((!runAnimators.values(this.valueOf, setstringconversioncolumn.valueOf) ? ':' : 'V') != 'V') {
                    int i3 = ah$b + 65;
                    HaptikSDK$b = i3 % 128;
                    return i3 % 2 == 0;
                }
                return true;
            }
            int i4 = HaptikSDK$b + 95;
            ah$b = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr = null;
                int length = objArr.length;
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = ah$b + 77;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        int hashCode = (((this.values.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.valueOf.hashCode();
        int i3 = HaptikSDK$b + 121;
        ah$b = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    public String toString() {
        String str = "LocationBottomSheetInteracted(_flow=" + this.values + ", _selection=" + this.ag$a + ", _type=" + this.valueOf + ')';
        int i = ah$b + 91;
        HaptikSDK$b = i % 128;
        if ((i % 2 == 0 ? 'O' : 'F') != 'F') {
            int i2 = 22 / 0;
            return str;
        }
        return str;
    }

    public setStringConversionColumn(ObservableShort observableShort, SeekBarBindingAdapter.OnProgressChanged onProgressChanged, TextViewBindingAdapter.AfterTextChanged afterTextChanged) {
        runAnimators.ag$a(observableShort, "_flow");
        runAnimators.ag$a(onProgressChanged, "_selection");
        runAnimators.ag$a(afterTextChanged, "_type");
        this.values = observableShort;
        this.ag$a = onProgressChanged;
        this.valueOf = afterTextChanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "LocationBottomSheetInteracted");
        hashMap.put(valueOf(ViewConfiguration.getLongPressTimeout() >> 16, new char[]{42884, 65266, 10009, 19131}, new char[]{0, 0, 0, 0}, (char) (47911 - Color.alpha(0)), new char[]{33199, 44674, 35133, 8371}).intern(), this.values.valueOf());
        hashMap.put("selection", this.ag$a.ag$a());
        hashMap.put("type", this.valueOf.values());
        int i = HaptikSDK$b + 5;
        ah$b = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return hashMap;
        }
        return hashMap;
    }

    private static String valueOf(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ toString) ^ ah$a) ^ invoke);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
