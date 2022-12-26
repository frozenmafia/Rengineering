package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class getDividerWidth extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView ag$a;
    public final ImageView ah$a;
    public final View ah$b;
    public final D11TextView toString;
    @androidx.databinding.Bindable
    protected addKeys valueOf;
    public final androidx.appcompat.widget.LinearLayoutCompat values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getDividerWidth(Object obj, View view, int i, ImageView imageView, androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView, View view2) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.values = linearLayoutCompat;
        this.ag$a = dreamRecyclerView;
        this.toString = d11TextView;
        this.ah$b = view2;
    }
}
