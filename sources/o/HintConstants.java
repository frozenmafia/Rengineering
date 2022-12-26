package o;

import android.view.View;
import com.app.dream11.model.viewmodel.LeaderboardRoundViewItem;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class HintConstants extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    @androidx.databinding.Bindable
    protected createConstraintWidget$ag$a ah$a;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    @androidx.databinding.Bindable
    protected LeaderboardRoundViewItem values;

    /* JADX INFO: Access modifiers changed from: protected */
    public HintConstants(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.toString = customTextView;
        this.ag$a = customTextView2;
        this.valueOf = customTextView3;
    }
}
