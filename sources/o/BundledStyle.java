package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class BundledStyle extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ah$a;
    public final ImageView toString;
    @androidx.databinding.Bindable
    protected ensureMeasureRequested valueOf;
    public final CustomTextView values;

    /* loaded from: classes3.dex */
    public abstract class Builder extends androidx.databinding.ViewDataBinding {
        public final D11TextView ag$a;
        public final ImageView ah$a;
        public final D11TextView valueOf;
        @androidx.databinding.Bindable
        protected createObjectVariables values;

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder(Object obj, View view, int i, D11TextView d11TextView, ImageView imageView, D11TextView d11TextView2) {
            super(obj, view, i);
            this.valueOf = d11TextView;
            this.ah$a = imageView;
            this.ag$a = d11TextView2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BundledStyle(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, ImageView imageView) {
        super(obj, view, i);
        this.ah$a = customTextView;
        this.values = customTextView2;
        this.toString = imageView;
    }
}
