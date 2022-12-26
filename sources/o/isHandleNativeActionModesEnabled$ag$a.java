package o;

import com.app.dream11.contest.ContestItemVM;
import java.util.List;
/* loaded from: classes.dex */
public final class isHandleNativeActionModesEnabled$ag$a {
    private final List<ContestItemVM> ah$a;
    private final m<ContestItemVM> valueOf;

    /* JADX WARN: Multi-variable type inference failed */
    public isHandleNativeActionModesEnabled$ag$a(List<? extends ContestItemVM> list, m<ContestItemVM> mVar) {
        runAnimators.ag$a(list, "contestList");
        runAnimators.ag$a(mVar, "itemBinding");
        this.ah$a = list;
        this.valueOf = mVar;
    }

    public final m<ContestItemVM> ah$a() {
        return this.valueOf;
    }

    public final List<ContestItemVM> values() {
        return this.ah$a;
    }
}
