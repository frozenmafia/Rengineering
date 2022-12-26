package o;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import o.AccessibilityViewCommand;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class getContentMimeTypes extends AccessibilityViewCommand.SetProgressArguments {
    private final isLongClickable ag$a;
    private final getTouchDelegateInfo ah$a;
    private final setBoundsInScreen invoke;
    private final CleverTapInstanceConfig toString;
    private final AccessibilityViewCommand.ScrollToPositionArguments valueOf;
    private final Object values;

    public getContentMimeTypes(AccessibilityViewCommand.ScrollToPositionArguments scrollToPositionArguments, CleverTapInstanceConfig cleverTapInstanceConfig, isAccessibilityFocused isaccessibilityfocused, getTouchDelegateInfo gettouchdelegateinfo, isLongClickable islongclickable) {
        this.valueOf = scrollToPositionArguments;
        this.toString = cleverTapInstanceConfig;
        this.ah$a = gettouchdelegateinfo;
        this.invoke = cleverTapInstanceConfig.HaptikSDK$c();
        this.values = isaccessibilityfocused.ag$a();
        this.ag$a = islongclickable;
    }

    @Override // o.AccessibilityViewCommand.ScrollToPositionArguments
    public void values(JSONObject jSONObject, String str, Context context) {
        if (this.toString.HaptikSDK$d()) {
            this.invoke.ah$a(this.toString.valueOf(), "CleverTap instance is configured to analytics only, not processing inbox messages");
            this.valueOf.values(jSONObject, str, context);
            return;
        }
        this.invoke.ah$a(this.toString.valueOf(), "Inbox: Processing response");
        if (!jSONObject.has("inbox_notifs")) {
            this.invoke.ah$a(this.toString.valueOf(), "Inbox: Response JSON object doesn't contain the inbox key");
            this.valueOf.values(jSONObject, str, context);
            return;
        }
        try {
            ah$a(jSONObject.getJSONArray("inbox_notifs"));
        } catch (Throwable th) {
            this.invoke.values(this.toString.valueOf(), "InboxResponse: Failed to parse response", th);
        }
        this.valueOf.values(jSONObject, str, context);
    }

    private void ah$a(JSONArray jSONArray) {
        synchronized (this.values) {
            if (this.ag$a.valueOf() == null) {
                this.ag$a.HaptikSDK$c();
            }
            if (this.ag$a.valueOf() != null && this.ag$a.valueOf().valueOf(jSONArray)) {
                this.ah$a.ah$a();
            }
        }
    }
}
