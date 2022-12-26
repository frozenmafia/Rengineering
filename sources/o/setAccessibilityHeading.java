package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.List;
/* loaded from: classes3.dex */
class setAccessibilityHeading {
    private final ActivityManager valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAccessibilityHeading(Context context) {
        this.valueOf = hasExplicitFocusable.toString(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean ah$a() {
        try {
            ActivityManager.RunningAppProcessInfo valueOf = valueOf();
            if (valueOf != null) {
                return Boolean.valueOf(valueOf.importance <= 125);
            }
        } catch (RuntimeException unused) {
        }
        return null;
    }

    private ActivityManager.RunningAppProcessInfo valueOf() {
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo;
        }
        return values();
    }

    private ActivityManager.RunningAppProcessInfo values() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = this.valueOf;
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (myPid == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }
}
