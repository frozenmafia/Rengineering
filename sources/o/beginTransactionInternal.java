package o;

import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import o.IMultiInstanceInvalidationService;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
class beginTransactionInternal {
    private final JSONObject ah$a;
    private final unique toString;
    private final Context valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public beginTransactionInternal(Context context, unique uniqueVar, JSONObject jSONObject) {
        this.valueOf = context;
        this.toString = uniqueVar;
        this.ah$a = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        HaptikSDK$e();
        invoke();
        ah$a();
        HaptikSDK$b();
        valueOf();
        HaptikSDK$c();
        HaptikWebView();
        values();
        ah$b();
        HaptikSDK$a();
        HaptikSDK$d();
    }

    private void HaptikSDK$e() {
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null) {
            this.toString.ag$a("o9", jSONObject.optString("o9"), true);
            this.toString.ag$a("p1", this.ah$a.optString("p1"), true);
            this.toString.ag$a("p2", this.ah$a.optString("p2"), true);
            return;
        }
        try {
            Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(this.valueOf, 1);
            if (actualDefaultRingtoneUri != null) {
                this.toString.ag$a("o9", toString(actualDefaultRingtoneUri), true);
            }
            Uri actualDefaultRingtoneUri2 = RingtoneManager.getActualDefaultRingtoneUri(this.valueOf, 2);
            if (actualDefaultRingtoneUri2 != null) {
                this.toString.ag$a("p1", toString(actualDefaultRingtoneUri2), true);
            }
            Uri actualDefaultRingtoneUri3 = RingtoneManager.getActualDefaultRingtoneUri(this.valueOf, 4);
            if (actualDefaultRingtoneUri3 != null) {
                this.toString.ag$a("p2", toString(actualDefaultRingtoneUri3), true);
            }
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in collectRingtoneData: ", e);
            this.toString.ag$a("ringtone", e.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private String toString(Uri uri) {
        Exception e;
        Cursor cursor;
        ?? r0 = 0;
        try {
            try {
                cursor = this.valueOf.getContentResolver().query(uri, null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(cursor.getColumnIndex("_display_name"));
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return string;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        IMultiInstanceInvalidationService.Default.toString("Exception occurred in getNameFromUri: ", e);
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return null;
                    }
                }
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th) {
                r0 = uri;
                th = th;
                if (r0 != 0 && !r0.isClosed()) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    private void invoke() {
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null && jSONObject.has("p3") && this.ah$a.has("p4")) {
            this.toString.ag$a("p3", this.ah$a.optString("p3"), true);
            this.toString.ag$a("p4", this.ah$a.optJSONArray("p4"), true);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = this.valueOf.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null && resolveActivity.activityInfo != null) {
                this.toString.ag$a("p3", resolveActivity.activityInfo.packageName, true);
            } else {
                this.toString.ag$a("p3", "ResolveInfo.activityInfo is null");
            }
            List<ResolveInfo> queryIntentActivities = this.valueOf.getPackageManager().queryIntentActivities(intent, 65536);
            JSONArray jSONArray = new JSONArray();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    jSONArray.put(activityInfo.packageName);
                }
            }
            if (jSONArray.length() > 0) {
                this.toString.ag$a("p4", jSONArray, true);
            } else {
                this.toString.ag$a("p4", "ResolveInfo.activityInfo is null");
            }
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred collectInstalledLaunchersMeta: ", e);
            this.toString.ag$a("launcher", e.toString());
        }
    }

