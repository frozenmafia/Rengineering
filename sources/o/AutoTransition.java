package o;

import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import irjuc.irjuc.cqqlq.irjuc.zihjx.krrvc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public abstract class AutoTransition implements handleException {
    public static final String TAG = "AbstractJson";

    public static <T extends handleException> T fromJsonString(String str, jmjou jmjouVar, Class<T> cls) {
        if (jmjouVar == null) {
            beginAsyncSectionFallback.ah$a(TAG, String.format("{%s} is null or empty", "objectFactory"));
            return null;
        } else if (str == null || str.length() == 0) {
            beginAsyncSectionFallback.ah$a(TAG, String.format("{%s} is null or empty", "jsonString"));
            return null;
        } else {
            try {
                jmjou.chmha chmhaVar = (jmjou.chmha) jmjouVar.values(jmjou.chmha.class);
                chmhaVar.put(TAG, new JSONObject(str));
                return (T) jmjouVar.toString(cls, chmhaVar);
            } catch (JSONException e) {
                beginAsyncSectionFallback.ah$a(TAG, String.format("JSONException with msg = {%s} for the key {%s}", e.getMessage(), str));
                return (T) jmjouVar.values(cls);
            }
        }
    }

    public static <T> T get(JSONArray jSONArray, int i) {
        try {
            return (T) jSONArray.get(i);
        } catch (JSONException e) {
            beginAsyncSectionFallback.ah$a(TAG, String.format("JSONException with msg = {%s} for the key {%s}", e.getMessage(), Integer.valueOf(i)));
            return null;
        }
    }

    public static <T> T get(JSONObject jSONObject, String str) {
        try {
            return (T) jSONObject.get(str);
        } catch (JSONException e) {
            beginAsyncSectionFallback.ah$a(TAG, String.format("JSONException with msg = {%s} for the key {%s}", e.getMessage(), str));
            return null;
        }
    }

    public static <T> void put(JSONObject jSONObject, jmjou jmjouVar, String str, T t) {
        if (beginAsyncSectionFallback.toString(jSONObject, TAG, "jsonObject")) {
            jmjouVar.valueOf().ah$a(TAG, "json object should not be null", krrvc.irjuc.LOW);
        }
        try {
            jSONObject.put(str, t);
        } catch (JSONException e) {
            beginAsyncSectionFallback.ah$a(TAG, String.format("JSONException with msg = {%s} for the key {%s}", e.getMessage(), str));
        }
    }

    public <T> T get(String str) {
        return (T) get(getJsonObject(), str);
    }

    public abstract JSONObject getJsonObject();

    public abstract jmjou getObjectFactory();

    public boolean has(String str) {
        return getJsonObject().has(str);
    }

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return false;
    }

    public <T> void put(String str, T t) {
        put(getJsonObject(), getObjectFactory(), str, t);
    }

    public String toJsonString() {
        if (beginAsyncSectionFallback.toString(getJsonObject(), TAG, "jsonObject")) {
            getObjectFactory().valueOf().ah$a(TAG, "json object should not be null", krrvc.irjuc.LOW);
        }
        return getJsonObject().toString();
    }
}
