package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
/* loaded from: classes3.dex */
public final class growSize {
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$b = 0;
    public static final String HaptikSDK$c;
    private static short[] HaptikSDK$d = null;
    private static int HaptikSDK$e = 0;
    private static int HaptikWebView = 1;
    public static final String ag$a;
    public static final String ah$a;
    public static final String ah$b;
    private static int getInitSettings;
    private static byte[] getSignupData;
    public static final String invoke;
    public static final String toString;
    public static final String valueOf;
    public static final growSize$ag$a values;

    static void valueOf() {
        HaptikSDK$b = 115;
        HaptikSDK$e = -1536588537;
        HaptikSDK$a = 736037272;
        getSignupData = new byte[]{-109, 97, -98, 97, 101, 107};
    }

    static {
        valueOf();
        values = new growSize$ag$a(null);
        ag$a = values((byte) (Color.blue(0) + 103), (-116) - Color.argb(0, 0, 0, 0), 1536588634 - (ViewConfiguration.getPressedStateDuration() >> 16), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 736037272).intern();
        toString = "amount_str";
        invoke = "upi_id";
        ah$b = "pay_option";
        HaptikSDK$c = "pay_type";
        ah$a = "depositOfferId";
        valueOf = "match_details";
        int i = getInitSettings + 77;
        HaptikWebView = i % 128;
        if ((i % 2 == 0 ? 'T' : '\t') != '\t') {
            int i2 = 34 / 0;
        }
    }

    private static String values(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + HaptikSDK$b;
            boolean z = i4 == -1;
            if (z) {
                if (getSignupData != null) {
                    i4 = (byte) (getSignupData[HaptikSDK$a + i3] + HaptikSDK$b);
                } else {
                    i4 = (short) (HaptikSDK$d[HaptikSDK$a + i3] + HaptikSDK$b);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + HaptikSDK$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + HaptikSDK$e);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (getSignupData != null) {
                        byte[] bArr = getSignupData;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = HaptikSDK$d;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
