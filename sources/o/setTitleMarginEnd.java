package o;

import android.view.View;
import com.app.dream11.chat.groups.GroupsEntryVM;
import com.app.dream11.core.ui.ExpandableLinearLayout;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class setTitleMarginEnd extends androidx.databinding.ViewDataBinding {
    public final CircularImageView ag$a;
    @androidx.databinding.Bindable
    protected GroupsEntryVM ah$a;
    public final D11TextView toString;
    public final ExpandableLinearLayout valueOf;
    public final CircularImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setTitleMarginEnd(Object obj, View view, int i, ExpandableLinearLayout expandableLinearLayout, CircularImageView circularImageView, CircularImageView circularImageView2, D11TextView d11TextView) {
        super(obj, view, i);
        this.valueOf = expandableLinearLayout;
        this.values = circularImageView;
        this.ag$a = circularImageView2;
        this.toString = d11TextView;
    }
}
