package o;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import o.AccessibilityViewCommand;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class getColumn extends AccessibilityViewCommand.SetProgressArguments {
    private final setBoundsInScreen ag$a;
    private final AccessibilityViewCommand.ScrollToPositionArguments ah$a;
    private final setClickable toString;
    private final CleverTapInstanceConfig valueOf;
    private final getFromIndex values;

    public getColumn(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, isScrollable isscrollable, getFromIndex getfromindex, setClickable setclickable, AccessibilityViewCommand.ScrollToPositionArguments scrollToPositionArguments) {
        this.ah$a = scrollToPositionArguments;
        this.valueOf = cleverTapInstanceConfig;
        this.ag$a = cleverTapInstanceConfig.HaptikSDK$c();
        this.values = getfromindex;
        this.toString = setclickable;
    }

    @Override // o.AccessibilityViewCommand.ScrollToPositionArguments
    public void values(JSONObject jSONObject, String str, Context context) {
        if (str == null) {
            this.ag$a.ah$a(this.valueOf.valueOf(), "Problem processing queue response, response is null");
            return;
        }
        try {
            setBoundsInScreen setboundsinscreen = this.ag$a;
            String valueOf = this.valueOf.valueOf();
            setboundsinscreen.ah$a(valueOf, "Trying to process response: " + str);
            JSONObject jSONObject2 = new JSONObject(str);
            this.ah$a.values(jSONObject2, str, context);
            this.toString.valueOf(context, jSONObject2);
        } catch (Throwable th) {
            this.values.invoke();
            this.ag$a.values(this.valueOf.valueOf(), "Problem process send queue response", th);
        }
    }
}
