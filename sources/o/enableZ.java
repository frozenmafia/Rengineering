package o;

import com.conviva.sdk.ConvivaSdkConstants;
import com.facebook.react.uimanager.ViewProps;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class enableZ implements handleException {
    public List<String> ah$a;
    public endAsyncSectionFallback valueOf;

    public String ah$a() {
        return this.valueOf.values().getString("precacheUrl", null);
    }

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
        this.valueOf = (endAsyncSectionFallback) jmjouVar.values(endAsyncSectionFallback.class);
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return true;
    }

    public final int toString(String str) {
        if (str.matches("DEBUG")) {
            return 0;
        }
        if (!str.matches("ERROR")) {
            if (str.matches("INFO")) {
                return 1;
            }
            if (str.matches("WARN")) {
                return 2;
            }
        }
        return 3;
    }

    public void valueOf(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("sdkConfig")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("sdkConfig");
                    JSONObject ah$a = beginAsyncSectionFallback.ah$a(jSONObject2, "precache", false, false);
                    if (ah$a != null) {
                        if (ah$a.has(ViewProps.ENABLED)) {
                            this.valueOf.values().edit().putBoolean("isPrecacheEnabled", beginAsyncSectionFallback.values(ah$a, ViewProps.ENABLED, false, false)).apply();
                        }
                        this.valueOf.values().edit().putString("precacheUrl", beginAsyncSectionFallback.toString(ah$a, "url", false, false)).apply();
                    }
                    if (jSONObject2.has("cache")) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("cache");
                        if (jSONObject3.has("usePrecache")) {
                            this.valueOf.values().edit().putBoolean("usePrecache", jSONObject3.getBoolean("usePrecache")).apply();
                        }
                        if (jSONObject3.has("webviewCacheEnabled")) {
                            this.valueOf.values().edit().putBoolean("isWebViewCacheEnabled", jSONObject3.getBoolean("webviewCacheEnabled")).apply();
                        }
                        if (jSONObject3.has("fileTypes")) {
                            this.valueOf.values().edit().putString("fileTypes", jSONObject3.getJSONArray("fileTypes").toString()).apply();
                        }
                    }
                    if (jSONObject2.has("androidLogs")) {
                        JSONObject jSONObject4 = jSONObject2.getJSONObject("androidLogs");
                        if (jSONObject4.has(ViewProps.ENABLED)) {
                            this.valueOf.values().edit().putBoolean("areAndroidLogsEnabled", jSONObject4.getBoolean(ViewProps.ENABLED)).apply();
                        }
                        if (jSONObject4.has(ConvivaSdkConstants.LOG_LEVEL)) {
                            this.valueOf.values().edit().putInt("androidLogsLevel", toString(jSONObject4.getString(ConvivaSdkConstants.LOG_LEVEL))).apply();
                        }
                        if (jSONObject4.has("reportingLevel")) {
                            this.valueOf.values().edit().putInt("androidLogsReportingLocation", jSONObject4.getString("reportingLevel").matches("REMOTE") ? 1 : 0).apply();
                        }
                    }
                    if (jSONObject2.has("webLogs")) {
                        JSONObject jSONObject5 = jSONObject2.getJSONObject("webLogs");
                        if (jSONObject5.has(ViewProps.ENABLED)) {
                            this.valueOf.values().edit().putBoolean("areWebLogsEnabled", jSONObject5.getBoolean(ViewProps.ENABLED)).apply();
                        }
                        if (jSONObject5.has(ConvivaSdkConstants.LOG_LEVEL)) {
                            this.valueOf.values().edit().putInt("webLogsLevel", toString(jSONObject5.getString(ConvivaSdkConstants.LOG_LEVEL))).apply();
                        }
                        if (jSONObject5.has("reportingLevel")) {
                            this.valueOf.values().edit().putInt("webLogsReportingLocation", jSONObject5.getString("reportingLevel").matches("REMOTE") ? 1 : 0).apply();
                        }
                    }
                    if (jSONObject2.has("cacheMetricsReporting")) {
                        JSONObject jSONObject6 = jSONObject2.getJSONObject("cacheMetricsReporting");
                        if (jSONObject6.has(ViewProps.ENABLED)) {
                            this.valueOf.values().edit().putBoolean("isCacheReportingEnabled", jSONObject6.getBoolean(ViewProps.ENABLED)).apply();
                        }
                    }
                    if (jSONObject2.has("sdkToAppCommunication")) {
                        JSONObject jSONObject7 = jSONObject2.getJSONObject("sdkToAppCommunication");
                        if (jSONObject7.has("showPhonePeEnabled")) {
                            this.valueOf.values().edit().putBoolean("showPhonePeEnabled", jSONObject7.getBoolean("showPhonePeEnabled")).apply();
                        }
                    }
                }
            } catch (Exception e) {
                beginAsyncSectionFallback.valueOf("SDKConfig", e.getMessage(), e);
            }
        }
    }
}
