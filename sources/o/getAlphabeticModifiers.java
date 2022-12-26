package o;
/* loaded from: classes2.dex */
public final class getAlphabeticModifiers {
    private static char[] ah$a = {':', 'r', 'q', 'l', 'd', 'j'};
    private static int invoke = 1;
    private static int values;
    private final String ag$a;
    private final String toString;
    private final String valueOf;

    public boolean equals(Object obj) {
        int i = values + 59;
        invoke = i % 128;
        int i2 = i % 2;
        if ((this == obj ? (char) 24 : 'L') == 24) {
            int i3 = values + 29;
            invoke = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!(!(obj instanceof getAlphabeticModifiers))) {
            getAlphabeticModifiers getalphabeticmodifiers = (getAlphabeticModifiers) obj;
            if (runAnimators.values((Object) this.valueOf, (Object) getalphabeticmodifiers.valueOf) && runAnimators.values((Object) this.ag$a, (Object) getalphabeticmodifiers.ag$a)) {
                if (runAnimators.values((Object) this.toString, (Object) getalphabeticmodifiers.toString)) {
                    return true;
                }
                int i4 = invoke + 111;
                values = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = invoke + 87;
        values = i % 128;
        int i2 = i % 2;
        int hashCode = (((this.valueOf.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.toString.hashCode();
        int i3 = values + 55;
        invoke = i3 % 128;
        if ((i3 % 2 == 0 ? 'b' : '/') != 'b') {
            return hashCode;
        }
        int i4 = 99 / 0;
        return hashCode;
    }

    public String toString() {
        String str = "PerformanceCommonParams(loadInstanceId=" + this.valueOf + ", source=" + this.ag$a + ", activeScreenName=" + this.toString + ")";
        try {
            int i = invoke + 99;
            try {
                values = i % 128;
                if (i % 2 == 0) {
                    return str;
                }
                int i2 = 16 / 0;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public getAlphabeticModifiers(String str, String str2, String str3) {
        runAnimators.ag$a(str, "loadInstanceId");
        runAnimators.ag$a(str2, ah$a(true, new int[]{0, 6, 0, 3}, new byte[]{1, 0, 0, 0, 0, 1}).intern());
        runAnimators.ag$a(str3, "activeScreenName");
        this.valueOf = str;
        this.ag$a = str2;
        this.toString = str3;
    }

    public final String ah$a() {
        int i = invoke + 41;
        values = i % 128;
        int i2 = i % 2;
        String str = this.ag$a;
        int i3 = values + 65;
        invoke = i3 % 128;
        if ((i3 % 2 == 0 ? '5' : (char) 0) != '5') {
            return str;
        }
        int i4 = 98 / 0;
        return str;
    }

    public final String valueOf() {
        int i = invoke + 73;
        values = i % 128;
        int i2 = i % 2;
        String str = this.valueOf;
        int i3 = values + 49;
        invoke = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String values() {
        int i = values + 35;
        invoke = i % 128;
        int i2 = i % 2;
        String str = this.toString;
        int i3 = values + 15;
        invoke = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static String ah$a(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ah$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
