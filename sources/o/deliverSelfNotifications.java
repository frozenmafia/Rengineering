package o;

import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class deliverSelfNotifications implements getViewHorizontalDragRange {
    private static int ag$a = 0;
    private static int ah$a = 1;
    private static int[] values = {230341463, 1855034167, 1459804429, 783975249, 102337539, 955643485, -47815643, 2074031926, 1405322784, 509870974, -1089745413, 101722062, 1682386750, 755805957, -287044432, 1471034706, 1333930281, -725241980};
    private final setCurrentTabTag valueOf;

    public boolean equals(Object obj) {
        int i = ag$a + 51;
        ah$a = i % 128;
        int i2 = i % 2;
        if (this == obj) {
            int i3 = ah$a + 75;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        try {
            if (obj instanceof deliverSelfNotifications) {
                try {
                    if (!(runAnimators.values(this.valueOf, ((deliverSelfNotifications) obj).valueOf))) {
                        int i5 = ag$a + 61;
                        ah$a = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    }
                    return true;
                } catch (Exception e) {
                    throw e;
                }
            }
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = ah$a + 39;
        ag$a = i % 128;
        int i2 = i % 2;
        int hashCode = this.valueOf.hashCode();
        int i3 = ah$a + 81;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    public String toString() {
        String str = "HOFFilterReset(_source=" + this.valueOf + ')';
        try {
            int i = ag$a + 77;
            ah$a = i % 128;
            if ((i % 2 == 0 ? TokenParser.SP : '/') != ' ') {
                return str;
            }
            int i2 = 36 / 0;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public deliverSelfNotifications(setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.valueOf = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "HOFFilterReset");
        hashMap.put(ah$a(new int[]{-1529735251, 980161917, -1978251030, 999607636}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6).intern(), this.valueOf.ah$a());
        int i = ag$a + 79;
        ah$a = i % 128;
        if (!(i % 2 != 0)) {
            Object[] objArr = null;
            int length = objArr.length;
            return hashMap;
        }
        return hashMap;
    }

    private static String ah$a(int[] iArr, int i) {
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
