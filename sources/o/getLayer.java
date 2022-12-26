package o;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import o.AccessibilityViewCommand;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class getLayer extends AccessibilityViewCommand.SetProgressArguments {
    private final setBoundsInScreen ag$a;
    private final isLongClickable ah$a;
    private final CleverTapInstanceConfig valueOf;
    private final AccessibilityViewCommand.ScrollToPositionArguments values;

    public getLayer(AccessibilityViewCommand.ScrollToPositionArguments scrollToPositionArguments, CleverTapInstanceConfig cleverTapInstanceConfig, isLongClickable islongclickable) {
        this.values = scrollToPositionArguments;
        this.valueOf = cleverTapInstanceConfig;
        this.ag$a = cleverTapInstanceConfig.HaptikSDK$c();
        this.ah$a = islongclickable;
    }

    @Override // o.AccessibilityViewCommand.ScrollToPositionArguments
    public void values(JSONObject jSONObject, String str, Context context) {
        this.ag$a.ah$a(this.valueOf.valueOf(), "Processing Feature Flags response...");
        if (this.valueOf.HaptikSDK$d()) {
            this.ag$a.ah$a(this.valueOf.valueOf(), "CleverTap instance is configured to analytics only, not processing Feature Flags response");
            this.values.values(jSONObject, str, context);
        } else if (jSONObject == null) {
            this.ag$a.ah$a(this.valueOf.valueOf(), "Feature Flag : Can't parse Feature Flags Response, JSON response object is null");
        } else if (!jSONObject.has("ff_notifs")) {
            this.ag$a.ah$a(this.valueOf.valueOf(), "Feature Flag : JSON object doesn't contain the Feature Flags key");
            this.values.values(jSONObject, str, context);
        } else {
            try {
                this.ag$a.ah$a(this.valueOf.valueOf(), "Feature Flag : Processing Feature Flags response");
                ag$a(jSONObject.getJSONObject("ff_notifs"));
            } catch (Throwable th) {
                this.ag$a.values(this.valueOf.valueOf(), "Feature Flag : Failed to parse response", th);
            }
            this.values.values(jSONObject, str, context);
        }
    }

    private void ag$a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getJSONArray("kv") != null && this.ah$a.ag$a() != null) {
            this.ah$a.ag$a().ag$a(jSONObject);
        } else {
            this.valueOf.HaptikSDK$c().ah$a(this.valueOf.valueOf(), "Feature Flag : Can't parse feature flags, CTFeatureFlagsController is null");
        }
    }
}
