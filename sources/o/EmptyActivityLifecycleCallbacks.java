package o;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes4.dex */
public class EmptyActivityLifecycleCallbacks {
    private Context toString;
    private SharedPreferences valueOf;

    public EmptyActivityLifecycleCallbacks(Context context) {
        this.toString = context;
        this.valueOf = context.getSharedPreferences("FanCodePreference", 0);
    }

    public void values(String str, String str2) {
        SharedPreferences.Editor edit = this.valueOf.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public String ag$a(String str, String str2) {
        return this.valueOf.getString(str, str2);
    }

    public void ag$a(String str) {
        SharedPreferences.Editor edit = this.valueOf.edit();
        edit.remove(str);
        edit.apply();
    }
}
