package o;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import o.AccessibilityViewCommand;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class PathInterpolatorCompat extends AccessibilityViewCommand.SetProgressArguments {
    private final CleverTapInstanceConfig ag$a;
    private final getFromIndex ah$a;
    private final setBoundsInScreen toString;
    private final AccessibilityViewCommand.ScrollToPositionArguments valueOf;
    private final isScrollable values;

    public PathInterpolatorCompat(AccessibilityViewCommand.ScrollToPositionArguments scrollToPositionArguments, CleverTapInstanceConfig cleverTapInstanceConfig, isScrollable isscrollable, getFromIndex getfromindex) {
        this.valueOf = scrollToPositionArguments;
        this.ag$a = cleverTapInstanceConfig;
        this.toString = cleverTapInstanceConfig.HaptikSDK$c();
        this.values = isscrollable;
        this.ah$a = getfromindex;
    }

    @Override // o.AccessibilityViewCommand.ScrollToPositionArguments
    public void values(JSONObject jSONObject, String str, Context context) {
        try {
            if (jSONObject.has("g")) {
                String string = jSONObject.getString("g");
                this.values.values(string);
                setBoundsInScreen setboundsinscreen = this.toString;
                String valueOf = this.ag$a.valueOf();
                setboundsinscreen.ah$a(valueOf, "Got a new device ID: " + string);
            }
        } catch (Throwable th) {
            this.toString.values(this.ag$a.valueOf(), "Failed to update device ID!", th);
        }
        try {
            if (jSONObject.has("_i")) {
                this.ah$a.ag$a(context, jSONObject.getLong("_i"));
            }
        } catch (Throwable unused) {
        }
        try {
            if (jSONObject.has("_j")) {
                this.ah$a.toString(context, jSONObject.getLong("_j"));
            }
        } catch (Throwable unused2) {
        }
        this.valueOf.values(jSONObject, str, context);
    }
}
