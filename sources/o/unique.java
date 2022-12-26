package o;

import java.util.Iterator;
import o.IMultiInstanceInvalidationService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class unique {
    private final JSONObject valueOf = new JSONObject();
    private final JSONObject ag$a = new JSONObject();
    private final JSONObject toString = new JSONObject();

    public void valueOf(String str, Object obj) {
        ag$a(str, obj, false);
    }

    public void ag$a(String str, Object obj, boolean z) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (z) {
                this.valueOf.put(str, obj);
            } else {
                this.ag$a.put(str, obj);
            }
        } catch (JSONException e) {
            IMultiInstanceInvalidationService.Default.toString("device-fpts add: ", e);
            ag$a(str, e.toString());
        }
    }

    public void ag$a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.toString.put(str, obj);
        } catch (JSONException e) {
            IMultiInstanceInvalidationService.Default.toString("device-fpts addError: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int valueOf() {
        return this.valueOf.length() + 0 + this.ag$a.length() + this.toString.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject values(boolean z) {
        if (z) {
            return this.valueOf;
        }
        JSONObject jSONObject = new JSONObject();
        ag$a(jSONObject, this.valueOf);
        ag$a(jSONObject, this.ag$a);
        return jSONObject;
    }

    private void ag$a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.putOpt(next, jSONObject2.opt(next));
            } catch (JSONException e) {
                IMultiInstanceInvalidationService.Default.toString("device-fpts createJSONObject: ", e);
            }
        }
    }

    public JSONObject ah$a() {
        return this.toString;
    }

    public String toString() {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("cacheableAttributes", this.valueOf);
            jSONObject2.put("transientAttributes", this.ag$a);
            jSONObject2.put("error", this.toString);
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            return jSONArray.toString(4);
        } catch (JSONException e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in Fingerprints toString(): ", e);
            return "Fingerprints{cacheableAttributes=" + this.valueOf.toString() + ", transientAttributes=" + this.ag$a.toString() + ", error=" + this.toString.toString() + '}';
        }
    }
}
