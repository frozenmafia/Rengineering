package o;

import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class onActivityPreDestroyed {
    private static int HaptikSDK$a = 1;
    private static long ag$a = 3194660828035513562L;
    private static int ah$b;
    private final String ah$a;
    private final String toString;
    private final String valueOf;
    private final ReportFragment values;

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = ah$b + 69;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            return true;
        }
        try {
            if (!(obj instanceof onActivityPreDestroyed)) {
                int i3 = ah$b + 91;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            try {
                onActivityPreDestroyed onactivitypredestroyed = (onActivityPreDestroyed) obj;
                if (runAnimators.values((Object) this.ah$a, (Object) onactivitypredestroyed.ah$a) && runAnimators.values((Object) this.valueOf, (Object) onactivitypredestroyed.valueOf) && runAnimators.values(this.values, onactivitypredestroyed.values)) {
                    if ((!runAnimators.values((Object) this.toString, (Object) onactivitypredestroyed.toString) ? (char) 22 : 'L') != 22) {
                        return true;
                    }
                    int i5 = ah$b + 51;
                    HaptikSDK$a = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = ah$b + 3;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            try {
                int hashCode = (((((this.ah$a.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.values.hashCode()) * 31) + this.toString.hashCode();
                int i3 = HaptikSDK$a + 49;
                ah$b = i3 % 128;
                if ((i3 % 2 != 0 ? 'N' : (char) 29) != 'N') {
                    return hashCode;
                }
                int i4 = 55 / 0;
                return hashCode;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = "PaymentServiceResult(title=" + this.ah$a + ", subTitle=" + this.valueOf + ", amount=" + this.values + ", orderDetails=" + this.toString + ")";
        int i = ah$b + 65;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        return str;
    }

    public onActivityPreDestroyed(String str, String str2, ReportFragment reportFragment, String str3) {
        runAnimators.ag$a(str, toString(new char[]{31918, 33294, 33236, 32897, 34379}, 65214 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
        runAnimators.ag$a(str2, toString(new char[]{31913, 51892, 4238, 24287, 42207, 61993, 14356, 34306}, 46619 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        runAnimators.ag$a(reportFragment, toString(new char[]{31931, 38644, 43059, 49766, 54712, 61409}, 59971 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
        runAnimators.ag$a(str3, "orderDetails");
        this.ah$a = str;
        this.valueOf = str2;
        this.values = reportFragment;
        this.toString = str3;
    }

    public final String ag$a() {
        String str;
        try {
            int i = HaptikSDK$a + 77;
            ah$b = i % 128;
            try {
                if (i % 2 == 0) {
                    str = this.valueOf;
                } else {
                    str = this.valueOf;
                    int i2 = 79 / 0;
                }
                int i3 = ah$b + 63;
                HaptikSDK$a = i3 % 128;
                if ((i3 % 2 == 0 ? '7' : (char) 5) != 5) {
                    Object obj = null;
                    super.hashCode();
                    return str;
                }
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String ah$a() {
        try {
            int i = ah$b + 71;
            try {
                HaptikSDK$a = i % 128;
                int i2 = i % 2;
                String str = this.ah$a;
                int i3 = ah$b + 11;
                HaptikSDK$a = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    Object obj = null;
                    super.hashCode();
                    return str;
                }
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final ReportFragment valueOf() {
        int i = ah$b + 111;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        ReportFragment reportFragment = this.values;
        int i3 = ah$b + 57;
        HaptikSDK$a = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return reportFragment;
        }
        return reportFragment;
    }

    public final String values() {
        int i = ah$b + 47;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        String str = this.toString;
        int i3 = ah$b + 89;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ ag$a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
