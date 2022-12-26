package o;

import android.view.View;
import com.app.dream11.teampreviewnew.vms.PlayersOfTypeVM;
import com.app.dream11.ui.CustomFlexboxLayout;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class getLayoutResource extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected PlayersOfTypeVM ag$a;
    public final CustomFlexboxLayout ah$a;
    public final CustomTextView toString;

    /* JADX INFO: Access modifiers changed from: protected */
    public getLayoutResource(Object obj, View view, int i, CustomFlexboxLayout customFlexboxLayout, CustomTextView customTextView) {
        super(obj, view, i);
        this.ah$a = customFlexboxLayout;
        this.toString = customTextView;
    }
}
