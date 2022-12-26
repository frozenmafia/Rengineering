package o;

import android.view.View;
import com.app.dream11.contest.FilterConstants;
/* loaded from: classes2.dex */
public abstract class obtainAttributes extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected FilterConstants.toString ag$a;
    @androidx.databinding.Bindable
    protected Boolean ah$a;
    @androidx.databinding.Bindable
    protected View.OnClickListener valueOf;

    public abstract void ag$a(Boolean bool);

    public abstract void ah$a(View.OnClickListener onClickListener);

    public abstract void values(FilterConstants.toString tostring);

    /* JADX INFO: Access modifiers changed from: protected */
    public obtainAttributes(Object obj, View view, int i) {
        super(obj, view, i);
    }
}
