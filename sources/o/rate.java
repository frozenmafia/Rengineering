package o;

import com.amazon.identity.auth.device.AuthError;
import org.apache.http.HttpResponse;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class rate extends rateWithExtras {
    private static final String valueOf = "ba";

    public rate(HttpResponse httpResponse, String str, String str2) {
        super(httpResponse, str, str2);
        String str3 = valueOf;
        putEncryptedObject.valueOf(str3, "Creating OauthCodeForTokenResponse appId=" + str);
    }

    @Override // o.rateWithExtras
    public cc ah$b(JSONObject jSONObject) throws AuthError {
        cc ah$b = super.ah$b(jSONObject);
        if (ah$b != null) {
            return ah$b;
        }
        throw new AuthError("JSON response did not contain an AccessAtzToken", AuthError.ERROR_TYPE.ERROR_JSON);
    }

    @Override // o.rateWithExtras
    boolean values(String str, String str2) {
        return false;
    }
}
