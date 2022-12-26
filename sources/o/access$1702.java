package o;

import com.app.dream11.leaguelisting.livestreamingbanner.LiveStreamingBannerComponent;
/* loaded from: classes3.dex */
public final class access$1702 {
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"liveStreamingBannerInputData", "isFantasyLiveMatchAvailable"})
    public static final void values(LiveStreamingBannerComponent liveStreamingBannerComponent, access$1700 access_1700, Boolean bool) {
        if (access_1700 == null || bool == null || !bool.booleanValue() || liveStreamingBannerComponent == null) {
            return;
        }
        liveStreamingBannerComponent.setLiveStreamingBannerInputData(access_1700);
    }
}
