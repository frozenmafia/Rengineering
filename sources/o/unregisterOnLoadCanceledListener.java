package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
/* loaded from: classes4.dex */
public final class unregisterOnLoadCanceledListener {
    private static boolean HaptikSDK$a;
    public static SharedPreferences ag$a;
    public static Context toString;
    public static onLoadCanceled valueOf;
    public static final unregisterOnLoadCanceledListener values = new unregisterOnLoadCanceledListener();
    private static HashMap<String, onLoadCanceled> invoke = new HashMap<>();
    private static HashMap<String, String> ah$a = new HashMap<>();

    private unregisterOnLoadCanceledListener() {
    }

    public final onLoadCanceled values() {
        onLoadCanceled onloadcanceled = valueOf;
        if (onloadcanceled == null) {
            runAnimators.valueOf("pingbackCollector");
        }
        return onloadcanceled;
    }

    public final SharedPreferences valueOf() {
        SharedPreferences sharedPreferences = ag$a;
        if (sharedPreferences == null) {
            runAnimators.valueOf("sharedPref");
        }
        return sharedPreferences;
    }

    public final boolean ah$a() {
        return HaptikSDK$a;
    }

    public final HashMap<String, String> ag$a() {
        return ah$a;
    }

    public final void ag$a(HashMap<String, String> hashMap) {
        runAnimators.ag$a(hashMap, "<set-?>");
        ah$a = hashMap;
    }

    public final void valueOf(Context context, String str, boolean z) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("ACCOUNT_PREFS", 0);
        runAnimators.ah$a(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        ag$a = sharedPreferences;
        Context applicationContext = context.getApplicationContext();
        runAnimators.ah$a(applicationContext, "context.applicationContext");
        toString = applicationContext;
        valueOf = new onLoadCanceled(str, true, false, null, z, 12, null);
    }
}
