package o;

import android.view.View;
import android.widget.FrameLayout;
import com.app.dream11.social.profilerecommendation.FollowUnFollowComponent;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
import o.addPages;
/* loaded from: classes2.dex */
public abstract class canSafelyMutateDrawable extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected addPages.valueOf ag$a;
    public final FollowUnFollowComponent ah$a;
    public final D11TextView ah$b;
    public final CircularImageView toString;
    public final FrameLayout valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public canSafelyMutateDrawable(Object obj, View view, int i, CircularImageView circularImageView, FollowUnFollowComponent followUnFollowComponent, FrameLayout frameLayout, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.toString = circularImageView;
        this.ah$a = followUnFollowComponent;
        this.valueOf = frameLayout;
        this.values = d11TextView;
        this.ah$b = d11TextView2;
    }
}
