package o;

import com.fancode.video.players.FCBaseExoPlayerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.lang.ref.WeakReference;
import o.initLoader;
/* loaded from: classes4.dex */
public final class createAndInstallLoader implements initLoader.valueOf {
    private WeakReference<FCBaseExoPlayerView> values;

    public final void valueOf(WeakReference<FCBaseExoPlayerView> weakReference) {
        this.values = weakReference;
    }

    @Override // o.initLoader.valueOf
    public void valueOf(Format format, TrackGroup trackGroup) {
        FCBaseExoPlayerView fCBaseExoPlayerView;
        runAnimators.ag$a(format, "format");
        runAnimators.ag$a(trackGroup, "trackGroup");
        WeakReference<FCBaseExoPlayerView> weakReference = this.values;
        if (weakReference == null || (fCBaseExoPlayerView = weakReference.get()) == null) {
            return;
        }
        fCBaseExoPlayerView.toString(format, trackGroup);
    }

    public final void valueOf() {
        WeakReference<FCBaseExoPlayerView> weakReference = this.values;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
