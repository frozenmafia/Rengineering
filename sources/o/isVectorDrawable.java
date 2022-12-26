package o;

import android.view.View;
import com.app.dream11.ui.DreamRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import o.ActivityResultContracts;
/* loaded from: classes2.dex */
public abstract class isVectorDrawable extends androidx.databinding.ViewDataBinding {
    public final androidx.appcompat.widget.Toolbar ag$a;
    public final AppBarLayout ah$a;
    public final androidx.coordinatorlayout.widget.CoordinatorLayout toString;
    @androidx.databinding.Bindable
    protected ActivityResultContracts.OpenMultipleDocuments valueOf;
    public final DreamRecyclerView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public isVectorDrawable(Object obj, View view, int i, AppBarLayout appBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, DreamRecyclerView dreamRecyclerView, androidx.appcompat.widget.Toolbar toolbar) {
        super(obj, view, i);
        this.ah$a = appBarLayout;
        this.toString = coordinatorLayout;
        this.values = dreamRecyclerView;
        this.ag$a = toolbar;
    }
}
