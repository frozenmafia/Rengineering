package o;

import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class findAccessibilityNodeInfosByText extends getLabeledBy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public findAccessibilityNodeInfosByText(Map<String, ? extends setAction<? extends Object>> map) {
        super(map);
        runAnimators.ag$a(map, "keys");
    }

    @Override // o.getLabeledBy
    public List<setAction<? extends Object>> values() {
        setAction<? extends Object> setaction = ag$a().get("PT_BG");
        runAnimators.toString(setaction);
        return reserveEndViewTransition.ag$a(setaction);
    }
}
