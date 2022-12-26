package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.app.dream11.social.pendingrequest.PendingRequestIconComponent;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class parseBundleExtra extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected setContentInfo HaptikSDK$c;
    public final ImageView ag$a;
    public final ImageView ah$a;
    public final RelativeLayout ah$b;
    public final CustomTextView invoke;
    public final CustomTextView toString;
    public final PendingRequestIconComponent valueOf;
    public final LinearLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public parseBundleExtra(Object obj, View view, int i, ImageView imageView, PendingRequestIconComponent pendingRequestIconComponent, ImageView imageView2, LinearLayout linearLayout, CustomTextView customTextView, CustomTextView customTextView2, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.valueOf = pendingRequestIconComponent;
        this.ah$a = imageView2;
        this.values = linearLayout;
        this.toString = customTextView;
        this.invoke = customTextView2;
        this.ah$b = relativeLayout;
    }
}
