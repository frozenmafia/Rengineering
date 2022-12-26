package o;

import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import o.getCategories;
/* loaded from: classes.dex */
public final class onShortcutUsageReported {
    private static int HaptikSDK$a = -866175630;
    private static int HaptikSDK$b = -494440238;
    private static int HaptikSDK$d = 1;
    private static short[] HaptikWebView = null;
    private static int ah$b = 53;
    private static int getInitSettings;
    private static byte[] invoke = {-48, -97, -98, 109, -109};
    private final String HaptikSDK$c;
    private final getCategories.toString ag$a;
    private final Integer ah$a;
    private final String toString;
    private final String valueOf;
    private final String values;

    public onShortcutUsageReported(String str, String str2, Integer num, String str3, String str4, getCategories.toString tostring) {
        runAnimators.ag$a(str, values((byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 102), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 53, 866175746 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 36702 - AndroidCharacter.getMirror('0')).intern());
        runAnimators.ag$a(str2, "description");
        runAnimators.ag$a(str3, "positiveText");
        runAnimators.ag$a(str4, "negativeTxt");
        this.HaptikSDK$c = str;
        this.values = str2;
        this.ah$a = num;
        this.toString = str3;
        this.valueOf = str4;
        this.ag$a = tostring;
    }

    public final Integer ag$a() {
        int i = getInitSettings + 3;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        Integer num = this.ah$a;
        int i3 = getInitSettings + 45;
        HaptikSDK$d = i3 % 128;
        int i4 = i3 % 2;
        return num;
    }

    public final String ah$b() {
        int i = HaptikSDK$d + 9;
        getInitSettings = i % 128;
        int i2 = i % 2;
        String str = this.HaptikSDK$c;
        int i3 = getInitSettings + 15;
        HaptikSDK$d = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return str;
        }
        int i4 = 55 / 0;
        return str;
    }

    public final String valueOf() {
        int i = getInitSettings + 67;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        try {
            String str = this.values;
            int i3 = HaptikSDK$d + 67;
            getInitSettings = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return str;
            }
            int i4 = 97 / 0;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String HaptikSDK$a() {
        String str;
        int i = HaptikSDK$d + 55;
        getInitSettings = i % 128;
        if (i % 2 == 0) {
            try {
                str = this.toString;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.toString;
            int i2 = 39 / 0;
        }
        try {
            int i3 = getInitSettings + 115;
            HaptikSDK$d = i3 % 128;
            if ((i3 % 2 == 0 ? '`' : '$') != '`') {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String values() {
        try {
            int i = HaptikSDK$d + 15;
            getInitSettings = i % 128;
            int i2 = i % 2;
            String str = this.valueOf;
            int i3 = HaptikSDK$d + 61;
            getInitSettings = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 36 / 0;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final getCategories.toString ah$a() {
        getCategories.toString tostring;
        try {
            int i = HaptikSDK$d + 37;
            try {
                getInitSettings = i % 128;
                Object[] objArr = null;
                if ((i % 2 != 0 ? (char) 11 : ';') != 11) {
                    tostring = this.ag$a;
                } else {
                    tostring = this.ag$a;
                    int length = objArr.length;
                }
                int i2 = HaptikSDK$d + 3;
                getInitSettings = i2 % 128;
                if ((i2 % 2 != 0 ? 'H' : (char) 18) != 'H') {
                    return tostring;
                }
                super.hashCode();
                return tostring;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String values(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ah$b;
            boolean z = i4 == -1;
            if (z) {
                if (invoke != null) {
                    i4 = (byte) (invoke[HaptikSDK$b + i3] + ah$b);
                } else {
                    i4 = (short) (HaptikWebView[HaptikSDK$b + i3] + ah$b);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + HaptikSDK$b + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + HaptikSDK$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (invoke != null) {
                        byte[] bArr = invoke;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = HaptikWebView;
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
