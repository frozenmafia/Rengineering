package o;

import android.content.Context;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
/* loaded from: classes4.dex */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2 {
    private android.support.v4.media.session.MediaSessionCompat ag$a;
    private ExoPlayer ah$a;
    private MediaSessionConnector valueOf;
    private final Context values;

    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(Context context) {
        runAnimators.ag$a(context, "context");
        this.values = context;
    }

    public final void values(ExoPlayer exoPlayer) {
        runAnimators.ag$a(exoPlayer, "exoPlayer");
        if (this.ah$a == null) {
            this.ah$a = exoPlayer;
        }
        Context context = this.values;
        android.support.v4.media.session.MediaSessionCompat mediaSessionCompat = new android.support.v4.media.session.MediaSessionCompat(context, context.getPackageName());
        this.ag$a = mediaSessionCompat;
        runAnimators.toString(mediaSessionCompat);
        MediaSessionConnector mediaSessionConnector = new MediaSessionConnector(mediaSessionCompat);
        this.valueOf = mediaSessionConnector;
        runAnimators.toString(mediaSessionConnector);
        mediaSessionConnector.setPlayer(this.ah$a);
        MediaSessionConnector mediaSessionConnector2 = this.valueOf;
        runAnimators.toString(mediaSessionConnector2);
        mediaSessionConnector2.setEnabledPlaybackActions(519L);
    }

    public final void ag$a() {
        android.support.v4.media.session.MediaSessionCompat mediaSessionCompat = this.ag$a;
        if (mediaSessionCompat == null) {
            return;
        }
        mediaSessionCompat.setActive(true);
    }

    public final void values() {
        android.support.v4.media.session.MediaSessionCompat mediaSessionCompat = this.ag$a;
        if (mediaSessionCompat == null) {
            return;
        }
        mediaSessionCompat.setActive(false);
    }

    public final void ah$a() {
        android.support.v4.media.session.MediaSessionCompat mediaSessionCompat = this.ag$a;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.release();
        }
        this.valueOf = null;
        this.ag$a = null;
    }
}
