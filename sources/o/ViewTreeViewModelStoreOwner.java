package o;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackStats;
import com.google.android.exoplayer2.analytics.PlaybackStatsListener;
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewTreeViewModelStoreOwner implements PlaybackStatsListener.Callback {
    public static final /* synthetic */ ViewTreeViewModelStoreOwner values = new ViewTreeViewModelStoreOwner();

    private /* synthetic */ ViewTreeViewModelStoreOwner() {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackStatsListener.Callback
    public final void onPlaybackStatsReady(AnalyticsListener.EventTime eventTime, PlaybackStats playbackStats) {
        ViewModelStores.valueOf(eventTime, playbackStats);
    }
}
