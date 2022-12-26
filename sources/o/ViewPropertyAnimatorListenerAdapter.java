package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* loaded from: classes3.dex */
public final class ViewPropertyAnimatorListenerAdapter {
    private final int ag$a;
    private final int toString;
    private final int valueOf;
    private final Context values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface valueOf {
        int valueOf();

        int values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewPropertyAnimatorListenerAdapter(ViewPropertyAnimatorListenerAdapter$ag$a viewPropertyAnimatorListenerAdapter$ag$a) {
        int i;
        this.values = viewPropertyAnimatorListenerAdapter$ag$a.ah$a;
        if (values(viewPropertyAnimatorListenerAdapter$ag$a.valueOf)) {
            i = viewPropertyAnimatorListenerAdapter$ag$a.ag$a / 2;
        } else {
            i = viewPropertyAnimatorListenerAdapter$ag$a.ag$a;
        }
        this.toString = i;
        int ah$a = ah$a(viewPropertyAnimatorListenerAdapter$ag$a.valueOf, viewPropertyAnimatorListenerAdapter$ag$a.HaptikSDK$a, viewPropertyAnimatorListenerAdapter$ag$a.invoke);
        float valueOf2 = viewPropertyAnimatorListenerAdapter$ag$a.HaptikSDK$c.valueOf() * viewPropertyAnimatorListenerAdapter$ag$a.HaptikSDK$c.values() * 4;
        int round = Math.round(viewPropertyAnimatorListenerAdapter$ag$a.values * valueOf2);
        int round2 = Math.round(valueOf2 * viewPropertyAnimatorListenerAdapter$ag$a.HaptikSDK$b);
        int i2 = ah$a - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.ag$a = round2;
            this.valueOf = round;
        } else {
            float f = i2 / (viewPropertyAnimatorListenerAdapter$ag$a.values + viewPropertyAnimatorListenerAdapter$ag$a.HaptikSDK$b);
            this.ag$a = Math.round(viewPropertyAnimatorListenerAdapter$ag$a.HaptikSDK$b * f);
            this.valueOf = Math.round(f * viewPropertyAnimatorListenerAdapter$ag$a.values);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(toString(this.ag$a));
            sb.append(", pool size: ");
            sb.append(toString(this.valueOf));
            sb.append(", byte array size: ");
            sb.append(toString(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > ah$a);
            sb.append(", max size: ");
            sb.append(toString(ah$a));
            sb.append(", memoryClass: ");
            sb.append(viewPropertyAnimatorListenerAdapter$ag$a.valueOf.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(values(viewPropertyAnimatorListenerAdapter$ag$a.valueOf));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    public int ah$a() {
        return this.ag$a;
    }

    public int ag$a() {
        return this.valueOf;
    }

    public int valueOf() {
        return this.toString;
    }

    private static int ah$a(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (values(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    private String toString(int i) {
        return Formatter.formatFileSize(this.values, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean values(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class values implements valueOf {
        private final DisplayMetrics ah$a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public values(DisplayMetrics displayMetrics) {
            this.ah$a = displayMetrics;
        }

        @Override // o.ViewPropertyAnimatorListenerAdapter.valueOf
        public int valueOf() {
            return this.ah$a.widthPixels;
        }

        @Override // o.ViewPropertyAnimatorListenerAdapter.valueOf
        public int values() {
            return this.ah$a.heightPixels;
        }
    }
}
