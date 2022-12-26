package o;

import java.util.List;
import o.AccessibilityEventCompat;
/* loaded from: classes3.dex */
public final class addTouchExplorationStateChangeListener extends AccessibilityEventCompat.ContentChangeType<List<? extends Object>> {
    private String ah$a;
    private final List<Object> valueOf;
    private int values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addTouchExplorationStateChangeListener(List<? extends Object> list, int i, String str) {
        super(list, i, str);
        runAnimators.ag$a(str, "errorMsg");
        this.valueOf = list;
        this.values = i;
        this.ah$a = str;
    }

    @Override // o.setAction
    public boolean ag$a() {
        List<Object> list = this.valueOf;
        boolean z = list == null || list.size() < this.values;
        if (z) {
            asRecord.valueOf(this.ah$a + ". Not showing notification");
        }
        return !z;
    }
}
