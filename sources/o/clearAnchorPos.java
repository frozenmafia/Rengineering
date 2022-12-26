package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class clearAnchorPos extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final ImageView ag$a;
    public final CustomTextView ah$a;
    public final CustomTextView invoke;
    public final CustomTextView toString;
    @androidx.databinding.Bindable
    protected getFileForUri valueOf;
    public final androidx.constraintlayout.widget.Barrier values;

    public abstract void ag$a(getFileForUri getfileforuri);

    /* JADX INFO: Access modifiers changed from: protected */
    public clearAnchorPos(Object obj, View view, int i, androidx.constraintlayout.widget.Barrier barrier, ImageView imageView, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5) {
        super(obj, view, i);
        this.values = barrier;
        this.ag$a = imageView;
        this.ah$a = customTextView;
        this.toString = customTextView2;
        this.invoke = customTextView3;
        this.HaptikSDK$c = customTextView4;
        this.HaptikSDK$b = customTextView5;
    }
}
