package o;

import android.text.TextUtils;
/* loaded from: classes3.dex */
public final class setShouldShowIcon$HaptikSDK$c extends setShouldShowIcon {
    private static int ag$a = 0;
    private static int toString = 1;
    private static long values = -3753952861804142942L;
    private final String ah$a;

    public boolean equals(Object obj) {
        try {
            int i = ag$a + 111;
            toString = i % 128;
            int i2 = i % 2;
            if (this == obj) {
                int i3 = ag$a + 75;
                toString = i3 % 128;
                if (i3 % 2 == 0) {
                }
                return true;
            }
            try {
                if (obj instanceof setShouldShowIcon$HaptikSDK$c) {
                    return (!runAnimators.values((Object) this.ah$a, (Object) ((setShouldShowIcon$HaptikSDK$c) obj).ah$a) ? 'W' : 'D') == 'D';
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
        try {
            int i = toString + 51;
            try {
                ag$a = i % 128;
                int i2 = i % 2;
                int hashCode = this.ah$a.hashCode();
                int i3 = toString + 87;
                ag$a = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    return hashCode;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return hashCode;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = "LineUpPlayersTitleVM(title=" + this.ah$a + ")";
        int i = toString + 119;
        ag$a = i % 128;
        int i2 = i % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setShouldShowIcon$HaptikSDK$c(String str) {
        super(null);
        runAnimators.ag$a(str, values(new char[]{24278, 22586, 21300, 18973, 17667}, TextUtils.getOffsetBefore("", 0) + 1777).intern());
        this.ah$a = str;
    }

    public final String valueOf() {
        int i = toString + 41;
        ag$a = i % 128;
        if (i % 2 != 0) {
            try {
                String str = this.ah$a;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.ah$a;
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ values);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
