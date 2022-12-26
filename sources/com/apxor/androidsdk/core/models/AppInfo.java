package com.apxor.androidsdk.core.models;

import android.content.Context;
import android.os.Build;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.SDKController;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class AppInfo {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f265b;
    private String c;
    private String d;
    private long e;
    private long f;

    private String a(Context context) {
        return c() ? Constants.EMULATOR_MODE : g(context) ? Constants.PRODUCTION_MODE : !f(context) ? Constants.BETA_MODE : Constants.DEV_TEST_MODE;
    }

    private String b(Context context) {
        int i = context.getApplicationInfo().labelRes;
        return i == 0 ? "unknown app name" : context.getString(i);
    }

    private String c(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            SDKController.getInstance().logException("ai_g_av", e);
        }
        return str == null ? "?" : str;
    }

    private long d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Exception e) {
            SDKController.getInstance().logException("ai_g_id", e);
            return 0L;
        }
    }

    private boolean f(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private boolean g(Context context) {
        return "com.android.vending".equals(context.getPackageManager().getInstallerPackageName(context.getPackageName()));
    }

    public void e(Context context) {
        this.a = c(context);
        this.f265b = b(context);
        this.c = a(context);
        this.d = context.getPackageName();
        this.e = d(context);
        this.f = SDKController.getInstance().getSharedPreferencesWrapper().a(Constants.SDK_FIRST_RUN_TIME_WEB, -1L);
    }

    public JSONObject getJSONData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.VERSION, this.a);
            jSONObject.put(Constants.APP_NAME, this.f265b);
            jSONObject.put(Constants.APP_MODE, this.c);
            jSONObject.put(Constants.BUNDLE_ID, this.d);
            jSONObject.put(Constants.INSTALLATION_TIME, this.e);
            long j = this.f;
            if (j >= 0) {
                jSONObject.put(Constants.SDK_FIRST_RUN_TIME_WEB, j);
            }
        } catch (JSONException e) {
            SDKController.getInstance().logException("ai_g_jd", e);
        }
        return jSONObject;
    }

    public String b() {
        return this.a;
    }

    public String a() {
        return this.f265b;
    }

    public void a(long j, long j2) {
        if (SDKController.getInstance().isFirstSession()) {
            if (j <= 0) {
                j = System.currentTimeMillis();
            }
            this.f = Math.abs(j2 - j);
        }
    }

    private boolean c() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains(Constants.EMULATOR_MODE) && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                return false;
            }
        }
        return true;
    }
}
