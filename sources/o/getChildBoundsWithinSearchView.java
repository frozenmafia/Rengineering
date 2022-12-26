package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.ChatRequestCenterVM;
import com.app.dream11.newhome.CustomSwipeToRefresh;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class getChildBoundsWithinSearchView extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    @androidx.databinding.Bindable
    protected ChatRequestCenterVM ag$a;
    public final CustomSwipeToRefresh ah$a;
    public final androidx.constraintlayout.widget.ConstraintLayout toString;
    public final DreamRecyclerView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getChildBoundsWithinSearchView(Object obj, View view, int i, ImageView imageView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, CustomSwipeToRefresh customSwipeToRefresh, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView) {
        super(obj, view, i);
        this.values = imageView;
        this.toString = constraintLayout;
        this.ah$a = customSwipeToRefresh;
        this.valueOf = dreamRecyclerView;
        this.HaptikSDK$a = d11TextView;
    }
}
