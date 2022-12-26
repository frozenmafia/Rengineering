package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class shouldBeUsed extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected onAttachedToLayoutParams ah$a;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    @androidx.databinding.Bindable
    protected Boolean values;

    public abstract void toString(Boolean bool);

    public abstract void values(onAttachedToLayoutParams onattachedtolayoutparams);

    /* JADX INFO: Access modifiers changed from: protected */
    public shouldBeUsed(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, ImageView imageView) {
        super(obj, view, i);
        this.valueOf = customTextView;
        this.toString = customTextView2;
        this.ag$a = imageView;
    }
}
