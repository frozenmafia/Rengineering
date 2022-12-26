package com.apxor.androidsdk.core.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.SDKController;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes3.dex */
public class c {
    private SharedPreferences a;

    public void a(Context context) {
        this.a = context.getSharedPreferences(Constants.APX_PREFS, 0);
    }

    public void b(String str, String str2) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public void c(String str) {
        if (this.a == null || str == null) {
            return;
        }
        String processName = SDKController.getInstance().getProcessName();
        SharedPreferences sharedPreferences = this.a;
        try {
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString(processName + "_" + Constants.SESSION_IDS, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!str.equals(string)) {
                    arrayList.add(string);
                }
            }
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(processName + "_" + Constants.SESSION_IDS, arrayList.toString());
            edit.apply();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.a == null) {
            return arrayList;
        }
        String processName = SDKController.getInstance().getProcessName();
        SharedPreferences sharedPreferences = this.a;
        try {
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString(processName + "_" + Constants.SESSION_IDS, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public void b(String str, long j) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public void b(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public String a(String str, String str2) {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }

    public long a(String str) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return 1L;
        }
        long j = sharedPreferences.getLong(str, 0L);
        SharedPreferences.Editor edit = this.a.edit();
        long j2 = j + 1;
        edit.putLong(str, j2);
        edit.apply();
        return j2;
    }

    public void b(String str) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.apply();
    }

    public long a(String str, long j) {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences == null ? j : sharedPreferences.getLong(str, j);
    }

    public boolean a(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences == null ? z : sharedPreferences.getBoolean(str, z);
    }
}
