package o;

import android.os.Bundle;
import o.PagerSnapHelper;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public class addAnimatingView implements getOrientationHelper, PagerSnapHelper.AnonymousClass1 {
    private clearNestedRecyclerViewIfNotNested ah$a;

    @Override // o.getOrientationHelper
    public void valueOf(String str, Bundle bundle) {
        createScroller createscroller;
        clearNestedRecyclerViewIfNotNested clearnestedrecyclerviewifnotnested = this.ah$a;
        if (clearnestedrecyclerviewifnotnested != null) {
            try {
                clearnestedrecyclerviewifnotnested.ah$a("$A$:" + ag$a(str, bundle));
            } catch (JSONException unused) {
                createscroller = createScroller.valueOf;
                createscroller.values("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // o.PagerSnapHelper.AnonymousClass1
    public void ag$a(clearNestedRecyclerViewIfNotNested clearnestedrecyclerviewifnotnested) {
        createScroller createscroller;
        this.ah$a = clearnestedrecyclerviewifnotnested;
        createscroller = createScroller.valueOf;
        createscroller.ah$a("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    private static String ag$a(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }
}
