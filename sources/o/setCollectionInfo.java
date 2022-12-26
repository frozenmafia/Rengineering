package o;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
/* loaded from: classes3.dex */
public class setCollectionInfo {
    private static setCollectionInfo HaptikSDK$a;
    private static String HaptikSDK$b;
    private static String HaptikSDK$c;
    private static String HaptikSDK$d;
    private static boolean HaptikSDK$e;
    private static boolean HaptikWebView;
    private static String a;
    private static boolean ag$a;
    private static boolean ah$a;
    private static String ah$b;
    private static String ak;
    private static String getInitSettings;
    private static boolean getSignupData;
    private static boolean invoke;
    private static String toString;
    private static String valueOf;
    private static String values;
    private final String[] aj$a;

    public static setCollectionInfo ag$a(Context context) {
        setCollectionInfo setcollectioninfo;
        synchronized (setCollectionInfo.class) {
            if (HaptikSDK$a == null) {
                HaptikSDK$a = new setCollectionInfo(context);
            }
            setcollectioninfo = HaptikSDK$a;
        }
        return setcollectioninfo;
    }

    private setCollectionInfo(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Throwable unused) {
            bundle = null;
        }
        bundle = bundle == null ? new Bundle() : bundle;
        if (values == null) {
            values = ah$a(bundle, "CLEVERTAP_ACCOUNT_ID");
        }
        if (valueOf == null) {
            valueOf = ah$a(bundle, "CLEVERTAP_TOKEN");
        }
        if (toString == null) {
            toString = ah$a(bundle, "CLEVERTAP_REGION");
        }
        getInitSettings = ah$a(bundle, "CLEVERTAP_NOTIFICATION_ICON");
        HaptikWebView = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(ah$a(bundle, "CLEVERTAP_USE_GOOGLE_AD_ID"));
        ah$a = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(ah$a(bundle, "CLEVERTAP_DISABLE_APP_LAUNCHED"));
        HaptikSDK$b = ah$a(bundle, "CLEVERTAP_INAPP_EXCLUDE");
        HaptikSDK$e = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(ah$a(bundle, "CLEVERTAP_SSL_PINNING"));
        ag$a = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(ah$a(bundle, "CLEVERTAP_BACKGROUND_SYNC"));
        getSignupData = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(ah$a(bundle, "CLEVERTAP_USE_CUSTOM_ID"));
        String ah$a2 = ah$a(bundle, "FCM_SENDER_ID");
        HaptikSDK$c = ah$a2;
        if (ah$a2 != null) {
            HaptikSDK$c = ah$a2.replace("id:", "");
        }
        HaptikSDK$d = ah$a(bundle, "CLEVERTAP_APP_PACKAGE");
        invoke = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(ah$a(bundle, "CLEVERTAP_BETA"));
        if (ah$b == null) {
            ah$b = ah$a(bundle, "CLEVERTAP_INTENT_SERVICE");
        }
        if (ak == null) {
            ak = ah$a(bundle, "CLEVERTAP_XIAOMI_APP_KEY");
        }
        if (a == null) {
            a = ah$a(bundle, "CLEVERTAP_XIAOMI_APP_ID");
        }
        this.aj$a = valueOf(bundle);
    }

    public String valueOf() {
        return values;
    }

    public String invoke() {
        return HaptikSDK$b;
    }

    public String HaptikSDK$a() {
        return HaptikSDK$c;
    }

    public String HaptikSDK$c() {
        return ah$b;
    }

    public String ah$b() {
        return getInitSettings;
    }

    public String[] HaptikWebView() {
        return this.aj$a;
    }

    public boolean ag$a() {
        return invoke;
    }

    public String values() {
        setBoundsInScreen.values("ManifestInfo: getAccountRegion called, returning region:" + toString);
        return toString;
    }

    public String ah$a() {
        return valueOf;
    }

    public String HaptikSDK$b() {
        return HaptikSDK$d;
    }

    public boolean getSignupData() {
        return ah$a;
    }

    public boolean HaptikSDK$d() {
        return ag$a;
    }

    public boolean getInitSettings() {
        return HaptikSDK$e;
    }

    public boolean HaptikSDK$e() {
        return getSignupData;
    }

    public boolean isLogoutPending() {
        return HaptikWebView;
    }

    private String[] valueOf(Bundle bundle) {
        String ah$a2 = ah$a(bundle, "CLEVERTAP_IDENTIFIER");
        return !TextUtils.isEmpty(ah$a2) ? ah$a2.split(",") : isPassword.ah$a;
    }

    public static void values(String str, String str2, String str3) {
        values = str;
        valueOf = str2;
        toString = str3;
    }

    private static String ah$a(Bundle bundle, String str) {
        try {
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
