package o;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class getIControllerCallback {
    public SharedPreferences ag$a;

    public getIControllerCallback(SharedPreferences sharedPreferences) {
        this.ag$a = sharedPreferences;
    }

    public void ag$a(String str) {
        synchronized (this) {
            if (str != null) {
                SharedPreferences.Editor edit = this.ag$a.edit();
                edit.remove(str);
                edit.apply();
            }
        }
    }

    public void ah$a(String str, String str2) {
        synchronized (this) {
            WindowMetricsCalculatorDecorator.valueOf.valueOf("Writing key: %s and value %s", str, str2);
            SharedPreferences.Editor edit = this.ag$a.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    public String values(String str) {
        String string;
        synchronized (this) {
            string = this.ag$a.getString(str, "");
        }
        return string;
    }

    public void valueOf() {
        synchronized (this) {
            SharedPreferences.Editor edit = this.ag$a.edit();
            edit.clear();
            edit.apply();
        }
    }
}
