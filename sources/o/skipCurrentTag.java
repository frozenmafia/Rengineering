package o;

import android.app.PendingIntent;
/* loaded from: classes5.dex */
public class skipCurrentTag {
    private final long HaptikSDK$a;
    private final long HaptikSDK$b;
    private final long HaptikSDK$c;
    private final PendingIntent HaptikSDK$d;
    private final PendingIntent HaptikSDK$e;
    private final PendingIntent HaptikWebView;
    private final int ag$a;
    private final int ah$a;
    private final long ah$b;
    private boolean getInitSettings = false;
    private final PendingIntent getSignupData;
    private final int invoke;
    private final int toString;
    private final Integer valueOf;
    private final String values;

    private skipCurrentTag(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.values = str;
        this.toString = i;
        this.ah$a = i2;
        this.ag$a = i3;
        this.valueOf = num;
        this.invoke = i4;
        this.HaptikSDK$b = j;
        this.HaptikSDK$c = j2;
        this.ah$b = j3;
        this.HaptikSDK$a = j4;
        this.HaptikSDK$d = pendingIntent;
        this.HaptikWebView = pendingIntent2;
        this.HaptikSDK$e = pendingIntent3;
        this.getSignupData = pendingIntent4;
    }

    public static skipCurrentTag valueOf(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new skipCurrentTag(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    private final boolean values(setDefaultValues setdefaultvalues) {
        return setdefaultvalues.values() && this.ah$b <= this.HaptikSDK$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean HaptikSDK$c() {
        return this.getInitSettings;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ag$a() {
        this.getInitSettings = true;
    }

    public int ah$a() {
        return this.ah$a;
    }

    public int valueOf() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PendingIntent valueOf(setDefaultValues setdefaultvalues) {
        if (setdefaultvalues.ah$a() == 0) {
            PendingIntent pendingIntent = this.HaptikWebView;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (values(setdefaultvalues)) {
                return this.getSignupData;
            }
            return null;
        }
        if (setdefaultvalues.ah$a() == 1) {
            PendingIntent pendingIntent2 = this.HaptikSDK$d;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (values(setdefaultvalues)) {
                return this.HaptikSDK$e;
            }
        }
        return null;
    }

    public boolean valueOf(int i) {
        setDefaultValues ag$a;
        ag$a = setDefaultValues.valueOf(i).ag$a();
        return valueOf(ag$a) != null;
    }

    public int values() {
        return this.invoke;
    }

    public boolean ah$a(setDefaultValues setdefaultvalues) {
        return valueOf(setdefaultvalues) != null;
    }
}
