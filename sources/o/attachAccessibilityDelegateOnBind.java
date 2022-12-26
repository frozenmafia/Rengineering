package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;
/* loaded from: classes5.dex */
public class attachAccessibilityDelegateOnBind {
    private final Context ag$a;
    private String ah$a;
    private int toString = 0;
    private int valueOf;
    private String values;

    public attachAccessibilityDelegateOnBind(Context context) {
        this.ag$a = context;
    }

    public boolean HaptikSDK$a() {
        return ah$a() != 0;
    }

    public int ah$a() {
        synchronized (this) {
            int i = this.toString;
            if (i != 0) {
                return i;
            }
            PackageManager packageManager = this.ag$a.getPackageManager();
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                return 0;
            }
            if (!PlatformVersion.isAtLeastO()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    this.toString = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                this.toString = 2;
                return 2;
            }
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (PlatformVersion.isAtLeastO()) {
                this.toString = 2;
            } else {
                this.toString = 1;
            }
            return this.toString;
        }
    }

    public static String valueOf(FirebaseApp firebaseApp) {
        String values = firebaseApp.ah$b().values();
        if (values != null) {
            return values;
        }
        String valueOf = firebaseApp.ah$b().valueOf();
        if (valueOf.startsWith("1:")) {
            String[] split = valueOf.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return valueOf;
    }

    public String valueOf() {
        String str;
        synchronized (this) {
            if (this.ah$a == null) {
                HaptikSDK$c();
            }
            str = this.ah$a;
        }
        return str;
    }

    public String ag$a() {
        String str;
        synchronized (this) {
            if (this.values == null) {
                HaptikSDK$c();
            }
            str = this.values;
        }
        return str;
    }

    public int values() {
        int i;
        PackageInfo attachaccessibilitydelegateonbind;
        synchronized (this) {
            if (this.valueOf == 0 && (attachaccessibilitydelegateonbind = toString("com.google.android.gms")) != null) {
                this.valueOf = attachaccessibilitydelegateonbind.versionCode;
            }
            i = this.valueOf;
        }
        return i;
    }

    private void HaptikSDK$c() {
        synchronized (this) {
            PackageInfo attachaccessibilitydelegateonbind = toString(this.ag$a.getPackageName());
            if (attachaccessibilitydelegateonbind != null) {
                this.ah$a = Integer.toString(attachaccessibilitydelegateonbind.versionCode);
                this.values = attachaccessibilitydelegateonbind.versionName;
            }
        }
    }

    private PackageInfo toString(String str) {
        try {
            return this.ag$a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
