package o;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public class isLayoutFrozen {
    private final hasUpdatedView ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public isLayoutFrozen(hasUpdatedView hasupdatedview) {
        this.ag$a = hasupdatedview;
    }

    public isAccessibilityEnabled valueOf(JSONObject jSONObject) throws JSONException {
        return ag$a(jSONObject.getInt("settings_version")).ah$a(this.ag$a, jSONObject);
    }

    private static isComputingLayout ag$a(int i) {
        createScroller createscroller;
        if (i != 3) {
            createscroller = createScroller.valueOf;
            createscroller.toString("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
            return new invalidateGlows();
        }
        return new markItemDecorInsetsDirty();
    }
}
