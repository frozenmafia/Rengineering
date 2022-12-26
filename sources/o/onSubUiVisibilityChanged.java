package o;

import android.view.View;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.mikhaellopez.circularimageview.CircularImageView;
/* loaded from: classes2.dex */
public abstract class onSubUiVisibilityChanged extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    public final CircularImageView ah$a;
    @androidx.databinding.Bindable
    protected ChatMessageVM toString;

    /* JADX INFO: Access modifiers changed from: protected */
    public onSubUiVisibilityChanged(Object obj, View view, int i, CircularImageView circularImageView, CustomTextView customTextView) {
        super(obj, view, i);
        this.ah$a = circularImageView;
        this.ag$a = customTextView;
    }
}
