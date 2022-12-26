package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class AppCompatButton extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    public final CustomTextView ah$a;
    @androidx.databinding.Bindable
    protected setData toString;
    public final CustomTextView valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatButton(Object obj, View view, int i, ImageView imageView, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.ah$a = customTextView;
        this.valueOf = customTextView2;
    }
}
