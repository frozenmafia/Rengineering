package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.GroupChatVM;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class shouldCleanUp extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$b;
    public final androidx.constraintlayout.widget.Barrier ag$a;
    public final CircularImageView ah$a;
    @androidx.databinding.Bindable
    protected GroupChatVM ah$b;
    public final D11TextView toString;
    public final ImageView valueOf;
    public final androidx.constraintlayout.widget.Guideline values;

    public abstract void values(GroupChatVM groupChatVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public shouldCleanUp(Object obj, View view, int i, D11TextView d11TextView, androidx.constraintlayout.widget.Barrier barrier, CircularImageView circularImageView, androidx.constraintlayout.widget.Guideline guideline, ImageView imageView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.toString = d11TextView;
        this.ag$a = barrier;
        this.ah$a = circularImageView;
        this.values = guideline;
        this.valueOf = imageView;
        this.HaptikSDK$b = d11TextView2;
    }
}
