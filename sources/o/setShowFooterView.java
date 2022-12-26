package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.FriendsListItemVM;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setShowFooterView extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected FriendsListItemVM ag$a;
    public final ImageView ah$a;
    public final D11TextView toString;
    public final CircularImageView valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setShowFooterView(Object obj, View view, int i, CircularImageView circularImageView, ImageView imageView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.valueOf = circularImageView;
        this.ah$a = imageView;
        this.toString = d11TextView;
        this.values = d11TextView2;
    }
}
