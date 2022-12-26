package o;

import android.util.Log;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class doAnimationFrame {
    public static final doAnimationFrame ag$a = new doAnimationFrame();
    private static HashMap<String, Boolean> valueOf = new HashMap<>();

    private doAnimationFrame() {
    }

    public final WritableNativeMap toString(JSONObject jSONObject) {
        runAnimators.ag$a(jSONObject, "$this$toWritableNativeMap");
        return ah$a(jSONObject);
    }

    private final WritableNativeMap ah$a(JSONObject jSONObject) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    writableNativeMap.putMap(next, ah$a((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeMap.putArray(next, ah$a((JSONArray) obj));
                } else if (obj instanceof Boolean) {
                    writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeMap.putInt(next, ((Number) obj).intValue());
                } else if (obj instanceof Double) {
                    writableNativeMap.putDouble(next, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeMap.putString(next, (String) obj);
                } else {
                    writableNativeMap.putString(next, obj.toString());
                }
            }
        } catch (JSONException e) {
            Log.e("error", "Failed to convert JSONObject to WritableMap: " + e.getMessage());
        }
        return writableNativeMap;
    }

    private final WritableNativeArray ah$a(JSONArray jSONArray) throws JSONException {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                writableNativeArray.pushMap(ah$a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeArray.pushArray(ah$a((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else {
                writableNativeArray.pushString(obj.toString());
            }
        }
        return writableNativeArray;
    }
}
