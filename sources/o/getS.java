package o;

import android.view.KeyEvent;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import java.util.Date;
/* loaded from: classes3.dex */
public final class getS {
    private static int HaptikSDK$a = 1;
    private static int ag$a = 0;
    private static long ah$a = -8786161494214037285L;
    private final Date toString;
    private final String valueOf;
    private final MatchStatus values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof getS) {
                try {
                    getS gets = (getS) obj;
                    try {
                        if (!runAnimators.values((Object) this.valueOf, (Object) gets.valueOf)) {
                            int i = HaptikSDK$a + 91;
                            ag$a = i % 128;
                            if (i % 2 != 0) {
                            }
                            return false;
                        } else if (runAnimators.values(this.toString, gets.toString)) {
                            if (this.values != gets.values) {
                                int i2 = HaptikSDK$a + 119;
                                ag$a = i2 % 128;
                                int i3 = i2 % 2;
                                return false;
                            }
                            return true;
                        } else {
                            return false;
                        }
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
        int i;
        int hashCode = this.valueOf.hashCode();
        Date date = this.toString;
        if (date != null) {
            i = date.hashCode();
            int i2 = HaptikSDK$a + 43;
            ag$a = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = HaptikSDK$a + 25;
            ag$a = i4 % 128;
            if (i4 % 2 == 0) {
            }
            i = 0;
        }
        int hashCode2 = (((hashCode * 31) + i) * 31) + this.values.hashCode();
        int i5 = HaptikSDK$a + 61;
        ag$a = i5 % 128;
        if ((i5 % 2 != 0 ? '(' : 'I') != 'I') {
            int i6 = 33 / 0;
            return hashCode2;
        }
        return hashCode2;
    }

    public String toString() {
        String str = "TimerData(title=" + this.valueOf + ", roundStartTime=" + this.toString + ", status=" + this.values + ")";
        try {
            int i = HaptikSDK$a + 75;
            ag$a = i % 128;
            int i2 = i % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public getS(String str, Date date, MatchStatus matchStatus) {
        runAnimators.ag$a(str, ah$a(new char[]{12463, 16309, 11937, 7586, 3234}, 3846 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        runAnimators.ag$a(matchStatus, "status");
        this.valueOf = str;
        this.toString = date;
        this.values = matchStatus;
    }

    public final Date ag$a() {
        int i = ag$a + 69;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        Date date = this.toString;
        try {
            int i3 = HaptikSDK$a + 113;
            ag$a = i3 % 128;
            if (!(i3 % 2 == 0)) {
                int i4 = 1 / 0;
                return date;
            }
            return date;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String valueOf() {
        int i = ag$a + 65;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            String str = this.valueOf;
            int i3 = ag$a + 5;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final MatchStatus values() {
        int i = HaptikSDK$a + 99;
        ag$a = i % 128;
        if (!(i % 2 == 0)) {
            int i2 = 41 / 0;
            return this.values;
        }
        return this.values;
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ ah$a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
