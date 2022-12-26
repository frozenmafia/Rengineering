package o;

import bolts.UnobservedTaskException;
import o.MediaControllerCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class getPlaybackInfo {
    private MediaControllerCompat<?> valueOf;

    public getPlaybackInfo(MediaControllerCompat<?> mediaControllerCompat) {
        this.valueOf = mediaControllerCompat;
    }

    protected void finalize() throws Throwable {
        MediaControllerCompat.valueOf valueof;
        try {
            MediaControllerCompat<?> mediaControllerCompat = this.valueOf;
            if (mediaControllerCompat != null && (valueof = MediaControllerCompat.HaptikSDK$c) != null) {
                valueof.values(mediaControllerCompat, new UnobservedTaskException(mediaControllerCompat.ag$a()));
            }
        } finally {
            super.finalize();
        }
    }

    public void values() {
        this.valueOf = null;
    }
}
