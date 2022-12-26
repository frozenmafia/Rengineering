package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.ah;
import com.appsflyer.internal.am;
import com.appsflyer.internal.bu;
import com.appsflyer.internal.l;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpHost;
/* loaded from: classes3.dex */
public class LinkGenerator {
    private String AFInAppEventParameterName;
    String AFInAppEventType;
    private String AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private String onAttributionFailureNative;
    private String onDeepLinkingNative;
    private String valueOf;
    String values;
    private Map<String, String> onAppOpenAttributionNative = new HashMap();
    private Map<String, String> onInstallConversionFailureNative = new HashMap();

    public LinkGenerator(String str) {
        this.AFKeystoreWrapper = str;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.onDeepLinkingNative = str;
        return this;
    }

    public String getBrandDomain() {
        return this.onDeepLinkingNative;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.onAttributionFailureNative = str;
        return this;
    }

    public String getChannel() {
        return this.valueOf;
    }

    public LinkGenerator setChannel(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.init = str;
        return this;
    }

    public String getMediaSource() {
        return this.AFKeystoreWrapper;
    }

    public Map<String, String> getParameters() {
        return this.onAppOpenAttributionNative;
    }

    public String getCampaign() {
        return this.AFInAppEventParameterName;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventParameterName = str;
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.onAppOpenAttributionNative.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.onAppOpenAttributionNative.putAll(map);
        }
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.getLevel = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.AppsFlyer2dXConversionCallback = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFInAppEventType = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), ah.AFInAppEventParameterName().getHostName()), str3);
        } else {
            this.AFInAppEventType = String.format("https://%s/%s", (str2 == null || str2.length() < 5) ? "go.onelink.me" : "go.onelink.me", str);
        }
        return this;
    }

    private StringBuilder valueOf() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFInAppEventType;
        if (str != null && str.startsWith(HttpHost.DEFAULT_SCHEME_NAME)) {
            sb.append(this.AFInAppEventType);
        } else {
            sb.append(String.format(bu.values, AppsFlyerLib.getInstance().getHostPrefix(), ah.AFInAppEventParameterName().getHostName()));
        }
        if (this.values != null) {
            sb.append('/');
            sb.append(this.values);
        }
        this.onInstallConversionFailureNative.put("pid", this.AFKeystoreWrapper);
        sb.append('?');
        sb.append("pid=");
        sb.append(AFInAppEventType(this.AFKeystoreWrapper, "media source"));
        String str2 = this.AFLogger$LogLevel;
        if (str2 != null) {
            this.onInstallConversionFailureNative.put("af_referrer_uid", str2);
            sb.append('&');
            sb.append("af_referrer_uid=");
            sb.append(AFInAppEventType(this.AFLogger$LogLevel, "referrerUID"));
        }
        String str3 = this.valueOf;
        if (str3 != null) {
            this.onInstallConversionFailureNative.put(AFInAppEventParameterName.AF_CHANNEL, str3);
            sb.append('&');
            sb.append("af_channel=");
            sb.append(AFInAppEventType(this.valueOf, "channel"));
        }
        String str4 = this.init;
        if (str4 != null) {
            this.onInstallConversionFailureNative.put("af_referrer_customer_id", str4);
            sb.append('&');
            sb.append("af_referrer_customer_id=");
            sb.append(AFInAppEventType(this.init, "referrerCustomerId"));
        }
        String str5 = this.AFInAppEventParameterName;
        if (str5 != null) {
            this.onInstallConversionFailureNative.put("c", str5);
            sb.append('&');
            sb.append("c=");
            sb.append(AFInAppEventType(this.AFInAppEventParameterName, "campaign"));
        }
        String str6 = this.getLevel;
        if (str6 != null) {
            this.onInstallConversionFailureNative.put("af_referrer_name", str6);
            sb.append('&');
            sb.append("af_referrer_name=");
            sb.append(AFInAppEventType(this.getLevel, "referrerName"));
        }
        String str7 = this.AppsFlyer2dXConversionCallback;
        if (str7 != null) {
            this.onInstallConversionFailureNative.put("af_referrer_image_url", str7);
            sb.append('&');
            sb.append("af_referrer_image_url=");
            sb.append(AFInAppEventType(this.AppsFlyer2dXConversionCallback, "referrerImageURL"));
        }
        if (this.onAttributionFailureNative != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.onAttributionFailureNative);
            sb2.append(this.onAttributionFailureNative.endsWith("/") ? "" : "/");
            String str8 = this.AFVersionDeclaration;
            if (str8 != null) {
                sb2.append(str8);
            }
            this.onInstallConversionFailureNative.put("af_dp", sb2.toString());
            sb.append('&');
            sb.append("af_dp=");
            sb.append(AFInAppEventType(this.onAttributionFailureNative, "baseDeeplink"));
            if (this.AFVersionDeclaration != null) {
                sb.append(this.onAttributionFailureNative.endsWith("/") ? "" : "%2F");
                sb.append(AFInAppEventType(this.AFVersionDeclaration, "deeplinkPath"));
            }
        }
        for (String str9 : this.onAppOpenAttributionNative.keySet()) {
            String obj = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str9);
            sb3.append("=");
            sb3.append(AFInAppEventType(this.onAppOpenAttributionNative.get(str9), str9));
            if (!obj.contains(sb3.toString())) {
                sb.append('&');
                sb.append(str9);
                sb.append('=');
                sb.append(AFInAppEventType(this.onAppOpenAttributionNative.get(str9), str9));
            }
        }
        return sb;
    }

    private static String AFInAppEventType(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.values(sb.toString(), e);
            return "";
        } catch (Throwable th) {
            AFLogger.values(th);
            return "";
        }
    }

    public String generateLink() {
        return valueOf().toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        if (!this.onAppOpenAttributionNative.isEmpty()) {
            for (Map.Entry<String, String> entry : this.onAppOpenAttributionNative.entrySet()) {
                this.onInstallConversionFailureNative.put(entry.getKey(), entry.getValue());
            }
        }
        valueOf();
        String str = this.onDeepLinkingNative;
        Map<String, String> map = this.onInstallConversionFailureNative;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, ah.AFInAppEventParameterName(), context, AppsFlyerLib.getInstance().isStopped());
        createOneLinkHttpTask.setConnProvider(new am.d());
        createOneLinkHttpTask.setListener(responseListener);
        createOneLinkHttpTask.setBrandDomain(str);
        if (l.AFKeystoreWrapper == null) {
            l.AFKeystoreWrapper = new l();
        }
        l.AFKeystoreWrapper.AFInAppEventParameterName().execute(createOneLinkHttpTask);
    }
}
