package o;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import o.AccessibilityViewCommand;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class PathInterpolatorApi14 extends AccessibilityViewCommand.SetProgressArguments {
    private final AccessibilityViewCommand.ScrollToPositionArguments ag$a;
    private final CleverTapInstanceConfig ah$a;
    private final setBoundsInScreen toString;

    public PathInterpolatorApi14(AccessibilityViewCommand.ScrollToPositionArguments scrollToPositionArguments, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.ag$a = scrollToPositionArguments;
        this.ah$a = cleverTapInstanceConfig;
        this.toString = cleverTapInstanceConfig.HaptikSDK$c();
    }

    @Override // o.AccessibilityViewCommand.ScrollToPositionArguments
    public void values(JSONObject jSONObject, String str, Context context) {
        int i;
        try {
            if (jSONObject.has("console")) {
                JSONArray jSONArray = (JSONArray) jSONObject.get("console");
                if (jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        this.toString.ag$a(this.ah$a.valueOf(), jSONArray.get(i2).toString());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (jSONObject.has("dbg_lvl") && (i = jSONObject.getInt("dbg_lvl")) >= 0) {
                CleverTapAPI.toString(i);
                setBoundsInScreen setboundsinscreen = this.toString;
                String valueOf = this.ah$a.valueOf();
                setboundsinscreen.ah$a(valueOf, "Set debug level to " + i + " for this session (set by upstream)");
            }
        } catch (Throwable unused2) {
        }
        this.ag$a.values(jSONObject, str, context);
    }
}
