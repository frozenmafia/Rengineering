package o;

import android.view.View;
import android.widget.FrameLayout;
import com.app.dream11.social.profilerecommendation.FollowUnFollowComponent;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
import o.addPages;
/* loaded from: classes2.dex */
public abstract class updateAppearance extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final FrameLayout ag$a;
    public final FollowUnFollowComponent ah$a;
    public final CircularImageView toString;
    @androidx.databinding.Bindable
    protected addPages.toString valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public updateAppearance(Object obj, View view, int i, FrameLayout frameLayout, FollowUnFollowComponent followUnFollowComponent, CircularImageView circularImageView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ag$a = frameLayout;
        this.ah$a = followUnFollowComponent;
        this.toString = circularImageView;
        this.values = d11TextView;
        this.HaptikSDK$a = d11TextView2;
    }
}
