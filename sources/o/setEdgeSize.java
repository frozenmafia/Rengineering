package o;

import android.util.TypedValue;
import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
/* loaded from: classes4.dex */
public final class setEdgeSize implements getViewHorizontalDragRange {
    private static int toString = 1;
    private static int valueOf;
    private static int[] values = {699278272, 1427197381, -599926069, 867964152, -2053702861, -1082116590, 1866175257, 161597096, 44109793, 932794929, 1072329405, 344260776, -1687762610, 1325073691, -1119060610, -2100766039, 1872105064, 1581881615};
    private final SeekBarBindingAdapter.OnProgressChanged ag$a;
    private final setCurrentTabTag ah$a;

    public boolean equals(Object obj) {
        if (!(this != obj)) {
            return true;
        }
        try {
            if ((!(obj instanceof setEdgeSize) ? 'P' : 'c') != 'c') {
                int i = toString + 17;
                try {
                    valueOf = i % 128;
                    return i % 2 != 0;
                } catch (Exception e) {
                    throw e;
                }
            }
            setEdgeSize setedgesize = (setEdgeSize) obj;
            if (runAnimators.values(this.ag$a, setedgesize.ag$a)) {
                return runAnimators.values(this.ah$a, setedgesize.ah$a);
            }
            int i2 = valueOf + 45;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.ag$a.hashCode();
        setCurrentTabTag setcurrenttabtag = this.ah$a;
        if ((setcurrenttabtag == null ? 'Q' : '<') != '<') {
            int i = valueOf + 9;
            toString = i % 128;
            hashCode = i % 2 == 0 ? 1 : 0;
            try {
                int i2 = valueOf + 35;
                toString = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                throw e;
            }
        } else {
            hashCode = setcurrenttabtag.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public String toString() {
        String str = "SideDrawerSelection(_selection=" + this.ag$a + ", _source=" + this.ah$a + ')';
        int i = valueOf + 35;
        toString = i % 128;
        if ((i % 2 == 0 ? 'Y' : 'B') != 'Y') {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public setEdgeSize(SeekBarBindingAdapter.OnProgressChanged onProgressChanged, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(onProgressChanged, "_selection");
        this.ag$a = onProgressChanged;
        this.ah$a = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "SideDrawerSelection");
        hashMap.put("selection", this.ag$a.ag$a());
        setCurrentTabTag setcurrenttabtag = this.ah$a;
        if (!(setcurrenttabtag == null)) {
            int i = toString + 113;
            valueOf = i % 128;
            hashMap.put(((i % 2 != 0 ? 'c' : '3') != '3' ? toString(new int[]{-502549018, 1222761241, 300656108, -2144493417}, 55 / (TypedValue.complexToFraction(1, 0.0f, 0.0f) > 2.0f ? 1 : (TypedValue.complexToFraction(1, 0.0f, 0.0f) == 2.0f ? 0 : -1))) : toString(new int[]{-502549018, 1222761241, 300656108, -2144493417}, 6 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), setcurrenttabtag.ah$a());
        }
        int i2 = valueOf + 9;
        toString = i2 % 128;
        if ((i2 % 2 == 0 ? 'D' : 'R') != 'D') {
            return hashMap;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return hashMap;
    }

    private static String toString(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) values.clone();
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
