package o;

import android.view.ViewConfiguration;
/* loaded from: classes3.dex */
public final class getHorizontalChainStyle {
    private static long HaptikSDK$a = 8710424309643025881L;
    private static int HaptikSDK$c = 0;
    private static int ah$b = 1;
    private final String ag$a;
    private final String ah$a;
    private final String invoke;
    private final String toString;
    private final String valueOf;
    private final boolean values;

    public getHorizontalChainStyle(String str, String str2, String str3, boolean z, String str4, String str5) {
        runAnimators.ag$a(str, "imgSrc");
        runAnimators.ag$a(str2, "loadInstanceId");
        runAnimators.ag$a(str3, ah$a(new char[]{33970, 33985, 284, 7338, 62280, 51343, 6061, 20052, 62389, 35314}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern());
        runAnimators.ag$a(str4, "eventName");
        runAnimators.ag$a(str5, "contentDescription");
        this.toString = str;
        this.ag$a = str2;
        this.invoke = str3;
        this.values = z;
        this.valueOf = str4;
        this.ah$a = str5;
    }

    public final String invoke() {
        int i = ah$b + 41;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.ag$a;
        int i3 = HaptikSDK$c + 35;
        ah$b = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String valueOf() {
        int i = ah$b + 59;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.toString;
        int i3 = HaptikSDK$c + 23;
        ah$b = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public final String HaptikSDK$c() {
        try {
            int i = ah$b + 103;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            String str = this.invoke;
            int i3 = HaptikSDK$c + 33;
            ah$b = i3 % 128;
            if ((i3 % 2 == 0 ? 'b' : (char) 2) != 2) {
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean ag$a() {
        boolean z;
        try {
            int i = ah$b + 1;
            HaptikSDK$c = i % 128;
            if ((i % 2 != 0 ? '?' : 'R') != '?') {
                z = this.values;
            } else {
                z = this.values;
                int i2 = 45 / 0;
            }
            int i3 = HaptikSDK$c + 13;
            ah$b = i3 % 128;
            if ((i3 % 2 == 0 ? '\n' : '_') != '\n') {
                return z;
            }
            int i4 = 55 / 0;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String ah$a() {
        int i = HaptikSDK$c + 1;
        ah$b = i % 128;
        int i2 = i % 2;
        String str = this.ah$a;
        try {
            int i3 = HaptikSDK$c + 41;
            try {
                ah$b = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    Object[] objArr = null;
                    int length = objArr.length;
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

    public final String values() {
        String str;
        int i = HaptikSDK$c + 89;
        ah$b = i % 128;
        if ((i % 2 == 0 ? (char) 15 : (char) 28) != 15) {
            str = this.valueOf;
        } else {
            str = this.valueOf;
            Object obj = null;
            super.hashCode();
        }
        int i2 = HaptikSDK$c + 95;
        ah$b = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(HaptikSDK$a, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * HaptikSDK$a));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
