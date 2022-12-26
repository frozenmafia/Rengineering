package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.teamselection.createteamfilterbottomsheet.CreateTeamSortFilterBottomSheetVM;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class layoutChildLeft extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    @androidx.databinding.Bindable
    protected CreateTeamSortFilterBottomSheetVM ag$a;
    public final ImageView ah$a;
    public final D11TextView toString;
    public final DreamRecyclerView valueOf;
    public final View values;

    /* JADX INFO: Access modifiers changed from: protected */
    public layoutChildLeft(Object obj, View view, int i, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView, ImageView imageView, View view2, View view3) {
        super(obj, view, i);
        this.valueOf = dreamRecyclerView;
        this.toString = d11TextView;
        this.ah$a = imageView;
        this.values = view2;
        this.HaptikSDK$a = view3;
    }
}
