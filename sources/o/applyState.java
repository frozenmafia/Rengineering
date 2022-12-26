package o;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class applyState {
    public static final applyState valueOf = new applyState();

    private applyState() {
    }

    public static final JSONObject toString(ShareOpenGraphAction shareOpenGraphAction, applyState$ag$a applystate_ag_a) throws JSONException {
        if (shareOpenGraphAction == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.valueOf()) {
            jSONObject.put(str, ah$a(shareOpenGraphAction.values(str), applystate_ag_a));
        }
        return jSONObject;
    }

    private final JSONObject toString(ShareOpenGraphObject shareOpenGraphObject, applyState$ag$a applystate_ag_a) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphObject.valueOf()) {
            jSONObject.put(str, ah$a(shareOpenGraphObject.values(str), applystate_ag_a));
        }
        return jSONObject;
    }

    private final JSONArray toString(List<?> list, applyState$ag$a applystate_ag_a) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(ah$a(it.next(), applystate_ag_a));
        }
        return jSONArray;
    }

    public static final Object ah$a(Object obj, applyState$ag$a applystate_ag_a) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (applystate_ag_a == null) {
                return null;
            }
            return applystate_ag_a.valueOf((SharePhoto) obj);
        } else if (obj instanceof ShareOpenGraphObject) {
            return valueOf.toString((ShareOpenGraphObject) obj, applystate_ag_a);
        } else {
            if (obj instanceof List) {
                return valueOf.toString((List) obj, applystate_ag_a);
            }
            return null;
        }
    }
}
