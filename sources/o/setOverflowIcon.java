package o;

import android.view.View;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.LinkableCustomTextView;
import com.mikhaellopez.circularimageview.CircularImageView;
/* loaded from: classes2.dex */
public abstract class setOverflowIcon extends androidx.databinding.ViewDataBinding {
    public final CircularImageView ag$a;
    public final CustomTextView ah$a;
    public final hasNext invoke;
    public final LinkableCustomTextView toString;
    @androidx.databinding.Bindable
    protected ChatMessageVM valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setOverflowIcon(Object obj, View view, int i, CircularImageView circularImageView, LinkableCustomTextView linkableCustomTextView, CustomTextView customTextView, CustomTextView customTextView2, hasNext hasnext) {
        super(obj, view, i);
        this.ag$a = circularImageView;
        this.toString = linkableCustomTextView;
        this.ah$a = customTextView;
        this.values = customTextView2;
        this.invoke = hasnext;
    }
}
