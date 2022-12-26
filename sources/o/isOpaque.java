package o;

import android.text.TextUtils;
import java.util.Date;
import java.util.Map;
/* loaded from: classes6.dex */
class isOpaque {
    private static int toString = 0;
    private static int valueOf = 1;
    private static int[] values = {1948286731, -994886567, -491669402, -1746986109, 1825462350, 932780151, 33210988, -925002578, -1758165874, -276131613, -920635807, 1721289651, -583868291, -752190503, -583154469, 459083594, -166819484, 1423304093};

    public isPaddingRelative ah$a(Map<String, Object> map) {
        Date date;
        isInLayout isinlayout = new isInLayout((String) setNextClusterForwardId.toString(map, "manufacturer"), (String) setNextClusterForwardId.toString(map, "model"), (String) setNextClusterForwardId.toString(map, "osVersion"), setNextClusterForwardId.ag$a(map, "apiLevel"), (String) setNextClusterForwardId.toString(map, "osBuild"), (String) setNextClusterForwardId.toString(map, "fingerprint"), (String) setNextClusterForwardId.toString(map, "tags"), (String) setNextClusterForwardId.toString(map, "brand"), (String[]) setNextClusterForwardId.toString(map, "cpuAbis"));
        String str = (String) setNextClusterForwardId.toString(map, "time");
        if (!(str == null)) {
            int i = valueOf + 77;
            toString = i % 128;
            if (i % 2 != 0) {
                date = requestFitSystemWindows.values(str);
                int i2 = 73 / 0;
            } else {
                date = requestFitSystemWindows.values(str);
            }
        } else {
            date = null;
        }
        return new isPaddingRelative(isinlayout, (Boolean) setNextClusterForwardId.toString(map, "jailbroken"), (String) setNextClusterForwardId.toString(map, valueOf(new int[]{-135838793, -1657455860}, 1 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()), (String) setNextClusterForwardId.toString(map, com.facebook.hermes.intl.Constants.LOCALE), setNextClusterForwardId.ah$a(map, "totalMemory"), (Map) setNextClusterForwardId.toString(map, "runtimeVersions"), setNextClusterForwardId.ah$a(map, "freeDisk"), setNextClusterForwardId.ah$a(map, "freeMemory"), (String) setNextClusterForwardId.toString(map, "orientation"), date);
    }

    private static String valueOf(int[] iArr, int i) {
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
