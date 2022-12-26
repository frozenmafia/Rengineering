package o;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class setMovementGranularities {
    private final CleverTapInstanceConfig ah$a;
    private final Context toString;
    private final isShowingHintText valueOf;

    public setMovementGranularities(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, isShowingHintText isshowinghinttext) {
        this.toString = context;
        this.ah$a = cleverTapInstanceConfig;
        this.valueOf = isshowinghinttext;
    }

    public boolean valueOf(JSONObject jSONObject, int i) {
        if (this.ah$a.getInitSettings()) {
            return false;
        }
        if (jSONObject.has("evtName")) {
            try {
                if (Arrays.asList(isPassword.valueOf).contains(jSONObject.getString("evtName"))) {
                    return false;
                }
            } catch (JSONException unused) {
            }
        }
        return i == 4 && !this.valueOf.onNavigationEvent();
    }

    public boolean toString(JSONObject jSONObject, int i) {
        if (i == 7) {
            return false;
        }
        if (this.valueOf.onMessageChannelReady()) {
            String jSONObject2 = jSONObject == null ? "null" : jSONObject.toString();
            setBoundsInScreen HaptikSDK$c = this.ah$a.HaptikSDK$c();
            String valueOf = this.ah$a.valueOf();
            HaptikSDK$c.ag$a(valueOf, "Current user is opted out dropping event: " + jSONObject2);
            return true;
        } else if (values()) {
            setBoundsInScreen HaptikSDK$c2 = this.ah$a.HaptikSDK$c();
            String valueOf2 = this.ah$a.valueOf();
            HaptikSDK$c2.ah$a(valueOf2, "CleverTap is muted, dropping event - " + jSONObject.toString());
            return true;
        } else {
            return false;
        }
    }

    private boolean values() {
        return ((int) (System.currentTimeMillis() / 1000)) - setError.toString(this.toString, this.ah$a, "comms_mtd", 0) < 86400;
    }
}
