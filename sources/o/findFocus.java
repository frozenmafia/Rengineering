package o;

import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class findFocus extends getLabeledBy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public findFocus(Map<String, ? extends setAction<? extends Object>> map) {
        super(map);
        runAnimators.ag$a(map, "keys");
    }

    @Override // o.getLabeledBy
    public List<setAction<? extends Object>> values() {
        setAction<? extends Object> setaction = ag$a().get("PT_TITLE");
        runAnimators.toString(setaction);
        setAction<? extends Object> setaction2 = ag$a().get("PT_MSG");
        runAnimators.toString(setaction2);
        return reserveEndViewTransition.valueOf(setaction, setaction2);
    }
}
