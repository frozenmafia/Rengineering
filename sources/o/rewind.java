package o;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class rewind {
    private final Uri toString;

    public rewind(Uri uri) {
        this.toString = uri;
    }

    public Map<String, String> valueOf() throws AuthError {
        String queryParameter = this.toString.getQueryParameter("state");
        if (queryParameter != null) {
            HashMap hashMap = new HashMap();
            for (String str : TextUtils.split(queryParameter, "&")) {
                String[] split = TextUtils.split(str, "=");
                if (split != null && split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
            return hashMap;
        }
        throw new AuthError(String.format("Response does not have a state parameter: %s", this.toString.toString()), AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
    }
}
