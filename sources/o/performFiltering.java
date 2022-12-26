package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import o.TextViewBindingAdapter;
/* loaded from: classes4.dex */
public final class performFiltering implements getViewHorizontalDragRange {
    private static int HaptikSDK$c = 0;
    private static long ah$a = 0;
    private static int invoke = 1;
    private static char valueOf = 0;
    private static int values = 773797235;
    private final setCurrentTabTag ag$a;
    private final TextViewBindingAdapter.AfterTextChanged toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof performFiltering)) {
            try {
                int i = HaptikSDK$c + 87;
                invoke = i % 128;
                int i2 = i % 2;
                return false;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            performFiltering performfiltering = (performFiltering) obj;
            if (!(!runAnimators.values(this.ag$a, performfiltering.ag$a))) {
                if (!(!runAnimators.values(this.toString, performfiltering.toString))) {
                    return true;
                }
                int i3 = HaptikSDK$c + 1;
                invoke = i3 % 128;
                int i4 = i3 % 2;
            }
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = HaptikSDK$c + 99;
        invoke = i % 128;
        return !(i % 2 == 0) ? (this.ag$a.hashCode() * 31) + this.toString.hashCode() : (this.ag$a.hashCode() << 51) >> this.toString.hashCode();
    }

    public String toString() {
        String str = "ImageEdited(_source=" + this.ag$a + ", _type=" + this.toString + ')';
        int i = invoke + 1;
        HaptikSDK$c = i % 128;
        if ((i % 2 != 0 ? (char) 16 : '*') != '*') {
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return str;
    }

    public performFiltering(setCurrentTabTag setcurrenttabtag, TextViewBindingAdapter.AfterTextChanged afterTextChanged) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        runAnimators.ag$a(afterTextChanged, "_type");
        this.ag$a = setcurrenttabtag;
        this.toString = afterTextChanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ImageEdited");
        hashMap.put(toString(ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{2014, 31746, 42694, 40325}, new char[]{0, 0, 0, 0}, (char) (34213 - TextUtils.lastIndexOf("", '0', 0)), new char[]{61618, 24885, 13500, 14041, 47188, 14378}).intern(), this.ag$a.ah$a());
        hashMap.put("type", this.toString.values());
        int i = invoke + 21;
        HaptikSDK$c = i % 128;
        if ((i % 2 != 0 ? '\"' : 'D') != '\"') {
            return hashMap;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return hashMap;
    }

    private static String toString(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$a) ^ values) ^ valueOf);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
