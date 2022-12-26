package o;

import java.util.List;
import o.RecyclerView;
/* loaded from: classes7.dex */
public abstract class isItemRemoved {
    public abstract String ah$a();

    public abstract List<String> values();

    public static isItemRemoved ag$a(String str, List<String> list) {
        return new RecyclerView.LayoutManager.LayoutPrefetchRegistry(str, list);
    }
}
