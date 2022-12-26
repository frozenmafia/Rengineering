package o;

import android.view.View;
import com.app.dream11.contest.TeamCompareItemVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class setWeightSum extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected TeamCompareItemVM toString;
    public final CustomTextView values;

    public abstract void values(TeamCompareItemVM teamCompareItemVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public setWeightSum(Object obj, View view, int i, CustomTextView customTextView) {
        super(obj, view, i);
        this.values = customTextView;
    }
}
