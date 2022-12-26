package o;

import android.view.View;
import com.app.dream11.model.PlayerPointsDetailItem;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class startAnimation extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected PlayerPointsDetailItem ag$a;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public startAnimation(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.valueOf = customTextView;
        this.toString = customTextView2;
        this.values = customTextView3;
    }
}
