package o;

import android.graphics.Color;
import o.setBackgroundTintMode;
/* loaded from: classes3.dex */
public final class isKeyboardNavigationCluster implements setBackgroundTintMode.toString {
    private static int HaptikSDK$a = 0;
    private static char HaptikSDK$b = 0;
    private static int HaptikSDK$c = 1;
    private static char ag$a;
    public static final isKeyboardNavigationCluster$ah$a ah$a;
    private static char toString;
    private static char valueOf;
    private final String values;

    static {
        valueOf();
        Object obj = null;
        ah$a = new isKeyboardNavigationCluster$ah$a(null);
        try {
            int i = HaptikSDK$a + 95;
            HaptikSDK$c = i % 128;
            if (!(i % 2 == 0)) {
                return;
            }
            super.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    static void valueOf() {
        ag$a = (char) 13131;
        valueOf = (char) 965;
        HaptikSDK$b = (char) 59797;
        toString = (char) 3755;
    }

    public isKeyboardNavigationCluster(String str) {
        this.values = str;
    }

    public final String ah$a() {
        int i = HaptikSDK$c + 19;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            String str = this.values;
            int i3 = HaptikSDK$c + 45;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) {
        String ag$a2;
        int i = HaptikSDK$a + 111;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? '?' : 'N') != 'N') {
            runAnimators.valueOf(setbackgroundtintmode, "stream");
            setbackgroundtintmode.values();
            ag$a2 = ag$a(new char[]{20844, 14748}, 16777218 >>> Color.rgb(1, 1, 1));
        } else {
            runAnimators.valueOf(setbackgroundtintmode, "stream");
            setbackgroundtintmode.values();
            ag$a2 = ag$a(new char[]{20844, 14748}, Color.rgb(0, 0, 0) + 16777218);
        }
        setbackgroundtintmode.ag$a(ag$a2.intern());
        setbackgroundtintmode.valueOf(this.values);
        setbackgroundtintmode.ag$a();
        int i2 = HaptikSDK$a + 111;
        HaptikSDK$c = i2 % 128;
        if ((i2 % 2 == 0 ? '(' : 'a') != 'a') {
            int i3 = 62 / 0;
        }
    }

    private static String ag$a(char[] cArr, int i) {
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + valueOf)) ^ ((cArr3[0] >>> 5) + HaptikSDK$b)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + toString)) ^ ((cArr3[1] >>> 5) + ag$a)));
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
