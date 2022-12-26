package o;

import android.view.View;
import com.app.dream11.chat.groups.GroupsBottomSheetVM;
/* loaded from: classes3.dex */
public abstract class setCollapseIcon extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected GroupsBottomSheetVM ah$a;
    public final androidx.constraintlayout.widget.Guideline values;

    public abstract void toString(GroupsBottomSheetVM groupsBottomSheetVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public setCollapseIcon(Object obj, View view, int i, androidx.constraintlayout.widget.Guideline guideline) {
        super(obj, view, i);
        this.values = guideline;
    }
}
