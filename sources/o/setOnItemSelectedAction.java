package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class setOnItemSelectedAction extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    public final CircularImageView ah$a;
    public final CustomTextView ah$b;
    @androidx.databinding.Bindable
    protected createSubDecor toString;
    public final LinearLayout valueOf;
    public final CircularImageView values;

    public abstract void valueOf(createSubDecor createsubdecor);

    /* JADX INFO: Access modifiers changed from: protected */
    public setOnItemSelectedAction(Object obj, View view, int i, CustomTextView customTextView, CircularImageView circularImageView, CircularImageView circularImageView2, LinearLayout linearLayout, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ag$a = customTextView;
        this.ah$a = circularImageView;
        this.values = circularImageView2;
        this.valueOf = linearLayout;
        this.ah$b = customTextView2;
    }
}
