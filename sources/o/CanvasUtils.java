package o;

import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import irjuc.irjuc.cqqlq.irjuc.rmqfk.gcmjh;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public class CanvasUtils {
    public String ag$a;
    public List<gcmjh> values;

    public static CanvasUtils ah$a(String str, jmjou jmjouVar) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        CanvasUtils canvasUtils = new CanvasUtils();
        ArrayList arrayList = new ArrayList();
        canvasUtils.ag$a = beginAsyncSectionFallback.toString(jSONObject, "url", false, false);
        JSONArray valueOf = beginAsyncSectionFallback.valueOf(jSONObject, "params", false, false);
        if (valueOf != null && valueOf.length() > 0) {
            for (int i = 0; i < valueOf.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) AutoTransition.get(valueOf, i);
                if (jSONObject2 != null) {
                    arrayList.add(AutoTransition.fromJsonString(jSONObject2.toString(), jmjouVar, gcmjh.class));
                }
            }
        }
        canvasUtils.values = arrayList;
        return canvasUtils;
    }
}
