package o;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import java.util.List;
import o.InputContentInfoCompat;
/* loaded from: classes4.dex */
public class setEdgeType implements InputContentInfoCompat.InputContentInfoCompatApi25Impl {
    private Context ag$a;

    public setEdgeType(Context context) {
        this.ag$a = null;
        this.ag$a = context;
    }

    @Override // o.InputContentInfoCompat.InputContentInfoCompatApi25Impl
    public boolean valueOf() {
        return !((PowerManager) this.ag$a.getSystemService("power")).isScreenOn();
    }

    @Override // o.InputContentInfoCompat.InputContentInfoCompatApi25Impl
    public boolean values() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.ag$a.getSystemService(com.apxor.androidsdk.core.ce.Constants.ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (int i = 0; i < runningAppProcesses.size(); i++) {
            if (runningAppProcesses.get(i).pid == myPid) {
                return runningAppProcesses.get(i).importance <= 200;
            }
        }
        return true;
    }

    @Override // o.InputContentInfoCompat.InputContentInfoCompatApi25Impl
    public boolean ah$a() {
        Context context = this.ag$a;
        ConnectivityManager connectivityManager = context != null ? (ConnectivityManager) context.getSystemService("connectivity") : null;
        return setMinimumVelocity.toString("android.permission.ACCESS_NETWORK_STATE") && connectivityManager != null && Build.VERSION.SDK_INT >= 24 && connectivityManager.isActiveNetworkMetered() && connectivityManager.getRestrictBackgroundStatus() == 3;
    }

    @Override // o.InputContentInfoCompat.InputContentInfoCompatApi25Impl
    public void ag$a() {
        this.ag$a = null;
    }
}
