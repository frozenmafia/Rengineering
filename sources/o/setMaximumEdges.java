package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class setMaximumEdges implements cancelTargetTouch {
    @Override // o.cancelTargetTouch
    public String ag$a(Map<String, Object> map) {
        try {
            return new JSONObject(map).toString();
        } catch (Exception e) {
            Log.e("SimpleJsonInterface", "Failed to encode json object: " + e.toString());
            return null;
        }
    }

    @Override // o.cancelTargetTouch
    public Map<String, Object> toString(String str) {
        try {
            return ah$a(new JSONObject(str));
        } catch (Exception e) {
            Log.e("SimpleJsonInterface", "Failed to decode json object: " + e.toString());
            return null;
        }
    }

    public static Map<String, Object> ah$a(JSONObject jSONObject) throws JSONException {
        return jSONObject != JSONObject.NULL ? ag$a(jSONObject) : new HashMap();
    }

    public static Map<String, Object> ag$a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = toString((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = ag$a((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static List<Object> toString(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = toString((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = ag$a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
