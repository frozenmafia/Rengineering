package o;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
/* loaded from: classes3.dex */
public final class setHorizontalDimension extends DiffUtil.Callback {
    private final List<setMinWidth> ag$a;
    private final List<setMinWidth> values;

    public setHorizontalDimension(List<setMinWidth> list, List<setMinWidth> list2) {
        runAnimators.ag$a(list, "oldPlayers");
        runAnimators.ag$a(list2, "newPlayers");
        this.values = list;
        this.ag$a = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i, int i2) {
        return this.values.get(i).HaptikSDK$b().getId() == this.ag$a.get(i2).HaptikSDK$b().getId();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.values.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.ag$a.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i, int i2) {
        return runAnimators.values(this.values.get(i), this.ag$a.get(i2));
    }
}
