package o;

import androidx.recyclerview.widget.DiffUtil;
import com.appsamurai.storyly.storylypresenter.e;
import com.appsamurai.storyly.storylypresenter.e$ag$a;
import java.util.List;
/* loaded from: classes3.dex */
public final class physicalSizeEquals extends DiffUtil.Callback {
    public final /* synthetic */ List<getFontFamily> ag$a;
    public final /* synthetic */ List<getFontFamily> ah$a;
    public final /* synthetic */ e.toString valueOf;

    public physicalSizeEquals(List<getFontFamily> list, List<getFontFamily> list2, e.toString tostring) {
        this.ag$a = list;
        this.ah$a = list2;
        this.valueOf = tostring;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i, int i2) {
        getFontFamily getfontfamily = this.ag$a.get(i);
        getFontFamily getfontfamily2 = this.ah$a.get(i2);
        e$ag$a e_ag_a = (e$ag$a) this.valueOf;
        e_ag_a.getClass();
        runAnimators.ag$a(e_ag_a, "this");
        return runAnimators.values((Object) (getfontfamily == null ? null : getfontfamily.toString), (Object) (getfontfamily2 != null ? getfontfamily2.toString : null));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i, int i2) {
        getFontFamily getfontfamily = this.ag$a.get(i);
        String str = getfontfamily == null ? null : getfontfamily.toString;
        getFontFamily getfontfamily2 = this.ah$a.get(i2);
        return runAnimators.values((Object) str, (Object) (getfontfamily2 != null ? getfontfamily2.toString : null));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.ah$a.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.ag$a.size();
    }
}
