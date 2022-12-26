package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.ContactListItemVM;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class onChanged extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    public final D11TextView ah$a;
    @androidx.databinding.Bindable
    protected ContactListItemVM toString;
    public final ImageView valueOf;
    public final CircularImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onChanged(Object obj, View view, int i, CircularImageView circularImageView, ImageView imageView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.values = circularImageView;
        this.valueOf = imageView;
        this.ag$a = d11TextView;
        this.ah$a = d11TextView2;
    }
}
