package o;

import com.app.dream11.social.profilerecommendation.FollowUnFollowComponent;
/* loaded from: classes3.dex */
public final class displayCustomViewInline {
    @androidx.databinding.BindingAdapter({"followUnFollowData"})
    public static final void ag$a(FollowUnFollowComponent followUnFollowComponent, makeBigContentView makebigcontentview) {
        if (makebigcontentview == null || followUnFollowComponent == null) {
            return;
        }
        followUnFollowComponent.setData(makebigcontentview);
    }
}
