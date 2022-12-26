package o;

import android.content.Context;
import android.util.Log;
import o.WindowInsetsCompat;
import o.toWindowInsets;
/* loaded from: classes3.dex */
public class setStableInsets implements setRootWindowInsets {
    @Override // o.setRootWindowInsets
    public toWindowInsets ag$a(Context context, toWindowInsets.valueOf valueof) {
        boolean z = androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z) {
            return new WindowInsetsCompat.Api21ReflectionHolder(context, valueof);
        }
        return new applyInsetTypes();
    }
}
