package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class getVirtualChildAt extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected createAlignedConstraints ag$a;
    public final D11TextView ah$a;
    public final DreamRecyclerView toString;
    public final ImageView valueOf;
    public final androidx.constraintlayout.widget.ConstraintLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getVirtualChildAt(Object obj, View view, int i, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ImageView imageView, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView) {
        super(obj, view, i);
        this.values = constraintLayout;
        this.valueOf = imageView;
        this.toString = dreamRecyclerView;
        this.ah$a = d11TextView;
    }
}
