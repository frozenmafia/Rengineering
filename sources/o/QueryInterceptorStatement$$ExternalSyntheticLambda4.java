package o;

import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public class QueryInterceptorStatement$$ExternalSyntheticLambda4 {
    private static int ag$a = 0;
    private static int ah$a = 1;
    private static int valueOf = 114;

    public static SecretKey ag$a(SecretKey secretKey) {
        if ((secretKey == null ? (char) 20 : '8') != '8') {
            int i = ag$a + 3;
            ah$a = i % 128;
            int i2 = i % 2;
            int i3 = ag$a + 13;
            ah$a = i3 % 128;
            Object[] objArr = null;
            if ((i3 % 2 == 0 ? (char) 18 : ')') != 18) {
                return null;
            }
            int length = objArr.length;
            return null;
        }
        return new SecretKeySpec(secretKey.getEncoded(), ah$a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, 186 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), true, ((Process.getThreadPriority(0) + 20) >> 6) + 3, new char[]{11, 65533, 65529}).intern());
    }

    private static String ah$a(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - valueOf);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
