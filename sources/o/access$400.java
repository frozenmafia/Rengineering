package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.mikhaellopez.circularimageview.CircularImageView;
/* loaded from: classes2.dex */
public abstract class access$400 extends androidx.databinding.ViewDataBinding {
    public final LinearLayout ag$a;
    @androidx.databinding.Bindable
    protected ChatMessageVM toString;
    public final CircularImageView valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public access$400(Object obj, View view, int i, LinearLayout linearLayout, CircularImageView circularImageView, CustomTextView customTextView) {
        super(obj, view, i);
        this.ag$a = linearLayout;
        this.valueOf = circularImageView;
        this.values = customTextView;
    }
}
