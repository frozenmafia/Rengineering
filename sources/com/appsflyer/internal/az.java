package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class az {
    public static Map<String, Object> AFInAppEventType(Context context) throws ay {
        String string = ah.values(context).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return valueOf(string);
        }
        throw new ay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> valueOf(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("is_cache")) {
                    hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.values(e.getMessage(), e);
            return null;
        }
    }
}
