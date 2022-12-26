package o;

import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class seekTo extends onMessageChannelReady {
    private static final String toString = "bf";
    private JSONObject ah$a;

    public seekTo(HttpResponse httpResponse) {
        super(httpResponse);
    }

    private boolean ag$a(String str, String str2) {
        return "invalid_token".equals(str) || ("invalid_request".equals(str) && !TextUtils.isEmpty(str2) && str2.contains("access_token"));
    }

    private boolean toString(String str) {
        return "insufficient_scope".equals(str);
    }

    public JSONObject HaptikSDK$b() {
        return this.ah$a;
    }

    @Override // o.onMessageChannelReady
    protected void HaptikSDK$b(JSONObject jSONObject) throws AuthError, JSONException {
        try {
            String string = jSONObject.getString("error");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String string2 = jSONObject.getString("error_description");
            if (toString(string)) {
                String str = toString;
                putEncryptedObject.toString(str, "Insufficient scope in token in exchange.", "info=" + jSONObject, null);
                throw new AuthError("Profile request not valid for authorized scopes", AuthError.ERROR_TYPE.ERROR_BAD_API_PARAM);
            } else if (ag$a(string, string2)) {
                String str2 = toString;
                putEncryptedObject.toString(str2, "Invalid Token in exchange.", "info=" + jSONObject, null);
                throw new AuthError("Invalid Token in exchange. " + jSONObject, AuthError.ERROR_TYPE.ERROR_INVALID_TOKEN);
            } else {
                String str3 = toString;
                putEncryptedObject.toString(str3, "Server error doing authorization exchange.", "info=" + jSONObject, null);
                throw new AuthError("Server error doing authorization exchange. " + jSONObject, AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
            }
        } catch (JSONException unused) {
            if (TextUtils.isEmpty(null)) {
                return;
            }
            throw new AuthError("Server Error : " + ((String) null), AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.onMessageChannelReady
    public JSONObject ag$a(JSONObject jSONObject) throws JSONException {
        return jSONObject;
    }

    @Override // o.onMessageChannelReady
    public String values() {
        return "3.0.1";
    }

    @Override // o.onMessageChannelReady
    protected void values(JSONObject jSONObject) throws IOException, JSONException, AuthError {
        this.ah$a = jSONObject;
    }
}
