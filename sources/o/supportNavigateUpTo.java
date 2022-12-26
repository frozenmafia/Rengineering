package o;

import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class supportNavigateUpTo {
    private static int HaptikSDK$c = 1;
    private static int ag$a;
    private static int[] ah$a = {-2104774496, 1853490878, -1246318989, -1019198429, 2086463910, -1073180102, -1178535607, 1425139122, 2055357456, 954188120, 467358600, 790309638, 1381260868, 704303641, -1425313745, 799383607, -1527718832, -642782148};
    private final String toString;
    private final int valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof supportNavigateUpTo)) {
                int i = HaptikSDK$c + 117;
                ag$a = i % 128;
                return !(i % 2 == 0);
            }
            supportNavigateUpTo supportnavigateupto = (supportNavigateUpTo) obj;
            if (runAnimators.values((Object) this.toString, (Object) supportnavigateupto.toString)) {
                if (!runAnimators.values((Object) this.values, (Object) supportnavigateupto.values)) {
                    int i2 = HaptikSDK$c + 113;
                    ag$a = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                try {
                    if (this.valueOf != supportnavigateupto.valueOf) {
                        return false;
                    }
                    int i4 = ag$a + 39;
                    HaptikSDK$c = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                } catch (Exception e) {
                    throw e;
                }
            }
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = ag$a + 39;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        int hashCode = (((this.toString.hashCode() * 31) + this.values.hashCode()) * 31) + this.valueOf;
        try {
            int i3 = ag$a + 75;
            HaptikSDK$c = i3 % 128;
            int i4 = i3 % 2;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        String str = "PayIfYouWinModel(title=" + this.toString + ", displayImgUrl=" + this.values + ", thresholdAmt=" + this.valueOf + ")";
        int i = ag$a + 31;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? '/' : '\'') != '/') {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    public supportNavigateUpTo(String str, String str2, int i) {
        runAnimators.ag$a(str, ag$a(new int[]{687940723, -1737232130, 201251899, -857846083}, 5 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
        runAnimators.ag$a(str2, "displayImgUrl");
        this.toString = str;
        this.values = str2;
        this.valueOf = i;
    }

    public final String ag$a() {
        int i = ag$a + 51;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.values;
        int i3 = HaptikSDK$c + 117;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String ah$a() {
        try {
            int i = HaptikSDK$c + 37;
            ag$a = i % 128;
            if ((i % 2 != 0 ? '+' : '7') != '7') {
                int i2 = 57 / 0;
                return this.toString;
            }
            try {
                return this.toString;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int valueOf() {
        int i = HaptikSDK$c + 43;
        ag$a = i % 128;
        if ((i % 2 != 0 ? ',' : '*') != ',') {
            try {
                return this.valueOf;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = this.valueOf;
        Object[] objArr = null;
        int length = objArr.length;
        return i2;
    }

    private static String ag$a(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) ah$a.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
