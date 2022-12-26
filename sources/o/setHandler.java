package o;

import androidx.work.WorkManager;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class setHandler {
    public static boolean ah$a = false;
    public static getIControllerCallback toString;
    public static WorkManager values;

    public static void ag$a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(toString.values(com.apxor.androidsdk.core.Constants.EVENTS_TABLE));
            jSONArray.put(str);
            toString.ah$a(com.apxor.androidsdk.core.Constants.EVENTS_TABLE, jSONArray.toString());
        } catch (JSONException e) {
            WindowMetricsCalculatorDecorator.valueOf(e, "RecordManager:addEvent failed for event: %s", str);
            toString.ag$a(com.apxor.androidsdk.core.Constants.EVENTS_TABLE);
        }
    }

    public static String values(String str) {
        return toString.values(str);
    }

    public static void toString(String str, String str2) {
        toString.ah$a(str, str2);
    }
}
