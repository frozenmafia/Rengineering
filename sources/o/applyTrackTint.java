package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.app.dream11.chat.groups.GroupsBottomSheetVM;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class applyTrackTint extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView HaptikSDK$b;
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected GroupsBottomSheetVM ah$a;
    public final D11TextView toString;
    public final View valueOf;
    public final RelativeLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public applyTrackTint(Object obj, View view, int i, D11TextView d11TextView, ImageView imageView, RelativeLayout relativeLayout, View view2, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.toString = d11TextView;
        this.ag$a = imageView;
        this.values = relativeLayout;
        this.valueOf = view2;
        this.HaptikSDK$b = dreamRecyclerView;
    }
}
