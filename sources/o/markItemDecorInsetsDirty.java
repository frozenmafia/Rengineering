package o;

import o.isAccessibilityEnabled;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class markItemDecorInsetsDirty implements isComputingLayout {
    @Override // o.isComputingLayout
    public isAccessibilityEnabled ah$a(hasUpdatedView hasupdatedview, JSONObject jSONObject) throws JSONException {
        isAccessibilityEnabled$ag$a ag$a;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has(com.apxor.androidsdk.core.ce.Constants.SESSION_ATTR)) {
            ag$a = ag$a(jSONObject.getJSONObject(com.apxor.androidsdk.core.ce.Constants.SESSION_ATTR));
        } else {
            ag$a = ag$a(new JSONObject());
        }
        return new isAccessibilityEnabled(values(hasupdatedview, optInt2, jSONObject), ag$a, ah$a(jSONObject.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }

    private static isAccessibilityEnabled.values ah$a(JSONObject jSONObject) {
        return new isAccessibilityEnabled.values(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    private static isAccessibilityEnabled$ag$a ag$a(JSONObject jSONObject) {
        return new isAccessibilityEnabled$ag$a(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long values(hasUpdatedView hasupdatedview, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return hasupdatedview.values() + (j * 1000);
    }
}
