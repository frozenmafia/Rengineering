package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.chatlist.ChatListItemVM;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public abstract class setWindowCallback extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final D11TextView HaptikSDK$e;
    public final androidx.constraintlayout.widget.Barrier ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final D11TextView getInitSettings;
    public final ShimmerFrameLayout getSignupData;
    public final androidx.constraintlayout.widget.Barrier invoke;
    public final CircularImageView toString;
    public final androidx.constraintlayout.widget.Barrier valueOf;
    @androidx.databinding.Bindable
    protected ChatListItemVM values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setWindowCallback(Object obj, View view, int i, androidx.constraintlayout.widget.Barrier barrier, androidx.constraintlayout.widget.Barrier barrier2, CircularImageView circularImageView, ImageView imageView, androidx.constraintlayout.widget.Barrier barrier3, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.ag$a = barrier;
        this.valueOf = barrier2;
        this.toString = circularImageView;
        this.ah$a = imageView;
        this.invoke = barrier3;
        this.ah$b = d11TextView;
        this.HaptikSDK$c = d11TextView2;
        this.HaptikSDK$a = d11TextView3;
        this.HaptikSDK$b = d11TextView4;
        this.getInitSettings = d11TextView5;
        this.HaptikSDK$e = d11TextView6;
        this.getSignupData = shimmerFrameLayout;
    }
}
