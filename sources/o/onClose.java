package o;

import android.view.View;
import android.widget.RelativeLayout;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class onClose extends androidx.databinding.ViewDataBinding {
    public final RelativeLayout HaptikSDK$b;
    public final DreamRecyclerView ag$a;
    public final View ah$a;
    public final D11ErrorFrameLayout toString;
    @androidx.databinding.Bindable
    protected addHorizontalWrapMinVariable valueOf;
    public final androidx.appcompat.widget.AppCompatImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onClose(Object obj, View view, int i, View view2, D11ErrorFrameLayout d11ErrorFrameLayout, DreamRecyclerView dreamRecyclerView, androidx.appcompat.widget.AppCompatImageView appCompatImageView, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.ah$a = view2;
        this.toString = d11ErrorFrameLayout;
        this.ag$a = dreamRecyclerView;
        this.values = appCompatImageView;
        this.HaptikSDK$b = relativeLayout;
    }
}
