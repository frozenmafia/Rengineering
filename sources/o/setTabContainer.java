package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.groups.GroupBottomSheetItemVM;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class setTabContainer extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    @androidx.databinding.Bindable
    protected GroupBottomSheetItemVM ah$a;
    public final CircularImageView toString;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setTabContainer(Object obj, View view, int i, CircularImageView circularImageView, ImageView imageView, CustomTextView customTextView) {
        super(obj, view, i);
        this.toString = circularImageView;
        this.values = imageView;
        this.ag$a = customTextView;
    }
}
