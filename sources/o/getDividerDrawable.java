package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import o.NotificationCompat;
/* loaded from: classes2.dex */
public abstract class getDividerDrawable extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$a;
    public final CustomTextView HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final CustomTextView HaptikSDK$e;
    public final ProgressBar ag$a;
    public final DreamRecyclerView ah$a;
    public final CustomTextView ah$b;
    public final CustomTextView invoke;
    public final ImageView toString;
    @androidx.databinding.Bindable
    protected NotificationCompat.Style valueOf;
    public final androidx.coordinatorlayout.widget.CoordinatorLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getDividerDrawable(Object obj, View view, int i, ImageView imageView, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, ProgressBar progressBar, DreamRecyclerView dreamRecyclerView, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5, CustomTextView customTextView6) {
        super(obj, view, i);
        this.toString = imageView;
        this.values = coordinatorLayout;
        this.ag$a = progressBar;
        this.ah$a = dreamRecyclerView;
        this.invoke = customTextView;
        this.ah$b = customTextView2;
        this.HaptikSDK$c = customTextView3;
        this.HaptikSDK$b = customTextView4;
        this.HaptikSDK$a = customTextView5;
        this.HaptikSDK$e = customTextView6;
    }
}
