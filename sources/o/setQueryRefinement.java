package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.social.model.EmptyStateVm;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setQueryRefinement extends androidx.databinding.ViewDataBinding {
    public final LinearLayout ag$a;
    @androidx.databinding.Bindable
    protected EmptyStateVm ah$a;
    public final ImageView valueOf;
    public final D11TextView values;

    public abstract void ah$a(EmptyStateVm emptyStateVm);

    /* JADX INFO: Access modifiers changed from: protected */
    public setQueryRefinement(Object obj, View view, int i, ImageView imageView, D11TextView d11TextView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.values = d11TextView;
        this.ag$a = linearLayout;
    }
}
