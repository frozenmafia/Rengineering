package com.fancode.payment.type;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import o.getShort;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentSources {
    private static final /* synthetic */ PaymentSources[] $VALUES;
    public static final PaymentSources ANDROID;
    public static final PaymentSources$ah$a Companion;
    public static final PaymentSources D11;
    public static final PaymentSources IOS;
    public static final PaymentSources NONE;
    public static final PaymentSources UNKNOWN__;
    public static final PaymentSources WEB;
    private static int ag$a = 1;
    private static long ah$a;
    private static int toString;
    private static char valueOf;
    private static int values;
    private final String rawValue;

    private static final /* synthetic */ PaymentSources[] $values() {
        int i = ag$a + 9;
        toString = i % 128;
        if (!(i % 2 == 0)) {
            PaymentSources[] paymentSourcesArr = new PaymentSources[115];
            paymentSourcesArr[1] = WEB;
            paymentSourcesArr[1] = ANDROID;
            paymentSourcesArr[4] = IOS;
            paymentSourcesArr[2] = D11;
            paymentSourcesArr[3] = NONE;
            paymentSourcesArr[5] = UNKNOWN__;
            return paymentSourcesArr;
        }
        try {
            PaymentSources[] paymentSourcesArr2 = new PaymentSources[6];
            paymentSourcesArr2[0] = WEB;
            paymentSourcesArr2[1] = ANDROID;
            paymentSourcesArr2[2] = IOS;
            paymentSourcesArr2[3] = D11;
            paymentSourcesArr2[4] = NONE;
            paymentSourcesArr2[5] = UNKNOWN__;
            return paymentSourcesArr2;
        } catch (Exception e) {
            throw e;
        }
    }

    static void ah$a() {
        values = 0;
        ah$a = 7584259980628832310L;
        valueOf = (char) 0;
    }

    public static PaymentSources valueOf(String str) {
        int i = ag$a + 65;
        toString = i % 128;
        int i2 = i % 2;
        PaymentSources paymentSources = (PaymentSources) Enum.valueOf(PaymentSources.class, str);
        int i3 = toString + 53;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return paymentSources;
    }

    public static PaymentSources[] values() {
        int i = ag$a + 105;
        toString = i % 128;
        int i2 = i % 2;
        PaymentSources[] paymentSourcesArr = (PaymentSources[]) $VALUES.clone();
        int i3 = ag$a + 1;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return paymentSourcesArr;
    }

    private PaymentSources(String str, int i, String str2) {
        try {
            this.rawValue = str2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getRawValue() {
        try {
            int i = toString + 59;
            ag$a = i % 128;
            if (!(i % 2 == 0)) {
                return this.rawValue;
            }
            int i2 = 83 / 0;
            return this.rawValue;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        ah$a();
        WEB = new PaymentSources("WEB", 0, "WEB");
        ANDROID = new PaymentSources("ANDROID", 1, "ANDROID");
        IOS = new PaymentSources("IOS", 2, "IOS");
        D11 = new PaymentSources(ah$a((ViewConfiguration.getTapTimeout() >> 16) + 199997244, new char[]{15527, 60343, 25867, 4945}, new char[]{45110, 60823, 46148, 26944}, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 20837), new char[]{33306, 17811, 40208}).intern(), 3, ah$a(199997245 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{15527, 60343, 25867, 4945}, new char[]{45110, 60823, 46148, 26944}, (char) (TextUtils.getOffsetAfter("", 0) + 20837), new char[]{33306, 17811, 40208}).intern());
        NONE = new PaymentSources("NONE", 4, "NONE");
        UNKNOWN__ = new PaymentSources("UNKNOWN__", 5, "UNKNOWN__");
        $VALUES = $values();
        Companion = new PaymentSources$ah$a(null);
        int i = toString + 27;
        ag$a = i % 128;
        int i2 = i % 2;
    }

    private static String ah$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$a) ^ values) ^ valueOf);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
