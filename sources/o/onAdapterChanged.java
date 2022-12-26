package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
/* loaded from: classes5.dex */
public class onAdapterChanged {
    public static String values(Map<String, Object> map) throws IOException {
        return ag$a(map);
    }

    public static String ag$a(Object obj) throws IOException {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e) {
                throw new IOException("Could not serialize number", e);
            }
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : com.facebook.hermes.intl.Constants.CASEFIRST_FALSE;
        } else {
            try {
                JSONStringer jSONStringer = new JSONStringer();
                values(obj, jSONStringer);
                return jSONStringer.toString();
            } catch (JSONException e2) {
                throw new IOException("Failed to serialize JSON", e2);
            }
        }
    }

    private static void values(Object obj, JSONStringer jSONStringer) throws IOException, JSONException {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                values(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
        } else if (obj instanceof Collection) {
            jSONStringer.array();
            for (Object obj2 : (Collection) obj) {
                values(obj2, jSONStringer);
            }
            jSONStringer.endArray();
        } else {
            jSONStringer.value(obj);
        }
    }

    public static Map<String, Object> ah$a(String str) throws IOException {
        try {
            return ah$a(new JSONObject(str));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static Object valueOf(String str) throws IOException {
        try {
            return ah$a(new JSONTokener(str).nextValue());
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    private static Map<String, Object> ah$a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, ah$a(jSONObject.get(next)));
        }
        return hashMap;
    }

    private static List<Object> values(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(ah$a(jSONArray.get(i)));
        }
        return arrayList;
    }

    private static Object ah$a(Object obj) throws JSONException {
        if (obj instanceof JSONObject) {
            return ah$a((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return values((JSONArray) obj);
        }
        if (obj.equals(JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
