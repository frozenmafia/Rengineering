package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class setTargetPosition {
    private boolean ag$a;
    private final Context toString;
    private final RecyclerView.LayoutManager.Properties valueOf;
    private final SharedPreferences values;

    public setTargetPosition(Context context, String str, RecyclerView.LayoutManager.Properties properties) {
        Context settargetposition = toString(context);
        this.toString = settargetposition;
        this.values = settargetposition.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.valueOf = properties;
        this.ag$a = ag$a();
    }

    private static Context toString(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.ContextCompat.createDeviceProtectedStorageContext(context);
    }

    public boolean values() {
        boolean z;
        synchronized (this) {
            z = this.ag$a;
        }
        return z;
    }

    private boolean valueOf() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.toString.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.toString.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private boolean ag$a() {
        if (this.values.contains("firebase_data_collection_default_enabled")) {
            return this.values.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return valueOf();
    }
}
