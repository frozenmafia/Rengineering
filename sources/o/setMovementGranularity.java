package o;

import java.util.List;
import o.AccessibilityEventCompat;
/* loaded from: classes3.dex */
public final class setMovementGranularity extends AccessibilityEventCompat.ContentChangeType<List<? extends Object>> {
    private final List<Object> ag$a;
    private String ah$a;
    private int valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setMovementGranularity(List<? extends Object> list, int i, String str) {
        super(list, i, str);
        runAnimators.ag$a(str, "errorMsg");
        this.ag$a = list;
        this.valueOf = i;
        this.ah$a = str;
    }

    @Override // o.setAction
    public boolean ag$a() {
        List<Object> list = this.ag$a;
        boolean z = list == null || list.size() != this.valueOf;
        if (z) {
            asRecord.valueOf(this.ah$a + ". Not showing notification");
        }
        return !z;
    }
}
