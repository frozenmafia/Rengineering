package o;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes5.dex */
public class willRunSimpleAnimations {
    private final Bundle valueOf;

    public willRunSimpleAnimations(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.valueOf = new Bundle(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer valueOf() {
        Integer ag$a = ag$a("gcm.n.notification_count");
        if (ag$a == null) {
            return null;
        }
        if (ag$a.intValue() < 0) {
            String valueOf = String.valueOf(ag$a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
            sb.append("notificationCount is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting notificationCount.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
        return ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer ah$b() {
        Integer ag$a = ag$a("gcm.n.notification_priority");
        if (ag$a == null) {
            return null;
        }
        if (ag$a.intValue() < -2 || ag$a.intValue() > 2) {
            String valueOf = String.valueOf(ag$a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
            sb.append("notificationPriority is invalid ");
            sb.append(valueOf);
            sb.append(". Skipping setting notificationPriority.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
        return ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer invoke() {
        Integer ag$a = ag$a("gcm.n.visibility");
        if (ag$a == null) {
            return null;
        }
        if (ag$a.intValue() < -1 || ag$a.intValue() > 1) {
            String valueOf = String.valueOf(ag$a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
            sb.append("visibility is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting visibility.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        return ag$a;
    }

    public String HaptikSDK$b(String str) {
        return this.valueOf.getString(HaptikSDK$d(str));
    }

    private String HaptikSDK$d(String str) {
        if (!this.valueOf.containsKey(str) && str.startsWith("gcm.n.")) {
            String HaptikWebView = HaptikWebView(str);
            if (this.valueOf.containsKey(HaptikWebView)) {
                return HaptikWebView;
            }
        }
        return str;
    }

    public boolean values(String str) {
        String HaptikSDK$b = HaptikSDK$b(str);
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(HaptikSDK$b) || Boolean.parseBoolean(HaptikSDK$b);
    }

    public Integer ag$a(String str) {
        String HaptikSDK$b = HaptikSDK$b(str);
        if (TextUtils.isEmpty(HaptikSDK$b)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(HaptikSDK$b));
        } catch (NumberFormatException unused) {
            String signupData = getSignupData(str);
            StringBuilder sb = new StringBuilder(String.valueOf(signupData).length() + 38 + String.valueOf(HaptikSDK$b).length());
            sb.append("Couldn't parse value of ");
            sb.append(signupData);
            sb.append("(");
            sb.append(HaptikSDK$b);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public Long HaptikSDK$a(String str) {
        String HaptikSDK$b = HaptikSDK$b(str);
        if (TextUtils.isEmpty(HaptikSDK$b)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(HaptikSDK$b));
        } catch (NumberFormatException unused) {
            String signupData = getSignupData(str);
            StringBuilder sb = new StringBuilder(String.valueOf(signupData).length() + 38 + String.valueOf(HaptikSDK$b).length());
            sb.append("Couldn't parse value of ");
            sb.append(signupData);
            sb.append("(");
            sb.append(HaptikSDK$b);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public String valueOf(String str) {
        return HaptikSDK$b(String.valueOf(str).concat("_loc_key"));
    }

    public Object[] ah$a(String str) {
        JSONArray willrunsimpleanimations = toString(String.valueOf(str).concat("_loc_args"));
        if (willrunsimpleanimations == null) {
            return null;
        }
        int length = willrunsimpleanimations.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = willrunsimpleanimations.optString(i);
        }
        return strArr;
    }

    public JSONArray toString(String str) {
        String HaptikSDK$b = HaptikSDK$b(str);
        if (TextUtils.isEmpty(HaptikSDK$b)) {
            return null;
        }
        try {
            return new JSONArray(HaptikSDK$b);
        } catch (JSONException unused) {
            String signupData = getSignupData(str);
            StringBuilder sb = new StringBuilder(String.valueOf(signupData).length() + 50 + String.valueOf(HaptikSDK$b).length());
            sb.append("Malformed JSON for key ");
            sb.append(signupData);
            sb.append(": ");
            sb.append(HaptikSDK$b);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    private static String getSignupData(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public Uri ah$a() {
        String HaptikSDK$b = HaptikSDK$b("gcm.n.link_android");
        if (TextUtils.isEmpty(HaptikSDK$b)) {
            HaptikSDK$b = HaptikSDK$b("gcm.n.link");
        }
        if (TextUtils.isEmpty(HaptikSDK$b)) {
            return null;
        }
        return Uri.parse(HaptikSDK$b);
    }

    public String HaptikSDK$c() {
        String HaptikSDK$b = HaptikSDK$b("gcm.n.sound2");
        return TextUtils.isEmpty(HaptikSDK$b) ? HaptikSDK$b("gcm.n.sound") : HaptikSDK$b;
    }

    public long[] HaptikSDK$b() {
        JSONArray willrunsimpleanimations = toString("gcm.n.vibrate_timings");
        if (willrunsimpleanimations == null) {
            return null;
        }
        try {
            if (willrunsimpleanimations.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = willrunsimpleanimations.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = willrunsimpleanimations.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(willrunsimpleanimations);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] values() {
        JSONArray willrunsimpleanimations = toString("gcm.n.light_settings");
        if (willrunsimpleanimations == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (willrunsimpleanimations.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = invoke(willrunsimpleanimations.optString(0));
            iArr[1] = willrunsimpleanimations.optInt(1);
            iArr[2] = willrunsimpleanimations.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(willrunsimpleanimations);
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60 + String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(valueOf);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(willrunsimpleanimations);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf2);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public Bundle getInitSettings() {
        Bundle bundle = new Bundle(this.valueOf);
        for (String str : this.valueOf.keySet()) {
            if (HaptikSDK$c(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle HaptikSDK$a() {
        Bundle bundle = new Bundle(this.valueOf);
        for (String str : this.valueOf.keySet()) {
            if (!ah$b(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public String toString(Resources resources, String str, String str2) {
        String valueOf = valueOf(str2);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        int identifier = resources.getIdentifier(valueOf, "string", str);
        if (identifier == 0) {
            String signupData = getSignupData(String.valueOf(str2).concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(signupData).length() + 49 + String.valueOf(str2).length());
            sb.append(signupData);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] ah$a = ah$a(str2);
        if (ah$a == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, ah$a);
        } catch (MissingFormatArgumentException e) {
            String signupData2 = getSignupData(str2);
            String arrays = Arrays.toString(ah$a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(signupData2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(signupData2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e);
            return null;
        }
    }

    public String ag$a(Resources resources, String str, String str2) {
        String HaptikSDK$b = HaptikSDK$b(str2);
        return !TextUtils.isEmpty(HaptikSDK$b) ? HaptikSDK$b : toString(resources, str, str2);
    }

    public String ag$a() {
        return HaptikSDK$b("gcm.n.android_channel_id");
    }

    private static boolean ah$b(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    private static boolean HaptikSDK$c(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static int invoke(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean valueOf(Bundle bundle) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("gcm.n.e")) || IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString(HaptikWebView("gcm.n.e")));
    }

    private static String HaptikWebView(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }
}
