package o;

import android.view.View;
import android.widget.RelativeLayout;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes3.dex */
public abstract class addCustomViewsWithGravity extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView ah$a;
    public final RelativeLayout valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public addCustomViewsWithGravity(Object obj, View view, int i, RelativeLayout relativeLayout, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.valueOf = relativeLayout;
        this.ah$a = dreamRecyclerView;
    }
}
