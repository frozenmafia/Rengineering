package o;

import android.view.View;
import com.app.dream11.chat.groups.GroupUserVM;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class onLongClick extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    public final CircularImageView ah$a;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    @androidx.databinding.Bindable
    protected GroupUserVM values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onLongClick(Object obj, View view, int i, CircularImageView circularImageView, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.ah$a = circularImageView;
        this.toString = customTextView;
        this.valueOf = customTextView2;
        this.ag$a = customTextView3;
    }
}
