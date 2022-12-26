package o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public class updateLayoutStateToFillStart {
    private final Map<String, updateLayoutStateToFillEnd> ah$a = new HashMap();
    private final Context toString;
    private final quickRecycleScrapView<collectAdjacentPrefetchPositions> valueOf;

    public updateLayoutStateToFillStart(Context context, quickRecycleScrapView<collectAdjacentPrefetchPositions> quickrecyclescrapview) {
        this.toString = context;
        this.valueOf = quickrecyclescrapview;
    }

    public updateLayoutStateToFillEnd valueOf(String str) {
        updateLayoutStateToFillEnd updatelayoutstatetofillend;
        synchronized (this) {
            if (!this.ah$a.containsKey(str)) {
                this.ah$a.put(str, values(str));
            }
            updatelayoutstatetofillend = this.ah$a.get(str);
        }
        return updatelayoutstatetofillend;
    }

    protected updateLayoutStateToFillEnd values(String str) {
        return new updateLayoutStateToFillEnd(this.toString, this.valueOf, str);
    }
}
