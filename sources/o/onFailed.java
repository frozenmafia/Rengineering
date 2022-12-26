package o;

import android.content.Intent;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class onFailed {
    public static final onFailed values = new onFailed();

    private onFailed() {
    }

    public final JSONObject ah$a(int i, Intent intent) {
        String ag$a = ag$a(i);
        JSONObject ag$a2 = ag$a(intent == null ? null : intent.getExtras());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resultCode", i);
        jSONObject.put("resultCodeString", ag$a);
        jSONObject.put("responseData", ag$a2);
        return jSONObject;
    }

    private final String ag$a(int i) {
        return i != -1 ? i != 0 ? i != 1 ? String.valueOf(i) : com.dreampay.commons.constants.Constants.RESULT_FIRST_USER : com.dreampay.commons.constants.Constants.RESULT_CANCELED : com.dreampay.commons.constants.Constants.RESULT_OK;
    }

    public final JSONObject ag$a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                try {
                    jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }
}
