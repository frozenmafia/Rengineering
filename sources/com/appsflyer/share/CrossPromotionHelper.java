package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.ah;
import com.appsflyer.internal.bu;
import com.appsflyer.internal.bw;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public class CrossPromotionHelper {
    private static String AFInAppEventType = "https://%simpression.%s";

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFKeystoreWrapper = AFKeystoreWrapper(context, str, str2, map, String.format(bu.values, AppsFlyerLib.getInstance().getHostPrefix(), ah.AFInAppEventParameterName().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new c(AFKeystoreWrapper.generateLink(), new bw(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new Thread(new c(AFKeystoreWrapper(context, str, str2, map, String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), ah.AFInAppEventParameterName().getHostName())).generateLink(), null, null, AppsFlyerLib.getInstance().isStopped())).start();
        }
    }

    private static LinkGenerator AFKeystoreWrapper(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventType = str3;
        linkGenerator.values = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c2 = 1;
                }
            } else if (key.equals("app")) {
                c2 = 0;
            }
            if (c2 == 0) {
                bu.values = value;
            } else if (c2 == 1) {
                AFInAppEventType = value;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class c implements Runnable {
        private final bw AFInAppEventParameterName;
        private final WeakReference<Context> AFKeystoreWrapper;
        private final String valueOf;
        private final boolean values;

        c(String str, bw bwVar, Context context, boolean z) {
            this.valueOf = str;
            this.AFInAppEventParameterName = bwVar;
            this.AFKeystoreWrapper = new WeakReference<>(context);
            this.values = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th;
            HttpURLConnection httpURLConnection;
            if (this.values) {
                return;
            }
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.valueOf).openConnection();
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = null;
            }
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(false);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                    sb.append(this.valueOf);
                    AFLogger.values(sb.toString(), false);
                } else if (responseCode == 301 || responseCode == 302) {
                    StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                    sb2.append(this.valueOf);
                    AFLogger.values(sb2.toString(), false);
                    if (this.AFInAppEventParameterName != null && this.AFKeystoreWrapper.get() != null) {
                        this.AFInAppEventParameterName.values = httpURLConnection.getHeaderField("Location");
                        bw bwVar = this.AFInAppEventParameterName;
                        Context context = this.AFKeystoreWrapper.get();
                        if (bwVar.values != null) {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bwVar.values)).setFlags(268435456));
                        }
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder("call to ");
                    sb3.append(this.valueOf);
                    sb3.append(" failed: ");
                    sb3.append(responseCode);
                    AFLogger.valueOf(sb3.toString());
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    AFLogger.AFInAppEventParameterName(th.getMessage(), th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }
    }
}
