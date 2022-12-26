package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.apxor.androidsdk.core.Constants;
import com.sendbird.android.constant.StringSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class ap {
    private static String AFInAppEventParameterName = "https://%smonitorsdk.%s/remote-debug?app_id=";
    private static ap AFKeystoreWrapper;
    boolean AFInAppEventType;
    private int AFLogger$LogLevel;
    private boolean AppsFlyer2dXConversionCallback;
    private boolean getLevel;
    private JSONObject valueOf;
    private boolean values = true;
    private final List<String> init = new ArrayList();
    private String AFVersionDeclaration = "-1";

    private ap() {
        this.AFLogger$LogLevel = 0;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
        this.AppsFlyer2dXConversionCallback = z;
        this.AFInAppEventType = true ^ z;
        this.AFLogger$LogLevel = 0;
        this.getLevel = false;
    }

    public static ap AFInAppEventParameterName() {
        if (AFKeystoreWrapper == null) {
            AFKeystoreWrapper = new ap();
        }
        return AFKeystoreWrapper;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventType(String str) {
        synchronized (this) {
            this.AFVersionDeclaration = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventType() {
        synchronized (this) {
            this.getLevel = true;
            valueOf("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void values() {
        synchronized (this) {
            valueOf("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            this.getLevel = false;
            this.values = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFKeystoreWrapper() {
        synchronized (this) {
            this.valueOf = null;
            AFKeystoreWrapper = null;
        }
    }

    private boolean AFVersionDeclaration() {
        if (this.AFInAppEventType) {
            return this.values || this.getLevel;
        }
        return false;
    }

    private void AFInAppEventType(String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (this) {
            try {
                this.valueOf.put("brand", str);
                this.valueOf.put("model", str2);
                this.valueOf.put(Constants.PLATFORM, StringSet.Android);
                this.valueOf.put("platform_version", str3);
                if (str4 != null && str4.length() > 0) {
                    this.valueOf.put("advertiserId", str4);
                }
                if (str5 != null && str5.length() > 0) {
                    this.valueOf.put("imei", str5);
                }
                if (str6 != null && str6.length() > 0) {
                    this.valueOf.put("android_id", str6);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        synchronized (this) {
            try {
                this.valueOf.put(Constants.SDK_VERSION, str);
                if (str2 != null && str2.length() > 0) {
                    this.valueOf.put("devkey", str2);
                }
                if (str3 != null && str3.length() > 0) {
                    this.valueOf.put("originalAppsFlyerId", str3);
                }
                if (str4 != null && str4.length() > 0) {
                    this.valueOf.put("uid", str4);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void AFInAppEventParameterName(String str, String str2, String str3, String str4) {
        synchronized (this) {
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        this.valueOf.put("app_id", str);
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.valueOf.put(Constants.VERSION, str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.valueOf.put("channel", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.valueOf.put("preInstall", str4);
            }
        }
    }

    public final void valueOf(String str, String str2, String... strArr) {
        String obj;
        synchronized (this) {
            if (AFVersionDeclaration()) {
                if (this.AFLogger$LogLevel < 98304) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        String join = TextUtils.join(", ", strArr);
                        if (str != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append(com.dreampay.commons.constants.Constants.WHITE_SPACE);
                            sb.append(Thread.currentThread().getId());
                            sb.append(" _/AppsFlyer_6.2.3 [");
                            sb.append(str);
                            sb.append("] ");
                            sb.append(str2);
                            sb.append(com.dreampay.commons.constants.Constants.WHITE_SPACE);
                            sb.append(join);
                            obj = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(currentTimeMillis);
                            sb2.append(com.dreampay.commons.constants.Constants.WHITE_SPACE);
                            sb2.append(Thread.currentThread().getId());
                            sb2.append(com.dreampay.commons.constants.Constants.WHITE_SPACE);
                            sb2.append(str2);
                            sb2.append("/AppsFlyer_6.2.3 ");
                            sb2.append(join);
                            obj = sb2.toString();
                        }
                        this.init.add(obj);
                        this.AFLogger$LogLevel += obj.length() << 1;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private String init() {
        String str;
        synchronized (this) {
            try {
                this.valueOf.put("data", new JSONArray((Collection) this.init));
                str = this.valueOf.toString();
                try {
                    getLevel();
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                str = null;
            }
        }
        return str;
    }

    private void AFInAppEventType(String str, PackageManager packageManager) {
        synchronized (this) {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            ah AFInAppEventParameterName2 = ah.AFInAppEventParameterName();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            if (string != null) {
                try {
                    this.valueOf = new JSONObject(string);
                } catch (Throwable unused) {
                }
            } else {
                this.valueOf = new JSONObject();
                AFInAppEventType(Build.BRAND, Build.MODEL, Build.VERSION.RELEASE, appsFlyerProperties.getString("advertiserId"), AFInAppEventParameterName2.init, AFInAppEventParameterName2.AFLogger$LogLevel);
                StringBuilder sb = new StringBuilder("6.2.3.");
                sb.append(ah.valueOf);
                AFKeystoreWrapper(sb.toString(), appsFlyerProperties.getString(AppsFlyerProperties.AF_KEY), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                try {
                    int i = packageManager.getPackageInfo(str, 0).versionCode;
                    AFInAppEventParameterName(str, String.valueOf(i), appsFlyerProperties.getString("channel"), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", this.valueOf.toString());
            }
            try {
                this.valueOf.put("launch_counter", this.AFVersionDeclaration);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static String[] AFKeystoreWrapper(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        for (int i = 1; i < stackTraceElementArr.length; i++) {
            strArr[i] = stackTraceElementArr[i].toString();
        }
        return strArr;
    }

    private void getLevel() {
        synchronized (this) {
            this.init.clear();
            this.AFLogger$LogLevel = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void valueOf() {
        synchronized (this) {
            this.values = false;
            getLevel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean AppsFlyer2dXConversionCallback() {
        return this.getLevel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void values(String str, PackageManager packageManager) {
        try {
            if (AFKeystoreWrapper == null) {
                AFKeystoreWrapper = new ap();
            }
            AFKeystoreWrapper.AFInAppEventType(str, packageManager);
            if (AFKeystoreWrapper == null) {
                AFKeystoreWrapper = new ap();
            }
            String init = AFKeystoreWrapper.init();
            bi biVar = new bi();
            biVar.onDeepLinkingNative = init;
            biVar.onDeepLinking = AppsFlyerLib.getInstance().isStopped();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), ah.AFInAppEventParameterName().getHostName()));
            sb.append(str);
            new Thread(new m((bd) biVar.AFInAppEventParameterName(sb.toString()))).start();
        } catch (Throwable th) {
            AFLogger.values(th);
        }
    }
}