    private void ah$a() {
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null && jSONObject.has("p5") && this.ah$a.has("p6")) {
            this.toString.ag$a("p5", this.ah$a.optString("p5"), true);
            this.toString.ag$a("p6", this.ah$a.optJSONArray("p6"), true);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
            ResolveInfo resolveActivity = this.valueOf.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null && resolveActivity.activityInfo != null) {
                this.toString.ag$a("p5", resolveActivity.activityInfo.packageName, true);
            } else {
                this.toString.ag$a("p5", "ResolveInfo.activityInfo is null");
            }
            List<ResolveInfo> queryIntentActivities = this.valueOf.getPackageManager().queryIntentActivities(intent, 65536);
            JSONArray jSONArray = new JSONArray();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    jSONArray.put(activityInfo.packageName);
                }
            }
            if (jSONArray.length() > 0) {
                this.toString.ag$a("p6", jSONArray, true);
            } else {
                this.toString.ag$a("p6", "ResolveInfo.activityInfo is null");
            }
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in collectLauncherData: ", e);
            this.toString.ag$a("browser", e.toString());
        }
    }

    private void HaptikSDK$b() {
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null && jSONObject.has("p7") && this.ah$a.has("p8")) {
            this.toString.ag$a("p7", this.ah$a.optString("p7"), true);
            this.toString.ag$a("p8", this.ah$a.optJSONArray("p8"), true);
            return;
        }
        try {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.valueOf);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            if (defaultSmsPackage != null) {
                this.toString.ag$a("p7", defaultSmsPackage, true);
            } else {
                this.toString.ag$a("p7", "Messaging meta is null");
            }
            List<ResolveInfo> queryIntentActivities = this.valueOf.getPackageManager().queryIntentActivities(intent, 65536);
            JSONArray jSONArray = new JSONArray();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    jSONArray.put(activityInfo.packageName);
                }
            }
            if (jSONArray.length() > 0) {
                this.toString.ag$a("p8", jSONArray, true);
            } else {
                this.toString.ag$a("p8", "ResolveInfo.activityInfo is null");
            }
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception Occurred in collectInstalledMessagingMeta: ", e);
            this.toString.ag$a("messaging", e.toString());
        }
    }

    private void valueOf() {
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null && jSONObject.has("p9") && this.ah$a.has("q1")) {
            this.toString.ag$a("p9", this.ah$a.optString("p9", null), true);
            this.toString.ag$a("q1", this.ah$a.optJSONArray("q1"), true);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.CALL");
            intent.setData(Uri.parse("tel:*#06#"));
            ResolveInfo resolveActivity = this.valueOf.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null && resolveActivity.activityInfo != null) {
                this.toString.ag$a("p9", resolveActivity.activityInfo.packageName, true);
            } else {
                this.toString.ag$a("p9", "ResolveInfo.activityInfo is null");
            }
            List<ResolveInfo> queryIntentActivities = this.valueOf.getPackageManager().queryIntentActivities(intent, 65536);
            JSONArray jSONArray = new JSONArray();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    jSONArray.put(activityInfo.packageName);
                }
            }
            if (jSONArray.length() > 0) {
                this.toString.ag$a("q1", jSONArray, true);
            } else {
                this.toString.ag$a("q1", "ResolveInfo.activityInfo is null");
            }
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in collectInstalledCallingMeta: ", e);
            this.toString.ag$a("calling", e.toString());
        }
    }

    private void HaptikSDK$c() {
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null && jSONObject.has("q2") && this.ah$a.has("q4")) {
            this.toString.ag$a("q2", this.ah$a.optString("q2", null), true);
            this.toString.ag$a("q3", this.ah$a.optJSONArray("q3"), true);
            this.toString.ag$a("q4", this.ah$a.optString("q4", null), true);
            return;
        }
        try {
            String valueOf = InvalidationLiveDataContainer.valueOf(this.valueOf, "default_input_method", "", 2);
            InputMethodManager inputMethodManager = (InputMethodManager) this.valueOf.getSystemService("input_method");
            if (inputMethodManager != null) {
                JSONArray jSONArray = new JSONArray();
                List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
                if (inputMethodList != null) {
                    for (InputMethodInfo inputMethodInfo : inputMethodList) {
                        String packageName = inputMethodInfo.getPackageName();
                        if (!Insert.valueOf(valueOf) && valueOf.equals(inputMethodInfo.getId())) {
                            this.toString.ag$a("q2", packageName, true);
                        }
                        jSONArray.put(packageName);
                    }
                }
                this.toString.ag$a("q3", jSONArray, true);
            } else {
                this.toString.ag$a("input_method", "InputMethodManager is null");
            }
            this.toString.ag$a("q4", Locale.getDefault().getLanguage(), true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in collectInstalledIMEMeta: ", e);
            this.toString.ag$a("input_method", e.toString());
        }
    }

    private void HaptikWebView() {
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null && jSONObject.has("q5")) {
            this.toString.ag$a("q5", Long.valueOf(this.ah$a.optLong("q5")), true);
            return;
        }
        try {
            this.toString.ag$a("q5", Long.valueOf(TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS)), true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception Occurred in getTimeZoneOffset: ", e);
            this.toString.ag$a("q5", e.toString());
        }
    }

    private void ah$b() {
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null && jSONObject.has("q7")) {
            this.toString.ag$a("q7", Boolean.valueOf(this.ah$a.optBoolean("q7", false)), true);
            this.toString.ag$a("q8", this.ah$a.optString("q8", null), true);
            return;
        }
        try {
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(this.valueOf);
            if (wallpaperManager != null) {
                WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
                if (wallpaperInfo != null) {
                    this.toString.ag$a("q7", true, true);
                    this.toString.ag$a("q8", wallpaperInfo.getPackageName(), true);
                    return;
                }
                this.toString.ag$a("q7", false, true);
                return;
            }
            this.toString.ag$a("wallpaper", "WallPaperManager is null");
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception Occurred in collectLiveWallpaperMeta: ", e);
            this.toString.ag$a("wallpaper", e.toString());
        }
    }

    private void values() {
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null && jSONObject.has("q6")) {
            this.toString.ag$a("q6", Double.valueOf(this.ah$a.optDouble("q6")), true);
        }
        try {
            this.toString.ag$a("q6", Float.valueOf(new TextView(this.valueOf).getTextSize()), true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception Occurred in collectDefaultFontSizeInPixels: ", e);
            this.toString.ag$a("q6", e.toString());
        }
    }

    private void HaptikSDK$a() {
        String installerPackageName;
        JSONObject jSONObject = this.ah$a;
        if (jSONObject != null && jSONObject.has("r1")) {
            this.toString.ag$a("r1", this.ah$a.optString("r1"), true);
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installerPackageName = this.valueOf.getPackageManager().getInstallSourceInfo(this.valueOf.getPackageName()).getInstallingPackageName();
            } else {
                installerPackageName = this.valueOf.getPackageManager().getInstallerPackageName(this.valueOf.getPackageName());
            }
            this.toString.ag$a("r1", installerPackageName, true);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception Occurred in collectInstallerPackageName: ", e);
            this.toString.ag$a("r1", e.toString());
        }
    }

    private void HaptikSDK$d() {
        new resolveViews(this.valueOf, this.toString).values();
    }
}
