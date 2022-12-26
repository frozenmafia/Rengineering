package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Map;
/* loaded from: classes2.dex */
public class SupportMenuInflater extends findRealOwner {
    private Context ah$a;
    private SharedPreferences valueOf;

    public SupportMenuInflater(Context context, initializeTheme initializetheme) {
        super(initializetheme);
        this.ah$a = context;
        this.valueOf = context.getSharedPreferences("Dream11Prefs", 0);
        onRelationshipValidationResult();
    }

    @Override // o.findRealOwner
    protected void valueOf(Map<String, Object> map) {
        if (this.valueOf != null) {
            Log.d("SPTOriginal", HaptikSDK$d().toString());
            SharedPreferences.Editor edit = this.valueOf.edit();
            edit.clear();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if (value instanceof Boolean) {
                    edit.remove(key);
                    edit.putBoolean(this.toString.encrypt(key), ((Boolean) value).booleanValue());
                } else if (value instanceof Float) {
                    edit.remove(key);
                    edit.putFloat(this.toString.encrypt(key), ((Float) value).floatValue());
                } else if (value instanceof Integer) {
                    edit.remove(key);
                    edit.putInt(this.toString.encrypt(key), ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    edit.remove(key);
                    edit.putLong(this.toString.encrypt(key), ((Long) value).longValue());
                } else if (value instanceof String) {
                    edit.remove(key);
                    edit.putString(this.toString.encrypt(key), this.toString.encrypt((String) value));
                }
            }
            edit.commit();
        }
    }

    @Override // o.findRealOwner
    public boolean toString(String str) {
        return this.valueOf.contains(this.toString.encrypt(str));
    }

    @Override // o.findRealOwner
    protected Map<String, ?> HaptikSDK$d() {
        return this.valueOf.getAll();
    }

    @Override // o.findRealOwner
    public void ah$a(String str, String str2) {
        SharedPreferences.Editor edit = this.valueOf.edit();
        edit.putString(this.toString.encrypt(str), this.toString.encrypt(str2));
        edit.apply();
    }

    @Override // o.findRealOwner
    public String values(String str, String str2) {
        return this.toString.decrypt(this.valueOf.getString(this.toString.encrypt(str), this.toString.encrypt(str2)));
    }

    @Override // o.findRealOwner
    public void ag$a(String str, int i) {
        SharedPreferences.Editor edit = this.valueOf.edit();
        edit.putInt(this.toString.encrypt(str), i);
        edit.apply();
    }

    @Override // o.findRealOwner
    public int ah$a(String str, int i) {
        return this.valueOf.getInt(this.toString.encrypt(str), i);
    }

    @Override // o.findRealOwner
    public void valueOf(String str, long j) {
        SharedPreferences.Editor edit = this.valueOf.edit();
        edit.putLong(this.toString.encrypt(str), j);
        edit.apply();
    }

    @Override // o.findRealOwner
    public long toString(String str, long j) {
        return this.valueOf.getLong(this.toString.encrypt(str), j);
    }

    @Override // o.findRealOwner
    public void ag$a(String str, boolean z, String str2) {
        SharedPreferences.Editor edit = this.ah$a.getSharedPreferences(str2, 0).edit();
        edit.putBoolean(this.toString.encrypt(str), z);
        edit.apply();
    }

    @Override // o.findRealOwner
    public boolean values(String str, boolean z, String str2) {
        return this.ah$a.getSharedPreferences(str2, 0).getBoolean(this.toString.encrypt(str), z);
    }

    @Override // o.findRealOwner
    public void ah$a(String str, boolean z) {
        SharedPreferences.Editor edit = this.valueOf.edit();
        edit.putBoolean(this.toString.encrypt(str), z);
        edit.apply();
    }

    @Override // o.findRealOwner
    public boolean ag$a(String str, boolean z) {
        return this.valueOf.getBoolean(this.toString.encrypt(str), z);
    }

    @Override // o.findRealOwner
    public void HaptikSDK$b(String str) {
        SharedPreferences.Editor edit = this.valueOf.edit();
        edit.remove(this.toString.encrypt(str));
        edit.apply();
    }

    @Override // o.findRealOwner
    public void values() {
        SharedPreferences.Editor edit = this.valueOf.edit();
        edit.clear();
        edit.commit();
    }

    @Override // o.findRealOwner
    public void valueOf(String str) {
        SharedPreferences.Editor edit = this.ah$a.getSharedPreferences(str, 0).edit();
        edit.clear();
        edit.commit();
    }
}
