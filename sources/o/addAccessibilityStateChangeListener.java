package o;

import o.AccessibilityEventCompat;
import org.json.JSONArray;
/* loaded from: classes3.dex */
public final class addAccessibilityStateChangeListener extends AccessibilityEventCompat.ContentChangeType<JSONArray> {
    private final JSONArray toString;
    private String valueOf;
    private int values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addAccessibilityStateChangeListener(JSONArray jSONArray, int i, String str) {
        super(jSONArray, i, str);
        runAnimators.ag$a(str, "errorMsg");
        this.toString = jSONArray;
        this.values = i;
        this.valueOf = str;
    }

    @Override // o.setAction
    public boolean ag$a() {
        boolean z = this.toString == null;
        if (z) {
            asRecord.valueOf(this.valueOf + ". Not showing notification");
        }
        return !z;
    }
}
