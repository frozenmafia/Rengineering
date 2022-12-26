package o;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.Map;
/* loaded from: classes6.dex */
class getLayerType {
    private static int ag$a = 1;
    private static char[] ah$a = {40038, 57943};
    private static long toString = 5364496820963409468L;
    private static int values;

    public getMeasuredHeightAndState values(Map<String, Object> map) {
        getMeasuredHeightAndState getmeasuredheightandstate = new getMeasuredHeightAndState((String) setNextClusterForwardId.toString(map, "binaryArch"), (String) setNextClusterForwardId.toString(map, ag$a((ViewConfiguration.getJumpTapTimeout() >> 16) + 2, TextUtils.indexOf("", ""), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 39951)).intern()), (String) setNextClusterForwardId.toString(map, "releaseStage"), (String) setNextClusterForwardId.toString(map, "version"), (String) setNextClusterForwardId.toString(map, "codeBundleId"), (String) setNextClusterForwardId.toString(map, "buildUuid"), (String) setNextClusterForwardId.toString(map, "type"), (Number) setNextClusterForwardId.toString(map, "versionCode"), (Number) setNextClusterForwardId.toString(map, "duration"), (Number) setNextClusterForwardId.toString(map, "durationInForeground"), (Boolean) setNextClusterForwardId.toString(map, "inForeground"), (Boolean) setNextClusterForwardId.toString(map, "isLaunching"));
        int i = ag$a + 77;
        values = i % 128;
        if ((i % 2 != 0 ? '8' : (char) 2) != 2) {
            Object[] objArr = null;
            int length = objArr.length;
            return getmeasuredheightandstate;
        }
        return getmeasuredheightandstate;
    }

    private static String ag$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ah$a[move.values + i2] ^ (move.values * toString)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
