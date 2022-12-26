package o;

import android.webkit.JavascriptInterface;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class isContentInvalid {
    private CTInAppBaseFullFragment toString;
    private final WeakReference<CleverTapAPI> values;

    public isContentInvalid(CleverTapAPI cleverTapAPI, CTInAppBaseFullFragment cTInAppBaseFullFragment) {
        this.values = new WeakReference<>(cleverTapAPI);
        this.toString = cTInAppBaseFullFragment;
    }

    @JavascriptInterface
    public void promptPushPermission(boolean z) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
            return;
        }
        dismissInAppNotification();
        cleverTapAPI.ag$a(z);
    }

    @JavascriptInterface
    public void dismissInAppNotification() {
        if (this.values.get() == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else {
            this.toString.ah$a(null);
        }
    }

    @JavascriptInterface
    public void addMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else {
            cleverTapAPI.ah$a(str, str2);
        }
    }

    @JavascriptInterface
    public void incrementValue(String str, double d) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else {
            cleverTapAPI.valueOf(str, Double.valueOf(d));
        }
    }

    @JavascriptInterface
    public void decrementValue(String str, double d) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else {
            cleverTapAPI.values(str, Double.valueOf(d));
        }
    }

    @JavascriptInterface
    public void addMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else if (str == null) {
            setBoundsInScreen.values("Key passed to CTWebInterface is null");
        } else if (str2 != null) {
            try {
                cleverTapAPI.values(str, setFocusable.ag$a(new JSONArray(str2)));
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to parse values from WebView " + e.getLocalizedMessage());
            }
        } else {
            setBoundsInScreen.values("values passed to CTWebInterface is null");
        }
    }

    @JavascriptInterface
    public void pushChargedEvent(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (str != null) {
            try {
                hashMap = setFocusable.values(new JSONObject(str));
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to parse chargeDetails for Charged Event from WebView " + e.getLocalizedMessage());
            }
            ArrayList<HashMap<String, Object>> arrayList = null;
            if (str2 != null) {
                try {
                    arrayList = setFocusable.values(new JSONArray(str2));
                } catch (JSONException e2) {
                    setBoundsInScreen.values("Unable to parse items for Charged Event from WebView " + e2.getLocalizedMessage());
                }
                cleverTapAPI.ah$a(hashMap, arrayList);
                return;
            }
            return;
        }
        setBoundsInScreen.values("chargeDetails passed to CTWebInterface is null");
    }

    @JavascriptInterface
    public void pushEvent(String str) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else {
            cleverTapAPI.HaptikWebView(str);
        }
    }

    @JavascriptInterface
    public void pushEvent(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else if (str2 != null) {
            try {
                cleverTapAPI.ah$a(str, setFocusable.values(new JSONObject(str2)));
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to parse eventActions from WebView " + e.getLocalizedMessage());
            }
        } else {
            setBoundsInScreen.values("eventActions passed to CTWebInterface is null");
        }
    }

    @JavascriptInterface
    public void pushProfile(String str) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else if (str != null) {
            try {
                cleverTapAPI.ah$a(setFocusable.values(new JSONObject(str)));
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to parse profile from WebView " + e.getLocalizedMessage());
            }
        } else {
            setBoundsInScreen.values("profile passed to CTWebInterface is null");
        }
    }

    @JavascriptInterface
    public void removeMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else if (str == null) {
            setBoundsInScreen.values("Key passed to CTWebInterface is null");
        } else if (str2 == null) {
            setBoundsInScreen.values("Value passed to CTWebInterface is null");
        } else {
            cleverTapAPI.ag$a(str, str2);
        }
    }

    @JavascriptInterface
    public void removeMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else if (str == null) {
            setBoundsInScreen.values("Key passed to CTWebInterface is null");
        } else if (str2 != null) {
            try {
                cleverTapAPI.toString(str, setFocusable.ag$a(new JSONArray(str2)));
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to parse values from WebView " + e.getLocalizedMessage());
            }
        } else {
            setBoundsInScreen.values("values passed to CTWebInterface is null");
        }
    }

    @JavascriptInterface
    public void removeValueForKey(String str) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else if (str == null) {
            setBoundsInScreen.values("Key passed to CTWebInterface is null");
        } else {
            cleverTapAPI.ak(str);
        }
    }

    @JavascriptInterface
    public void setMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else if (str == null) {
            setBoundsInScreen.values("Key passed to CTWebInterface is null");
        } else if (str2 != null) {
            try {
                cleverTapAPI.valueOf(str, setFocusable.ag$a(new JSONArray(str2)));
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to parse values from WebView " + e.getLocalizedMessage());
            }
        } else {
            setBoundsInScreen.values("values passed to CTWebInterface is null");
        }
    }

    @JavascriptInterface
    public void onUserLogin(String str) {
        CleverTapAPI cleverTapAPI = this.values.get();
        if (cleverTapAPI == null) {
            setBoundsInScreen.ag$a("CleverTap Instance is null.");
        } else if (str != null) {
            try {
                cleverTapAPI.values(setFocusable.values(new JSONObject(str)));
            } catch (JSONException e) {
                setBoundsInScreen.values("Unable to parse profile from WebView " + e.getLocalizedMessage());
            }
        } else {
            setBoundsInScreen.values("profile passed to CTWebInterface is null");
        }
    }
}
