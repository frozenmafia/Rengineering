package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.mikhaellopez.circularimageview.CircularImageView;
/* loaded from: classes2.dex */
public abstract class measureChildForCells extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    @androidx.databinding.Bindable
    protected ChatMessageVM ah$a;
    public final LinearLayout toString;
    public final CircularImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public measureChildForCells(Object obj, View view, int i, LinearLayout linearLayout, CircularImageView circularImageView, CustomTextView customTextView) {
        super(obj, view, i);
        this.toString = linearLayout;
        this.values = circularImageView;
        this.ag$a = customTextView;
    }
}
