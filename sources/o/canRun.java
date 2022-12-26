package o;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Request;
/* loaded from: classes4.dex */
public class canRun {
    private final access$enqueue HaptikSDK$b;
    private String HaptikSDK$c;
    private final String valueOf = "deviceId";
    private final String values = "X-Manufacturer";
    private final String toString = "X-Resolution";
    private final String ah$a = "X-OS-Version";
    private final String ag$a = "apiKey";
    private String ah$b = "Authorization";

    public canRun(access$enqueue access_enqueue, String str) {
        this.HaptikSDK$c = "";
        this.HaptikSDK$b = access_enqueue;
        this.HaptikSDK$c = str;
    }

    public Request.Builder values(Request.Builder builder) {
        for (Map.Entry<String, String> entry : ag$a().entrySet()) {
            if (entry.getValue() != null) {
                builder.header(entry.getKey(), entry.getValue().trim());
            } else {
                Log.e("HttpHeaders", "Entry value null for key " + entry.getKey());
            }
        }
        for (Map.Entry<String, String> entry2 : values().entrySet()) {
            if (entry2.getValue() != null) {
                builder.header(entry2.getKey(), entry2.getValue().trim());
            } else {
                Log.e("HttpHeaders", "Entry value null for key " + entry2.getKey());
            }
        }
        android.util.Pair<String, String> ah$a = ah$a();
        if (ah$a != null && ah$a.second != null && ah$a.first != null) {
            builder.addHeader((String) ah$a.first, (String) ah$a.second);
        }
        return builder;
    }

    public Map<String, String> ag$a() {
        HashMap hashMap = new HashMap();
        hashMap.put("deviceId", this.HaptikSDK$b.ah$a());
        hashMap.put("X-Resolution", this.HaptikSDK$b.invoke());
        hashMap.put("X-Manufacturer", this.HaptikSDK$b.values());
        hashMap.put("X-OS-Version", this.HaptikSDK$b.ah$b());
        return hashMap;
    }

    public Map<String, String> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("apiKey", this.HaptikSDK$c);
        return hashMap;
    }

    public android.util.Pair<String, String> ah$a() {
        String ag$a = this.HaptikSDK$b.ag$a().valueOf().ag$a("access_token", "");
        if (!ag$a.isEmpty()) {
            String str = this.ah$b;
            return new android.util.Pair<>(str, "Bearer " + ag$a);
        }
        return new android.util.Pair<>(this.ah$b, null);
    }
}
