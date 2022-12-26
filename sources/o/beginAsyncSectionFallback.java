package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.http.HttpResponseCache;
import android.os.Build;
import com.google.android.exoplayer2.util.MimeTypes;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import irjuc.irjuc.cqqlq.irjuc.zihjx.krrvc;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.ChangeBounds;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class beginAsyncSectionFallback {
    public static ChangeBounds.AnonymousClass6 ah$a;

    public static void ag$a(String str, String str2) {
        ChangeBounds.AnonymousClass6 anonymousClass6 = ah$a;
        if (anonymousClass6 != null) {
            anonymousClass6.HaptikSDK$b(str, str2);
        }
    }

    public static JSONObject ah$a(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        if (z) {
            return jSONObject.getJSONObject(str);
        }
        if (z2 && jSONObject.isNull(str)) {
            throw new JSONException(String.format(Locale.US, "Value is null for key %s when key is specified as not null", str));
        }
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public static void ah$a(String str, String str2) {
        ChangeBounds.AnonymousClass6 anonymousClass6 = ah$a;
        if (anonymousClass6 != null) {
            anonymousClass6.values(str, str2);
        }
    }

    public static boolean ah$a() {
        return Build.VERSION.SDK_INT <= 25;
    }

    public static String toString(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        if (z) {
            return jSONObject.getString(str);
        }
        if (z2 && jSONObject.isNull(str)) {
            throw new JSONException(String.format(Locale.US, "Value is null for key %s when key is specified as not null", str));
        }
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static boolean toString(Object obj, String str, String str2) {
        if (obj == null) {
            ag$a(str, String.format("{%s} is null or empty", str2));
            return true;
        }
        return false;
    }

    public static boolean toString(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static JSONArray valueOf(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        if (z) {
            return jSONObject.getJSONArray(str);
        }
        if (z2 && jSONObject.isNull(str)) {
            throw new JSONException(String.format(Locale.US, "Value is null for key %s when key is specified as not null", str));
        }
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONArray(str);
    }

    public static void valueOf(String str, String str2) {
        ChangeBounds.AnonymousClass6 anonymousClass6 = ah$a;
        if (anonymousClass6 != null) {
            anonymousClass6.ah$a(str, str2);
        }
    }

    public static void valueOf(String str, String str2, Exception exc) {
        ChangeBounds.AnonymousClass6 anonymousClass6 = ah$a;
        if (anonymousClass6 != null) {
            anonymousClass6.valueOf(str, str2, exc);
        }
    }

    public static boolean valueOf(Activity activity, String str) {
        boolean z = androidx.core.content.ContextCompat.checkSelfPermission(activity, str) == 0;
        ag$a("PermissionUtils", String.format("permission status {%s : %s}", str, Boolean.valueOf(z)));
        return z;
    }

    public static boolean valueOf(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static void values(String str, String str2) {
        ChangeBounds.AnonymousClass6 anonymousClass6 = ah$a;
        if (anonymousClass6 != null) {
            anonymousClass6.valueOf(str, str2);
        }
    }

    public static boolean values(Context context, String str) {
        PackageManager packageManager;
        Intent launchIntentForPackage;
        if (context == null || (launchIntentForPackage = (packageManager = context.getPackageManager()).getLaunchIntentForPackage(str)) == null) {
            return false;
        }
        return !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty();
    }

    public static boolean values(jmjou jmjouVar) {
        if (jmjouVar.toString(HttpResponseCache.class.getCanonicalName()) != null) {
            valueOf("Utils", "http response cache is already installed, returning...");
            return true;
        }
        try {
            ag$a("Utils", "trying to setup http cache ...");
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            if (installed == null) {
                Context context = jmjou.valueOf;
                ((setBottomRight) jmjouVar.values(setBottomRight.class)).getClass();
                File file = new File(context.getCacheDir(), "phonepesdkcache");
                ((setBottomRight) jmjouVar.values(setBottomRight.class)).getClass();
                long j = 1048576;
                ag$a("Utils", String.format("trying to setup http cache in dir = {%s}.", file));
                HttpResponseCache.install(file, j);
            }
            ag$a("Utils", "http response cache is installed");
            jmjouVar.ag$a(HttpResponseCache.class.getCanonicalName(), installed);
            return true;
        } catch (Exception e) {
            String format = String.format("IOException caught , http response cache installation failed. exception message = {%s}", e.getMessage());
            ChangeBounds.AnonymousClass6 anonymousClass6 = ah$a;
            if (anonymousClass6 != null) {
                anonymousClass6.ag$a("Utils", format);
            }
            return false;
        }
    }

    public static boolean values(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        if (z) {
            return jSONObject.getBoolean(str);
        }
        if (z2 && jSONObject.isNull(str)) {
            throw new JSONException(String.format(Locale.US, "Value is null for key %s when key is specified as not null", str));
        }
        if (jSONObject.isNull(str)) {
            return false;
        }
        return jSONObject.getBoolean(str);
    }

    public static String ag$a(jmjou jmjouVar, String str) {
        try {
            ag$a("Utils", String.format("trying to get application name for the package = {%s}", str));
            jmjouVar.getClass();
            PackageManager packageManager = jmjou.valueOf.getPackageManager();
            String charSequence = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
            ag$a("Utils", String.format("application name for package name = {%s} is {%s}", str, charSequence));
            return charSequence;
        } catch (Exception e) {
            ah$a("Utils", String.format("Exception app name not found, exception message = {%s}", e.getMessage()));
            ((setBottomRight) jmjouVar.values(setBottomRight.class)).getClass();
            return MimeTypes.BASE_TYPE_APPLICATION;
        }
    }

    public static String values(jmjou jmjouVar, String str, String str2) {
        MessageDigest messageDigest;
        try {
            String ag$a = jmjouVar.ag$a();
            if (str2 != null) {
                String str3 = str2 + str + ag$a;
                messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                messageDigest.update(str3.getBytes("UTF-8"));
            } else {
                String str4 = str + ag$a;
                messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                messageDigest.update(str4.getBytes("UTF-8"));
            }
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            valueOf("Utils", e.getMessage(), e);
            return null;
        }
    }

    public static String ag$a(jmjou jmjouVar) {
        jmjouVar.getClass();
        Context context = jmjou.valueOf;
        if (!valueOf((Boolean) jmjouVar.toString("com.phonepe.android.sdk.isUAT"))) {
            ((setBottomRight) jmjouVar.values(setBottomRight.class)).getClass();
            return "com.phonepe.app";
        } else if ("com.phonepe.networkclient.Environment.PRODUCTION".matches("com.phonepe.networkclient.Environment.STAGE")) {
            ((setBottomRight) jmjouVar.values(setBottomRight.class)).getClass();
            if (values(context, "com.phonepe.app.debug")) {
                return "com.phonepe.app.debug";
            }
            ((setBottomRight) jmjouVar.values(setBottomRight.class)).getClass();
            return "com.phonepe.app.debug.internal";
        } else {
            ((setBottomRight) jmjouVar.values(setBottomRight.class)).getClass();
            if (values(context, "com.phonepe.app.preprod.internal")) {
                return "com.phonepe.app.preprod.internal";
            }
            ((setBottomRight) jmjouVar.values(setBottomRight.class)).getClass();
            return "com.phonepe.app.preprod";
        }
    }

    public static List<ResolveInfo> ah$a(jmjou jmjouVar, Intent intent) {
        try {
            if (toString(intent, "Utils", "implicitIntent")) {
                jmjouVar.valueOf().ah$a("Utils", "implicitIntent is null", krrvc.irjuc.cqqlq);
                return new ArrayList();
            }
            jmjouVar.getClass();
            return jmjou.valueOf.getPackageManager().queryIntentActivities(intent, 65536);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int ah$a(String str, jmjou jmjouVar) {
        jmjouVar.getClass();
        try {
            return jmjou.valueOf.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            ah$a("Utils", String.format("Exception app name not found, exception message = {%s}", e.getMessage()));
            return -1;
        }
    }
}
