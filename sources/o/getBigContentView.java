package o;

import com.app.dream11.social.friendsrecommendation.FriendsRecommendedComponent;
/* loaded from: classes3.dex */
public final class getBigContentView {
    @androidx.databinding.BindingAdapter({"recommendedFriendsData"})
    public static final void valueOf(FriendsRecommendedComponent friendsRecommendedComponent, setBadgeIconType setbadgeicontype) {
        if (setbadgeicontype == null || friendsRecommendedComponent == null) {
            return;
        }
        friendsRecommendedComponent.setData(setbadgeicontype);
    }
}
