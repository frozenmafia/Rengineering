package o;

import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class access$1602 {
    private static long HaptikSDK$a = -7545042561931628492L;
    private static int HaptikSDK$b = 0;
    private static int invoke = 1;
    private final int ag$a;
    private final String ah$a;
    private final String ah$b;
    private final String toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (!(this != obj)) {
            int i = invoke + 51;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            return true;
        } else if (obj instanceof access$1602) {
            try {
                access$1602 access_1602 = (access$1602) obj;
                if (this.ag$a != access_1602.ag$a) {
                    int i3 = HaptikSDK$b + 21;
                    invoke = i3 % 128;
                    if (i3 % 2 == 0) {
                        Object obj2 = null;
                        super.hashCode();
                        return false;
                    }
                    return false;
                } else if (runAnimators.values((Object) this.ah$b, (Object) access_1602.ah$b)) {
                    if (!runAnimators.values((Object) this.ah$a, (Object) access_1602.ah$a)) {
                        int i4 = invoke + 31;
                        HaptikSDK$b = i4 % 128;
                        return i4 % 2 != 0;
                    }
                    try {
                        if (runAnimators.values((Object) this.toString, (Object) access_1602.toString)) {
                            if ((!runAnimators.values((Object) this.values, (Object) access_1602.values) ? 'D' : 'B') != 'D') {
                                if (runAnimators.values((Object) this.valueOf, (Object) access_1602.valueOf)) {
                                    return true;
                                }
                                int i5 = HaptikSDK$b + 17;
                                invoke = i5 % 128;
                                int i6 = i5 % 2;
                                return false;
                            }
                            return false;
                        }
                        return false;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    return false;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode;
        int i = HaptikSDK$b + 3;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            int i3 = this.ag$a;
            int hashCode2 = this.ah$b.hashCode();
            int hashCode3 = this.ah$a.hashCode();
            String str = this.toString;
            if ((str == null ? (char) 11 : 'O') != 'O') {
                int i4 = invoke + 83;
                HaptikSDK$b = i4 % 128;
                int i5 = i4 % 2;
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return (((((((((i3 * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode) * 31) + this.values.hashCode()) * 31) + this.valueOf.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        try {
            String str = "WatchLiveSubscriptionData(id=" + this.ag$a + ", title=" + this.ah$b + ", message=" + this.ah$a + ", imageUrl=" + this.toString + ", ctaText=" + this.values + ", closeCtaText=" + this.valueOf + ")";
            int i = HaptikSDK$b + 117;
            invoke = i % 128;
            int i2 = i % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public access$1602(int i, String str, String str2, String str3, String str4, String str5) {
        runAnimators.ag$a(str, toString(new char[]{45120, 49626, 21326, 58573, 30285}, 29063 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
        runAnimators.ag$a(str2, "message");
        runAnimators.ag$a(str4, "ctaText");
        runAnimators.ag$a(str5, "closeCtaText");
        this.ag$a = i;
        this.ah$b = str;
        this.ah$a = str2;
        this.toString = str3;
        this.values = str4;
        this.valueOf = str5;
    }

    public final int valueOf() {
        int i = invoke + 29;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        int i3 = this.ag$a;
        int i4 = HaptikSDK$b + 87;
        invoke = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return i3;
    }

    public final String HaptikSDK$c() {
        int i = invoke + 43;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        String str = this.ah$b;
        int i3 = HaptikSDK$b + 61;
        invoke = i3 % 128;
        if ((i3 % 2 == 0 ? '\f' : '[') != '[') {
            int i4 = 5 / 0;
            return str;
        }
        return str;
    }

    public final String HaptikSDK$a() {
        int i = invoke + 41;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        String str = this.ah$a;
        try {
            int i3 = invoke + 53;
            HaptikSDK$b = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String values() {
        try {
            int i = HaptikSDK$b + 69;
            invoke = i % 128;
            int i2 = i % 2;
            try {
                String str = this.toString;
                int i3 = HaptikSDK$b + 49;
                invoke = i3 % 128;
                if ((i3 % 2 == 0 ? 'Y' : '3') != '3') {
                    int i4 = 91 / 0;
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

    public final String ag$a() {
        String str;
        try {
            int i = HaptikSDK$b + 61;
            invoke = i % 128;
            if ((i % 2 == 0 ? 'G' : '`') != '`') {
                str = this.values;
                int i2 = 30 / 0;
            } else {
                str = this.values;
            }
            int i3 = HaptikSDK$b + 61;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String ah$a() {
        try {
            int i = invoke + 9;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            String str = this.valueOf;
            int i3 = invoke + 43;
            HaptikSDK$b = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ HaptikSDK$a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
