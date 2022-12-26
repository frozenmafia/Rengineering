package o;

import android.view.View;
import android.widget.RelativeLayout;
import com.app.dream11.chat.ui.GroupsEntryComponent;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class getThumbDrawable extends androidx.databinding.ViewDataBinding {
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout HaptikSDK$a;
    public final RelativeLayout ag$a;
    public final GroupsEntryComponent ah$a;
    @androidx.databinding.Bindable
    protected getPaint toString;
    public final DreamRecyclerView valueOf;
    public final D11ErrorFrameLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getThumbDrawable(Object obj, View view, int i, D11ErrorFrameLayout d11ErrorFrameLayout, GroupsEntryComponent groupsEntryComponent, DreamRecyclerView dreamRecyclerView, RelativeLayout relativeLayout, androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i);
        this.values = d11ErrorFrameLayout;
        this.ah$a = groupsEntryComponent;
        this.valueOf = dreamRecyclerView;
        this.ag$a = relativeLayout;
        this.HaptikSDK$a = swipeRefreshLayout;
    }
}
