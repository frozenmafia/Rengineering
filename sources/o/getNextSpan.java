package o;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class getNextSpan {
    private static final Date toString = new Date(0);
    private JSONObject HaptikSDK$a;
    private JSONArray ag$a;
    private Date ah$a;
    private JSONObject valueOf;
    private JSONObject values;

    private getNextSpan(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.valueOf = jSONObject;
        this.ah$a = date;
        this.ag$a = jSONArray;
        this.HaptikSDK$a = jSONObject2;
        this.values = jSONObject3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static getNextSpan toString(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new getNextSpan(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public JSONObject values() {
        return this.valueOf;
    }

    public Date HaptikSDK$c() {
        return this.ah$a;
    }

    public JSONArray ag$a() {
        return this.ag$a;
    }

    public JSONObject HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public String toString() {
        return this.values.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getNextSpan) {
            return this.values.toString().equals(((getNextSpan) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    /* loaded from: classes5.dex */
    public static class valueOf {
        private Date ag$a;
        private JSONArray toString;
        private JSONObject valueOf;
        private JSONObject values;

        private valueOf() {
            this.valueOf = new JSONObject();
            this.ag$a = getNextSpan.toString;
            this.toString = new JSONArray();
            this.values = new JSONObject();
        }

        public valueOf ah$a(Map<String, String> map) {
            this.valueOf = new JSONObject(map);
            return this;
        }

        public valueOf toString(JSONObject jSONObject) {
            try {
                this.valueOf = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public valueOf ah$a(Date date) {
            this.ag$a = date;
            return this;
        }

        public valueOf values(JSONArray jSONArray) {
            try {
                this.toString = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public valueOf valueOf(JSONObject jSONObject) {
            try {
                this.values = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public getNextSpan ag$a() throws JSONException {
            return new getNextSpan(this.valueOf, this.ag$a, this.toString, this.values);
        }
    }

    public static valueOf valueOf() {
        return new valueOf();
    }
}
