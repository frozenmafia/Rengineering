package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.app.dream11.ui.CustomEditTextView;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.button.SecondaryButton;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class toLocalMotionEvent extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    @androidx.databinding.Bindable
    protected removeAllHelper HaptikSDK$c;
    public final SecondaryButton ag$a;
    public final CustomEditTextView ah$a;
    public final RelativeLayout ah$b;
    public final ImageView invoke;
    public final ImageView toString;
    public final ImageView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public toLocalMotionEvent(Object obj, View view, int i, SecondaryButton secondaryButton, CustomEditTextView customEditTextView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView) {
        super(obj, view, i);
        this.ag$a = secondaryButton;
        this.ah$a = customEditTextView;
        this.values = imageView;
        this.valueOf = imageView2;
        this.toString = imageView3;
        this.invoke = imageView4;
        this.ah$b = relativeLayout;
        this.HaptikSDK$a = dreamRecyclerView;
        this.HaptikSDK$b = d11TextView;
    }
}
