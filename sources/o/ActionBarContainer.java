package o;

import android.view.LayoutInflater;
import android.view.View;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class ActionBarContainer extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    @androidx.databinding.Bindable
    protected isSmallerThan ah$a;
    public final androidx.cardview.widget.CardView toString;
    public final androidx.appcompat.widget.AppCompatImageView values;

    public abstract void toString(isSmallerThan issmallerthan);

    /* JADX INFO: Access modifiers changed from: protected */
    public ActionBarContainer(Object obj, View view, int i, androidx.appcompat.widget.AppCompatImageView appCompatImageView, androidx.cardview.widget.CardView cardView, D11TextView d11TextView) {
        super(obj, view, i);
        this.values = appCompatImageView;
        this.toString = cardView;
        this.ag$a = d11TextView;
    }

    @Deprecated
    public static ActionBarContainer valueOf(LayoutInflater layoutInflater, Object obj) {
        return (ActionBarContainer) androidx.databinding.ViewDataBinding.inflateInternal(layoutInflater, com.app.dream11Pro.R.layout.res_0x7f0d004d, null, false, obj);
    }
}
