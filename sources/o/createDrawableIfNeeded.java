package o;

import android.view.View;
import android.widget.RelativeLayout;
import com.app.dream11.ui.CustomTextView;
import o.AppCompatActivity;
/* loaded from: classes2.dex */
public abstract class createDrawableIfNeeded extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected AppCompatActivity.AnonymousClass2 ag$a;
    public final CustomTextView ah$a;
    public final CustomTextView toString;
    public final RelativeLayout valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public createDrawableIfNeeded(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.toString = customTextView;
        this.ah$a = customTextView2;
        this.valueOf = relativeLayout;
    }
}
