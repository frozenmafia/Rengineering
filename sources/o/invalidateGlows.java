package o;

import o.isAccessibilityEnabled;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class invalidateGlows implements isComputingLayout {
    @Override // o.isComputingLayout
    public isAccessibilityEnabled ah$a(hasUpdatedView hasupdatedview, JSONObject jSONObject) {
        return ag$a(hasupdatedview);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static isAccessibilityEnabled ag$a(hasUpdatedView hasupdatedview) {
        return new isAccessibilityEnabled(hasupdatedview.values() + 3600000, new isAccessibilityEnabled$ag$a(8, 4), new isAccessibilityEnabled.values(true, false), 0, 3600, 10.0d, 1.2d, 60);
    }
}
