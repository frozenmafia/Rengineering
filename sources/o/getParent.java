package o;

import com.app.dream11.core.service.graphql.api.fragment.ProfilePicFragment;
import com.app.dream11.core.service.graphql.api.fragment.UserProfilePicFragment;
import com.app.dream11.model.Leaderboard;
/* loaded from: classes3.dex */
public class getParent {
    public static String valueOf(String str, String str2) {
        return str2;
    }

    public static String valueOf(ProfilePicFragment profilePicFragment) {
        return toString(profilePicFragment);
    }

    public static String ah$a(UserProfilePicFragment userProfilePicFragment) {
        return toString(userProfilePicFragment);
    }

    public static String toString(Leaderboard leaderboard) {
        return valueOf(leaderboard);
    }

    public static String toString(ProfilePicFragment profilePicFragment) {
        return (!loadFont.ag$a(profilePicFragment.getProfilePic()) || profilePicFragment.getProfilePic().get(0) == null) ? "" : profilePicFragment.getProfilePic().get(0).getSrc();
    }

    public static String toString(UserProfilePicFragment userProfilePicFragment) {
        return (!loadFont.ag$a(userProfilePicFragment.getProfilePic()) || userProfilePicFragment.getProfilePic().get(0) == null) ? "" : userProfilePicFragment.getProfilePic().get(0).getSrc();
    }

    public static String valueOf(Leaderboard leaderboard) {
        return !loadFont.ak(leaderboard.getProfilePicUrl()) ? leaderboard.getProfilePicUrl() : "";
    }
}
