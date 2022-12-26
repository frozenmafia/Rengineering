package o;

import android.view.ViewConfiguration;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* loaded from: classes5.dex */
public final class isEmbeddingAvailable extends ResponseBody {
    private static int HaptikSDK$a = 0;
    private static boolean HaptikSDK$c = true;
    private static int ag$a = 170;
    private static boolean ah$b = true;
    private static int invoke = 1;
    private static char[] toString = {285, 281, 287, 284, 269, 271};
    private final parseSplitActivityRule ah$a;
    private final long valueOf;
    private final String values;

    public isEmbeddingAvailable(String str, long j, parseSplitActivityRule parsesplitactivityrule) {
        runAnimators.ag$a(parsesplitactivityrule, toString(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, new byte[]{-122, -123, -124, -125, -126, -127}).intern());
        this.values = str;
        this.valueOf = j;
        this.ah$a = parsesplitactivityrule;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        int i = invoke + 51;
        HaptikSDK$a = i % 128;
        if (!(i % 2 == 0)) {
            long j = this.valueOf;
            Object[] objArr = null;
            int length = objArr.length;
            return j;
        }
        return this.valueOf;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        MediaType parse;
        String str = this.values;
        if (!(str != null)) {
            parse = null;
            int i = invoke + 89;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
        } else {
            int i3 = invoke + 121;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            parse = MediaType.Companion.parse(str);
        }
        int i5 = HaptikSDK$a + 115;
        invoke = i5 % 128;
        int i6 = i5 % 2;
        return parse;
    }

    @Override // okhttp3.ResponseBody
    public parseSplitActivityRule source() {
        int i = HaptikSDK$a + 13;
        invoke = i % 128;
        if ((i % 2 == 0 ? (char) 15 : '>') != '>') {
            parseSplitActivityRule parsesplitactivityrule = this.ah$a;
            Object[] objArr = null;
            int length = objArr.length;
            return parsesplitactivityrule;
        }
        return this.ah$a;
    }

    private static String toString(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = toString;
            int i2 = ag$a;
            if (ah$b) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (HaptikSDK$c) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
