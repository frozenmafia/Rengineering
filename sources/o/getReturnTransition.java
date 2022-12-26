package o;

import com.facebook.appevents.codeless.internal.PathComponent;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class getReturnTransition {
    public static final getReturnTransition$ah$a ah$a = new getReturnTransition$ah$a(null);
    private final String ag$a;
    private final String toString;
    private final String valueOf;
    private final List<PathComponent> values;

    public getReturnTransition(JSONObject jSONObject) {
        runAnimators.ag$a(jSONObject, "component");
        String string = jSONObject.getString("name");
        runAnimators.ah$a(string, "component.getString(PARAMETER_NAME_KEY)");
        this.toString = string;
        String optString = jSONObject.optString("value");
        runAnimators.ah$a(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.valueOf = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        runAnimators.ah$a(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.ag$a = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(ClientCookie.PATH_ATTR);
        if (optJSONArray != null) {
            int i = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    runAnimators.ah$a(jSONObject2, "jsonPathArray.getJSONObject(i)");
                    arrayList.add(new PathComponent(jSONObject2));
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        this.values = arrayList;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final String values() {
        return this.valueOf;
    }

    public final List<PathComponent> ag$a() {
        return this.values;
    }

    public final String ah$a() {
        return this.ag$a;
    }
}
