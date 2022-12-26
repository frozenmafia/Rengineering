package o;

import java.util.Map;
/* loaded from: classes6.dex */
public final class getImportantForAutofill {
    private static char[] ag$a = {'4', 'f'};
    private static int toString = 0;
    private static int valueOf = 1;

    public void ag$a(Map<String, Object> map, getMeasuredHeightAndState getmeasuredheightandstate) {
        int i = toString + 87;
        valueOf = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(map, "map");
        runAnimators.ag$a(getmeasuredheightandstate, "app");
        map.put("type", getmeasuredheightandstate.HaptikSDK$a());
        map.put("binaryArch", getmeasuredheightandstate.values());
        map.put("buildUuid", getmeasuredheightandstate.valueOf());
        map.put("codeBundleId", getmeasuredheightandstate.ah$a());
        map.put("duration", getmeasuredheightandstate.ah$b());
        map.put("durationInForeground", getmeasuredheightandstate.HaptikWebView());
        map.put(toString(true, new int[]{0, 2, 0, 1}, new byte[]{1, 1}).intern(), getmeasuredheightandstate.ag$a());
        map.put("inForeground", getmeasuredheightandstate.HaptikSDK$e());
        map.put("isLaunching", getmeasuredheightandstate.getSignupData());
        map.put("releaseStage", getmeasuredheightandstate.HaptikSDK$b());
        map.put("version", getmeasuredheightandstate.invoke());
        map.put("versionCode", getmeasuredheightandstate.HaptikSDK$c());
        int i3 = toString + 45;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
    }

    private static String toString(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ag$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
