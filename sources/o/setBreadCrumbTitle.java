package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import o.FragmentLifecycleCallbacksDispatcher;
/* loaded from: classes6.dex */
public class setBreadCrumbTitle {
    private static final String ag$a = "PackagerConnectionSettings";
    private final Context toString;
    private final SharedPreferences valueOf;
    private final String values;

    public setBreadCrumbTitle(Context context) {
        this.valueOf = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        this.values = context.getPackageName();
        this.toString = context;
    }

    public String values() {
        String string = this.valueOf.getString("debug_http_host", null);
        if (!TextUtils.isEmpty(string)) {
            return (String) FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(string);
        }
        String ah$a = addToBackStack.ah$a(this.toString);
        if (ah$a.equals("localhost")) {
            String str = ag$a;
            FragmentActivity.ah$a(str, "You seem to be running on device. Run '" + addToBackStack.values(this.toString) + "' to forward the debug server's port to the device.");
        }
        return ah$a;
    }

    public void toString(String str) {
        this.valueOf.edit().putString("debug_http_host", str).apply();
    }

    public String ag$a() {
        return addToBackStack.toString(this.toString);
    }

    public String ah$a() {
        return this.values;
    }
}
