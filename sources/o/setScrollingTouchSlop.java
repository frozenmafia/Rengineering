package o;

import android.view.ViewConfiguration;
import com.sendbird.android.constant.StringSet;
import java.net.URI;
import org.apache.http.HttpHost;
/* loaded from: classes5.dex */
public class setScrollingTouchSlop {
    private static int HaptikSDK$a = 1;
    private static boolean HaptikSDK$b = true;
    private static int ah$b = 0;
    private static boolean invoke = true;
    private static char[] toString = {269, 265};
    private static int valueOf = 150;
    private final boolean ag$a;
    private final String ah$a;
    private final String values;

    public setScrollingTouchSlop(String str, String str2, boolean z) {
        this.values = str;
        this.ah$a = str2;
        this.ag$a = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HttpHost.DEFAULT_SCHEME_NAME);
        boolean z = !this.ag$a;
        String str = StringSet.s;
        if (z) {
            str = "";
        } else {
            int i = HaptikSDK$a + 81;
            ah$b = i % 128;
            if ((i % 2 != 0 ? '7' : '@') == '7') {
                int i2 = 80 / 0;
            }
        }
        try {
            sb.append(str);
            try {
                sb.append("://");
                sb.append(this.values);
                String sb2 = sb.toString();
                int i3 = ah$b + 77;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return sb2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static URI toString(String str, boolean z, String str2, String str3) {
        String str4;
        if ((z ? '1' : (char) 5) != 5) {
            int i = HaptikSDK$a + 53;
            ah$b = i % 128;
            int i2 = i % 2;
            str4 = toString((char[]) null, (int[]) null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new byte[]{-126, -126, -127}).intern();
            int i3 = ah$b + 47;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str4 = "ws";
        }
        String str5 = str4 + "://" + str + "/.ws?ns=" + str2 + "&v=5";
        if (str3 != null) {
            str5 = str5 + "&ls=" + str3;
        }
        return URI.create(str5);
    }

    public String ah$a() {
        int i = HaptikSDK$a + 65;
        ah$b = i % 128;
        int i2 = i % 2;
        String str = this.values;
        int i3 = ah$b + 93;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public String values() {
        int i = ah$b + 49;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        String str = this.ah$a;
        int i3 = HaptikSDK$a + 55;
        ah$b = i3 % 128;
        if (!(i3 % 2 == 0)) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public boolean ag$a() {
        int i = ah$b + 9;
        HaptikSDK$a = i % 128;
        if ((i % 2 == 0 ? 'M' : (char) 27) != 27) {
            int i2 = 16 / 0;
            return this.ag$a;
        }
        return this.ag$a;
    }

    private static String toString(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = toString;
            int i2 = valueOf;
            if (HaptikSDK$b) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (invoke) {
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
