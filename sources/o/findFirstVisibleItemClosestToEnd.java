package o;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class findFirstVisibleItemClosestToEnd {
    private final quickRecycleScrapView<collectAdjacentPrefetchPositions> ag$a;
    private final Map<String, String> values = Collections.synchronizedMap(new HashMap());

    public findFirstVisibleItemClosestToEnd(quickRecycleScrapView<collectAdjacentPrefetchPositions> quickrecyclescrapview) {
        this.ag$a = quickrecyclescrapview;
    }

    public void valueOf(String str, getNextSpan getnextspan) {
        JSONObject optJSONObject;
        collectAdjacentPrefetchPositions ag$a = this.ag$a.ag$a();
        if (ag$a == null) {
            return;
        }
        JSONObject HaptikSDK$a = getnextspan.HaptikSDK$a();
        if (HaptikSDK$a.length() < 1) {
            return;
        }
        JSONObject values = getnextspan.values();
        if (values.length() >= 1 && (optJSONObject = HaptikSDK$a.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.values) {
                if (optString.equals(this.values.get(str))) {
                    return;
                }
                this.values.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", values.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString("group", optJSONObject.optString("group"));
                ag$a.values("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                ag$a.values("fp", "_fpc", bundle2);
            }
        }
    }
}
