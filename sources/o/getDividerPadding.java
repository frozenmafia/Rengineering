package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class getDividerPadding extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final CustomTextView ah$a;
    public final ScrollView ah$b;
    @androidx.databinding.Bindable
    protected inferRelativeBeginPosition toString;
    public final ImageView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getDividerPadding(Object obj, View view, int i, CustomTextView customTextView, ImageView imageView, ImageView imageView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ScrollView scrollView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ah$a = customTextView;
        this.valueOf = imageView;
        this.values = imageView2;
        this.ag$a = constraintLayout;
        this.ah$b = scrollView;
        this.HaptikSDK$a = customTextView2;
    }
}
