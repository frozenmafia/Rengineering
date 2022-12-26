package o;

import android.view.ViewConfiguration;
/* loaded from: classes6.dex */
public final class isLifecycleParent {
    private static int HaptikSDK$b = 1;
    private static char[] ag$a = {203, 192, 195, 188};
    private static int ah$a = 87;
    private static int ah$b = 0;
    private static boolean invoke = true;
    private static boolean valueOf = true;
    private final String toString;
    private final String values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isLifecycleParent) {
                isLifecycleParent islifecycleparent = (isLifecycleParent) obj;
                if (!runAnimators.values((Object) this.toString, (Object) islifecycleparent.toString)) {
                    int i = HaptikSDK$b + 93;
                    ah$b = i % 128;
                    if (i % 2 != 0) {
                    }
                    int i2 = ah$b + 37;
                    HaptikSDK$b = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                try {
                    try {
                        if (!(runAnimators.values((Object) this.values, (Object) islifecycleparent.values))) {
                            int i4 = HaptikSDK$b + 123;
                            ah$b = i4 % 128;
                            int i5 = i4 % 2;
                            return false;
                        }
                        return true;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ah$b + 29;
        HaptikSDK$b = i % 128;
        int hashCode = (!(i % 2 != 0) ? this.toString.hashCode() + 112 : this.toString.hashCode() * 31) + this.values.hashCode();
        int i2 = ah$b + 91;
        HaptikSDK$b = i2 % 128;
        if ((i2 % 2 == 0 ? '0' : 'Y') != '0') {
            return hashCode;
        }
        int i3 = 86 / 0;
        return hashCode;
    }

    public String toString() {
        String str = "PassBenefitDetails(title=" + this.toString + ", desc=" + this.values + ")";
        int i = ah$b + 115;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return str;
    }

    public isLifecycleParent(String str, String str2) {
        runAnimators.ag$a(str, toString(null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), new byte[]{-124, -125, -127, -126, -127}).intern());
        runAnimators.ag$a(str2, "desc");
        this.toString = str;
        this.values = str2;
    }

    public final String ag$a() {
        int i = ah$b + 111;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        try {
            String str = this.toString;
            int i3 = ah$b + 1;
            HaptikSDK$b = i3 % 128;
            if (!(i3 % 2 == 0)) {
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
            int i = HaptikSDK$b + 117;
            ah$b = i % 128;
            if (!(i % 2 == 0)) {
                String str = this.values;
                Object obj = null;
                super.hashCode();
                return str;
            }
            return this.values;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String toString(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = ag$a;
            int i2 = ah$a;
            if (invoke) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (valueOf) {
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
