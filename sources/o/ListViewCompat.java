package o;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class ListViewCompat implements getViewHorizontalDragRange {
    private static int ah$a = 1;
    private static int[] toString = {-1660212964, -1552037883, -2066409759, -803038039, 1077251642, 671760005, -1301394530, 1580710121, 1825941264, -11965212, -1089821814, -1575876069, -61153705, -204714146, -877481217, 1918370601, 1023891121, 309027752};
    private static int values;
    private final ProgressBarBindingAdapter ag$a;
    private final setCurrentTabTag valueOf;

    public boolean equals(Object obj) {
        if ((this == obj ? 'W' : (char) 18) == 'W') {
            int i = values + 81;
            ah$a = i % 128;
            int i2 = i % 2;
            return true;
        } else if (!(obj instanceof ListViewCompat)) {
            int i3 = ah$a + 125;
            values = i3 % 128;
            int i4 = i3 % 2;
            return false;
        } else {
            try {
                ListViewCompat listViewCompat = (ListViewCompat) obj;
                if (runAnimators.values(this.ag$a, listViewCompat.ag$a)) {
                    return runAnimators.values(this.valueOf, listViewCompat.valueOf);
                }
                int i5 = values + 45;
                ah$a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = values + 63;
                ah$a = i7 % 128;
                if ((i7 % 2 == 0 ? '\b' : TokenParser.ESCAPE) != '\\') {
                    int i8 = 32 / 0;
                    return false;
                }
                return false;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public int hashCode() {
        int i = ah$a + 105;
        values = i % 128;
        int i2 = i % 2;
        try {
            int hashCode = this.ag$a.hashCode();
            try {
                setCurrentTabTag setcurrenttabtag = this.valueOf;
                int hashCode2 = (hashCode * 31) + (setcurrenttabtag == null ? 0 : setcurrenttabtag.hashCode());
                int i3 = values + 123;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return hashCode2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = "CarouselLoaded(_result=" + this.ag$a + ", _source=" + this.valueOf + ')';
        try {
            int i = ah$a + 25;
            try {
                values = i % 128;
                if (!(i % 2 != 0)) {
                    return str;
                }
                Object obj = null;
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public ListViewCompat(ProgressBarBindingAdapter progressBarBindingAdapter, setCurrentTabTag setcurrenttabtag) {
        try {
            runAnimators.ag$a(progressBarBindingAdapter, "_result");
            this.ag$a = progressBarBindingAdapter;
            this.valueOf = setcurrenttabtag;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "CarouselLoaded");
        hashMap.put(com.dreampay.commons.constants.Constants.RESULT, this.ag$a.ah$a());
        setCurrentTabTag setcurrenttabtag = this.valueOf;
        if (!(setcurrenttabtag == null)) {
            hashMap.put(ah$a(new int[]{120562192, -864791608, 753331363, 1002436137}, 6 - TextUtils.getOffsetBefore("", 0)).intern(), setcurrenttabtag.ah$a());
            int i = values + 77;
            ah$a = i % 128;
            int i2 = i % 2;
        }
        int i3 = values + 93;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return hashMap;
    }

    private static String ah$a(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) toString.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
