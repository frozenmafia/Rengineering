package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.chatlist.contestinvitebottomsheet.RoundDetails;
import com.app.dream11.ui.CountDownTimerTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class onNestedPreScroll extends androidx.databinding.ViewDataBinding {
    public final CountDownTimerTextView HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final androidx.constraintlayout.widget.Barrier ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final D11TextView invoke;
    public final ImageView toString;
    public final androidx.constraintlayout.widget.Barrier valueOf;
    @androidx.databinding.Bindable
    protected RoundDetails values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onNestedPreScroll(Object obj, View view, int i, ImageView imageView, ImageView imageView2, androidx.constraintlayout.widget.Barrier barrier, androidx.constraintlayout.widget.Barrier barrier2, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, CountDownTimerTextView countDownTimerTextView) {
        super(obj, view, i);
        this.toString = imageView;
        this.ah$a = imageView2;
        this.ag$a = barrier;
        this.valueOf = barrier2;
        this.invoke = d11TextView;
        this.HaptikSDK$b = d11TextView2;
        this.ah$b = d11TextView3;
        this.HaptikSDK$a = countDownTimerTextView;
    }
}
