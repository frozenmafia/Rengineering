package o;

import android.view.ViewConfiguration;
/* loaded from: classes3.dex */
public final class hasKeyFramePosition extends androidx.databinding.BaseObservable {
    private static char HaptikSDK$a = 54682;
    private static char HaptikSDK$c = 64420;
    private static int HaptikSDK$d = 1;
    private static int HaptikWebView = 0;
    private static char getInitSettings = 2522;
    private static char invoke = 37890;
    private final String HaptikSDK$b;
    private final int ag$a;
    private final processTouchEvent ah$a;
    private final String ah$b;
    @androidx.databinding.Bindable
    private String toString;
    private androidx.databinding.ObservableField<String> valueOf;
    private final String values;

    public final String HaptikSDK$a() {
        String str;
        int i = HaptikWebView + 123;
        HaptikSDK$d = i % 128;
        if (i % 2 != 0) {
            str = this.ah$b;
        } else {
            str = this.ah$b;
            Object[] objArr = null;
            int length = objArr.length;
        }
        try {
            int i2 = HaptikWebView + 21;
            HaptikSDK$d = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 0;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int HaptikSDK$c() {
        int i = HaptikWebView + 59;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        int i3 = this.ag$a;
        int i4 = HaptikSDK$d + 29;
        HaptikWebView = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public final String valueOf() {
        int i = HaptikSDK$d + 85;
        HaptikWebView = i % 128;
        int i2 = i % 2;
        String str = this.values;
        int i3 = HaptikSDK$d + 55;
        HaptikWebView = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public hasKeyFramePosition(int i, String str, String str2, String str3, processTouchEvent processtouchevent) {
        runAnimators.ag$a(str, toString(new char[]{38244, 32013, 47510, 13701, 26550, 5954}, 6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
        runAnimators.ag$a(str2, "emailMobileHintText");
        runAnimators.ag$a(str3, "preFixText");
        runAnimators.ag$a(processtouchevent, "handler");
        this.ag$a = i;
        this.ah$b = str;
        this.values = str2;
        this.HaptikSDK$b = str3;
        this.ah$a = processtouchevent;
        this.toString = "";
        this.valueOf = new androidx.databinding.ObservableField<>();
    }

    public final processTouchEvent ag$a() {
        processTouchEvent processtouchevent;
        int i = HaptikWebView + 105;
        HaptikSDK$d = i % 128;
        if ((i % 2 == 0 ? (char) 18 : '2') != '2') {
            processtouchevent = this.ah$a;
            int i2 = 55 / 0;
        } else {
            processtouchevent = this.ah$a;
        }
        int i3 = HaptikSDK$d + 11;
        HaptikWebView = i3 % 128;
        int i4 = i3 % 2;
        return processtouchevent;
    }

    public final String ah$b() {
        int i = HaptikSDK$d + 97;
        HaptikWebView = i % 128;
        int i2 = i % 2;
        String str = this.HaptikSDK$b;
        int i3 = HaptikSDK$d + 97;
        HaptikWebView = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 30 : (char) 0) != 0) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public final String ah$a() {
        int i = HaptikWebView + 89;
        HaptikSDK$d = i % 128;
        if (!(i % 2 != 0)) {
            String str = this.toString;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return this.toString;
    }

    public final void valueOf(String str) {
        int i = HaptikSDK$d + 55;
        HaptikWebView = i % 128;
        if (i % 2 != 0) {
            try {
                runAnimators.ag$a(str, "value");
                this.toString = str;
                notifyPropertyChanged(121);
            } catch (Exception e) {
                throw e;
            }
        } else {
            runAnimators.ag$a(str, "value");
            this.toString = str;
            notifyPropertyChanged(82);
        }
        int i2 = HaptikWebView + 95;
        try {
            HaptikSDK$d = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final androidx.databinding.ObservableField<String> values() {
        androidx.databinding.ObservableField<String> observableField;
        int i = HaptikSDK$d + 7;
        HaptikWebView = i % 128;
        if (i % 2 == 0) {
            try {
                observableField = this.valueOf;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                observableField = this.valueOf;
                Object obj = null;
                super.hashCode();
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i2 = HaptikSDK$d + 91;
        HaptikWebView = i2 % 128;
        int i3 = i2 % 2;
        return observableField;
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + invoke)) ^ ((cArr3[0] >>> 5) + getInitSettings)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + HaptikSDK$a)) ^ ((cArr3[1] >>> 5) + HaptikSDK$c)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
