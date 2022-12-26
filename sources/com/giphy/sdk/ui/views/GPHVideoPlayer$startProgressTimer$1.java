package com.giphy.sdk.ui.views;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.TimerTask;
/* loaded from: classes7.dex */
public final class GPHVideoPlayer$startProgressTimer$1 extends TimerTask {
    final /* synthetic */ GPHVideoPlayer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GPHVideoPlayer$startProgressTimer$1(GPHVideoPlayer gPHVideoPlayer) {
        this.this$0 = gPHVideoPlayer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.giphy.sdk.ui.views.GPHVideoPlayer$startProgressTimer$1$run$1
            @Override // java.lang.Runnable
            public final void run() {
                ExoPlayer player;
                ExoPlayer player2 = GPHVideoPlayer$startProgressTimer$1.this.this$0.getPlayer();
                if ((player2 == null || player2.isPlaying()) && (player = GPHVideoPlayer$startProgressTimer$1.this.this$0.getPlayer()) != null) {
                    GPHVideoPlayer$startProgressTimer$1.this.this$0.updateProgress(player.getCurrentPosition());
                }
            }
        });
    }
}
