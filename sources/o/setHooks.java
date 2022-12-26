package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class setHooks extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    public final DreamRecyclerView ah$a;
    @androidx.databinding.Bindable
    protected configureMenuItem toString;
    public final ImageView valueOf;
    public final View values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setHooks(Object obj, View view, int i, ImageView imageView, View view2, ImageView imageView2, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.values = view2;
        this.valueOf = imageView2;
        this.ah$a = dreamRecyclerView;
    }
}
