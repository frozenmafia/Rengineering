package o;

import android.view.View;
import com.app.dream11.chat.chatlist.contestinvitebottomsheet.ContestInviterInfoModel;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class recycle extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    @androidx.databinding.Bindable
    protected ContestInviterInfoModel toString;
    public final CircularImageView values;

    public abstract void ag$a(ContestInviterInfoModel contestInviterInfoModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public recycle(Object obj, View view, int i, D11TextView d11TextView, CircularImageView circularImageView) {
        super(obj, view, i);
        this.ag$a = d11TextView;
        this.values = circularImageView;
    }
}
