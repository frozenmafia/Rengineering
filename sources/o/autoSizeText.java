package o;

import android.view.View;
import android.widget.FrameLayout;
import com.app.dream11.social.profilerecommendation.FollowUnFollowComponent;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class autoSizeText extends androidx.databinding.ViewDataBinding {
    public final FrameLayout ag$a;
    public final FollowUnFollowComponent ah$a;
    @androidx.databinding.Bindable
    protected onActivitySaveInstanceState toString;
    public final CustomTextView valueOf;
    public final CircularImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public autoSizeText(Object obj, View view, int i, CircularImageView circularImageView, FollowUnFollowComponent followUnFollowComponent, FrameLayout frameLayout, CustomTextView customTextView) {
        super(obj, view, i);
        this.values = circularImageView;
        this.ah$a = followUnFollowComponent;
        this.ag$a = frameLayout;
        this.valueOf = customTextView;
    }
}
