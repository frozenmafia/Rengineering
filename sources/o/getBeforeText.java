package o;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class getBeforeText {
    private final Context ag$a;
    private final isScrollable toString;
    private final CleverTapInstanceConfig valueOf;

    public getBeforeText(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, isScrollable isscrollable) {
        this.ag$a = context;
        this.valueOf = cleverTapInstanceConfig;
        this.toString = isscrollable;
    }

    public void values(String str, String str2, String str3) {
        if (invoke() || str == null || str2 == null || str3 == null) {
            return;
        }
        String str4 = str2 + "_" + str3;
        JSONObject ah$a = ah$a();
        try {
            ah$a.put(str4, str);
            ah$a(ah$a);
        } catch (Throwable th) {
            this.valueOf.HaptikSDK$c().ah$a(this.valueOf.valueOf(), "Error caching guid: " + th.toString());
        }
    }

    public void values(String str, String str2) {
        if (invoke() || str == null || str2 == null) {
            return;
        }
        JSONObject ah$a = ah$a();
        try {
            Iterator<String> keys = ah$a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.toLowerCase().contains(str2.toLowerCase()) && ah$a.getString(next).equals(str)) {
                    ah$a.remove(next);
                    if (ah$a.length() == 0) {
                        HaptikSDK$c();
                    } else {
                        ah$a(ah$a);
                    }
                }
            }
        } catch (Throwable th) {
            setBoundsInScreen HaptikSDK$c = this.valueOf.HaptikSDK$c();
            String valueOf = this.valueOf.valueOf();
            HaptikSDK$c.ah$a(valueOf, "Error removing cached key: " + th.toString());
        }
    }

    public boolean values() {
        boolean z = ah$a().length() > 1;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.valueOf;
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "deviceIsMultiUser:[" + z + "]");
        return z;
    }

    public JSONObject ah$a() {
        String seterror = setError.toString(this.ag$a, this.valueOf, "cachedGUIDsKey", (String) null);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.valueOf;
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "getCachedGUIDs:[" + seterror + "]");
        return commitContent.ah$a(seterror, this.valueOf.HaptikSDK$c(), this.valueOf.valueOf());
    }

    public void ah$a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String jSONObject2 = jSONObject.toString();
            setError.valueOf(setError.toString(this.ag$a, null).edit().putString(setError.ag$a(this.valueOf, "cachedGUIDsKey"), jSONObject2));
            CleverTapInstanceConfig cleverTapInstanceConfig = this.valueOf;
            cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "setCachedGUIDs:[" + jSONObject2 + "]");
        } catch (Throwable th) {
            setBoundsInScreen HaptikSDK$c = this.valueOf.HaptikSDK$c();
            String valueOf = this.valueOf.valueOf();
            HaptikSDK$c.ah$a(valueOf, "Error persisting guid cache: " + th.toString());
        }
    }

    public void HaptikSDK$c() {
        try {
            setError.valueOf(setError.toString(this.ag$a, null).edit().remove(setError.ag$a(this.valueOf, "cachedGUIDsKey")));
            this.valueOf.valueOf("ON_USER_LOGIN", "removeCachedGUIDs:[]");
        } catch (Throwable th) {
            setBoundsInScreen HaptikSDK$c = this.valueOf.HaptikSDK$c();
            String valueOf = this.valueOf.valueOf();
            HaptikSDK$c.ah$a(valueOf, "Error removing guid cache: " + th.toString());
        }
    }

    public String ag$a() {
        String seterror = setError.toString(this.ag$a, this.valueOf, "SP_KEY_PROFILE_IDENTITIES", "");
        CleverTapInstanceConfig cleverTapInstanceConfig = this.valueOf;
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "getCachedIdentityKeysForAccount:" + seterror);
        return seterror;
    }

    public String valueOf(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        try {
            String string = ah$a().getString(str + "_" + str2);
            CleverTapInstanceConfig cleverTapInstanceConfig = this.valueOf;
            cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "getGUIDForIdentifier:[Key:" + str + ", value:" + string + "]");
            return string;
        } catch (Throwable th) {
            setBoundsInScreen HaptikSDK$c = this.valueOf.HaptikSDK$c();
            String valueOf = this.valueOf.valueOf();
            HaptikSDK$c.ah$a(valueOf, "Error reading guid cache: " + th.toString());
            return null;
        }
    }

    public boolean valueOf() {
        boolean z = ah$a().length() <= 0;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.valueOf;
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "isAnonymousDevice:[" + z + "]");
        return z;
    }

    public boolean ah$b() {
        JSONObject ah$a = ah$a();
        boolean z = ah$a != null && ah$a.length() > 0 && TextUtils.isEmpty(ag$a());
        CleverTapInstanceConfig cleverTapInstanceConfig = this.valueOf;
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "isLegacyProfileLoggedIn:" + z);
        return z;
    }

    public void toString(String str) {
        setError.valueOf(this.ag$a, this.valueOf, "SP_KEY_PROFILE_IDENTITIES", str);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.valueOf;
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "saveIdentityKeysForAccount:" + str);
    }

    private boolean invoke() {
        boolean onMessageChannelReady = this.toString.onMessageChannelReady();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.valueOf;
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "isErrorDeviceId:[" + onMessageChannelReady + "]");
        return onMessageChannelReady;
    }
}
