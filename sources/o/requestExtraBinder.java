package o;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.sendbird.android.constant.StringSet;
import org.apache.http.cookie.ClientCookie;
/* loaded from: classes6.dex */
public class requestExtraBinder {
    public String HaptikSDK$a;
    public String HaptikSDK$b;
    public Boolean HaptikSDK$c;
    public Boolean HaptikSDK$d;
    public Boolean HaptikSDK$e;
    public String HaptikWebView;
    public Boolean ag$a;
    public ReadableArray ah$a;
    public Boolean ah$b;
    public long getSignupData;
    public Boolean invoke;
    public String toString;
    public ReadableMap valueOf;
    public Boolean values;

    public requestExtraBinder(ReadableMap readableMap) {
        this.HaptikSDK$d = false;
        this.HaptikSDK$c = true;
        this.getSignupData = 60000L;
        this.invoke = false;
        this.ah$b = true;
        this.ah$a = null;
        if (readableMap == null) {
            return;
        }
        this.ag$a = Boolean.valueOf(readableMap.hasKey("fileCache") ? readableMap.getBoolean("fileCache") : false);
        this.HaptikWebView = readableMap.hasKey(ClientCookie.PATH_ATTR) ? readableMap.getString(ClientCookie.PATH_ATTR) : null;
        this.toString = readableMap.hasKey("appendExt") ? readableMap.getString("appendExt") : "";
        this.HaptikSDK$e = Boolean.valueOf(readableMap.hasKey("trusty") ? readableMap.getBoolean("trusty") : false);
        this.HaptikSDK$d = Boolean.valueOf(readableMap.hasKey("wifiOnly") ? readableMap.getBoolean("wifiOnly") : false);
        if (readableMap.hasKey("addAndroidDownloads")) {
            this.valueOf = readableMap.getMap("addAndroidDownloads");
        }
        if (readableMap.hasKey("binaryContentTypes")) {
            this.ah$a = readableMap.getArray("binaryContentTypes");
        }
        String str = this.HaptikWebView;
        if (str != null && str.toLowerCase().contains("?append=true")) {
            this.HaptikSDK$c = false;
        }
        if (readableMap.hasKey("overwrite")) {
            this.HaptikSDK$c = Boolean.valueOf(readableMap.getBoolean("overwrite"));
        }
        if (readableMap.hasKey("followRedirect")) {
            this.ah$b = Boolean.valueOf(readableMap.getBoolean("followRedirect"));
        }
        this.HaptikSDK$b = readableMap.hasKey(StringSet.key) ? readableMap.getString(StringSet.key) : null;
        this.HaptikSDK$a = readableMap.hasKey("contentType") ? readableMap.getString("contentType") : null;
        this.invoke = Boolean.valueOf(readableMap.hasKey("increment") ? readableMap.getBoolean("increment") : false);
        this.values = Boolean.valueOf(readableMap.hasKey("auto") ? readableMap.getBoolean("auto") : false);
        if (readableMap.hasKey("timeout")) {
            this.getSignupData = readableMap.getInt("timeout");
        }
    }
}
