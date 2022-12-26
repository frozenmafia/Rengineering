package o;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.sendbird.android.constant.StringSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class registerFragmentLifecycleCallbacks {
    private static registerFragmentLifecycleCallbacks ag$a;
    private final generateActivityResultKey values;
    private String valueOf = null;
    private String HaptikSDK$b = null;
    private String ah$a = null;
    private ConcurrentHashMap<String, String> toString = new ConcurrentHashMap<>();

    private registerFragmentLifecycleCallbacks(Context context) {
        this.values = new generateActivityResultKey(context);
    }

    public static registerFragmentLifecycleCallbacks toString(Context context) {
        registerFragmentLifecycleCallbacks registerfragmentlifecyclecallbacks;
        synchronized (registerFragmentLifecycleCallbacks.class) {
            if (ag$a == null) {
                ag$a = new registerFragmentLifecycleCallbacks(context);
            }
            registerfragmentlifecyclecallbacks = ag$a;
        }
        return registerfragmentlifecyclecallbacks;
    }

    public void valueOf(String str, String str2, JSONObject jSONObject) {
        Bundle registerfragmentlifecyclecallbacks = toString(str2, str);
        registerfragmentlifecyclecallbacks.putString("payload", jSONObject.toString());
        this.values.values("cloud_games_preparing_request", registerfragmentlifecyclecallbacks);
    }

    public void ah$a(String str, String str2, JSONObject jSONObject) {
        Bundle registerfragmentlifecyclecallbacks = toString(str2, str);
        this.toString.put(str2, str);
        registerfragmentlifecyclecallbacks.putString("payload", jSONObject.toString());
        this.values.values("cloud_games_sent_request", registerfragmentlifecyclecallbacks);
    }

    public void ah$a(String str) {
        this.values.values("cloud_games_sending_success_response", toString(str));
    }

    public void valueOf(FacebookRequestError facebookRequestError, String str) {
        Bundle registerfragmentlifecyclecallbacks = toString(str);
        registerfragmentlifecyclecallbacks.putString(StringSet.error_code, Integer.toString(facebookRequestError.valueOf()));
        registerfragmentlifecyclecallbacks.putString("error_type", facebookRequestError.HaptikSDK$b());
        registerfragmentlifecyclecallbacks.putString("error_message", facebookRequestError.values());
        this.values.values("cloud_games_sending_error_response", registerfragmentlifecyclecallbacks);
    }

    private Bundle toString(String str) {
        Bundle ah$a = ah$a();
        if (str != null) {
            String orDefault = this.toString.getOrDefault(str, null);
            ah$a.putString(StringSet.request_id, str);
            if (orDefault != null) {
                ah$a.putString("function_type", orDefault);
                this.toString.remove(str);
            }
        }
        return ah$a;
    }

    private Bundle toString(String str, String str2) {
        Bundle ah$a = ah$a();
        ah$a.putString(StringSet.request_id, str);
        ah$a.putString("function_type", str2);
        return ah$a;
    }

    private Bundle ah$a() {
        Bundle bundle = new Bundle();
        String str = this.valueOf;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = this.ah$a;
        if (str2 != null) {
            bundle.putString(com.apxor.androidsdk.core.Constants.SESSION_ID, str2);
        }
        return bundle;
    }
}
