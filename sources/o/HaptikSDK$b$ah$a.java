package o;

import java.util.Date;
/* loaded from: classes.dex */
class HaptikSDK$b$ah$a {
    static long ah$a;
    static HaptikSDK$b$ag$a toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(HaptikSDK$b$ag$a haptikSDK$b$ag$a) {
        toString = haptikSDK$b$ag$a;
        ah$a = haptikSDK$b$ag$a == null ? 0L : new Date().getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean valueOf() {
        return toString == null || new Date().getTime() > ah$a + 86400000;
    }

    public static HaptikSDK$b$ag$a values() {
        return toString;
    }
}
