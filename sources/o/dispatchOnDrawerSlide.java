package o;

import com.dream11.feature.downloader.DownloadState;
/* loaded from: classes4.dex */
public interface dispatchOnDrawerSlide {
    void valueOf(DownloadState downloadState, String str);

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public static /* synthetic */ void valueOf(dispatchOnDrawerSlide dispatchondrawerslide, DownloadState downloadState, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateState");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            dispatchondrawerslide.valueOf(downloadState, str);
        }
    }
}
