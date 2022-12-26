package o;

import android.os.Handler;
import android.os.Message;
import com.fancode.video.base.VideoSource;
import com.fancode.video.models.VideoType;
import com.fancode.video.players.FCBaseExoPlayerView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import java.util.HashMap;
/* loaded from: classes4.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 {
    private long HaptikSDK$a;
    private long HaptikSDK$b;
    private long HaptikSDK$c;
    private boolean HaptikSDK$d;
    private final FCBaseExoPlayerView HaptikSDK$e;
    private long HaptikWebView;
    private final int ag$a;
    private final int ah$a;
    private long ah$b;
    private VideoSource ak;
    private final Handler getInitSettings;
    private final ExoPlayer getSignupData;
    private final float invoke;
    private Timeline.Window toString;
    private boolean valueOf;
    private Timeline.Period values;

    public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1(FCBaseExoPlayerView fCBaseExoPlayerView) {
        runAnimators.ag$a(fCBaseExoPlayerView, "parent");
        this.HaptikSDK$e = fCBaseExoPlayerView;
        this.toString = new Timeline.Window();
        this.values = new Timeline.Period();
        this.HaptikSDK$a = -1L;
        this.ag$a = 10;
        this.ah$a = 1;
        this.invoke = 1500.0f;
        ExoPlayer asInterface = fCBaseExoPlayerView.asInterface();
        runAnimators.toString(asInterface);
        this.getSignupData = asInterface;
        this.getInitSettings = new toString();
    }

    public final long values() {
        if (HaptikSDK$c()) {
            return -1L;
        }
        long duration = this.getSignupData.getDuration();
        long j = duration >= 0 ? duration : -1L;
        return j < 0 ? this.HaptikSDK$b : j;
    }

    public final long ah$b() {
        HaptikSDK$e();
        return this.HaptikWebView;
    }

    public final boolean HaptikSDK$b() {
        return HaptikSDK$c() && this.HaptikWebView - ah$a() > -5000;
    }

    public final boolean HaptikSDK$c() {
        return this.getSignupData.isCurrentMediaItemLive();
    }

    public final long ah$a() {
        HaptikSDK$e();
        return this.HaptikSDK$b;
    }

    public final void HaptikSDK$a() {
        this.HaptikSDK$d = false;
    }

    public final void HaptikWebView() {
        this.getInitSettings.sendEmptyMessage(this.ah$a);
    }

    public final void ag$a() {
        this.getInitSettings.removeMessages(this.ah$a);
    }

    public final void ag$a(VideoSource videoSource) {
        runAnimators.ag$a(videoSource, "videoSource");
        this.ak = videoSource;
    }

    public final void invoke() {
        if (HaptikSDK$c()) {
            valueOf(ah$a());
        }
    }

    public final void valueOf(long j) {
        if (j > 0 && HaptikSDK$c()) {
            long j2 = this.HaptikSDK$b;
            if (j > j2) {
                j = j2;
            }
            j -= this.HaptikSDK$c;
        }
        this.getSignupData.seekTo(j);
    }

    /* loaded from: classes4.dex */
    public static final class toString extends Handler {
        toString() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            runAnimators.ag$a(message, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
            if (message.what == WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.ah$a && WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.getSignupData != null && WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.getSignupData.getPlaybackState() == 3 && WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.getSignupData.getPlayWhenReady()) {
                HashMap hashMap = new HashMap();
                long values = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.values();
                if (WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.ah$b() < values || WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.HaptikSDK$c()) {
                    long bufferedPercentage = (WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.getSignupData.getBufferedPercentage() * values) / 100;
                    hashMap.put("playheadPosition", Integer.valueOf((int) WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.ah$b()));
                    hashMap.put("playableDuration", Integer.valueOf((int) bufferedPercentage));
                    hashMap.put("duration", Integer.valueOf((int) values));
                    hashMap.put("currentPlaybackTime", Long.valueOf(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.HaptikSDK$b));
                    if (WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.HaptikSDK$d) {
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.HaptikSDK$e.ag$a(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, hashMap);
                    } else {
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.HaptikSDK$d = true;
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.HaptikSDK$e.ag$a("play", hashMap);
                    }
                } else if (WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.HaptikSDK$d) {
                    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.getSignupData.stop();
                    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.HaptikSDK$e.ag$a("end", hashMap);
                }
                Message obtainMessage = obtainMessage(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.ah$a);
                runAnimators.ah$a(obtainMessage, "obtainMessage(SHOW_PROGRESS)");
                sendMessageDelayed(obtainMessage, Math.round(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this.invoke));
            }
        }
    }

    public final long valueOf() {
        return this.getSignupData.getContentBufferedPosition();
    }

    private final void getSignupData() {
        if (this.HaptikSDK$a == -1) {
            this.HaptikSDK$a = this.toString.windowStartTimeMs > 0 ? this.toString.windowStartTimeMs : 0L;
        }
        if (!this.getSignupData.getCurrentTimeline().isEmpty() && HaptikSDK$c() && this.HaptikSDK$a >= 0) {
            VideoSource videoSource = this.ak;
            if (videoSource == null) {
                runAnimators.valueOf("videoSource");
                videoSource = null;
            }
            if (videoSource.a() == VideoType.DASH) {
                r2 = (this.toString.windowStartTimeMs != C.TIME_UNSET ? this.toString.windowStartTimeMs : 0L) - this.HaptikSDK$a;
            } else {
                r2 = Math.abs(this.values.getPositionInWindowMs());
            }
        }
        this.ah$b = this.toString.getDurationMs();
        this.HaptikSDK$c = r2;
    }

    private final void HaptikSDK$e() {
        Timeline currentTimeline = this.getSignupData.getCurrentTimeline();
        runAnimators.ah$a(currentTimeline, "player.currentTimeline");
        if (HaptikSDK$c() && !currentTimeline.isEmpty()) {
            currentTimeline.getWindow(this.getSignupData.getCurrentMediaItemIndex(), this.toString);
            currentTimeline.getPeriod(this.getSignupData.getCurrentPeriodIndex(), this.values);
            getSignupData();
            long defaultPositionMs = this.toString.getDefaultPositionMs();
            this.HaptikSDK$b = defaultPositionMs == C.TIME_UNSET ? 0L : this.HaptikSDK$c + defaultPositionMs;
            this.valueOf = defaultPositionMs > ((long) this.ag$a);
            this.HaptikWebView = this.getSignupData.getCurrentPosition() + this.HaptikSDK$c;
            return;
        }
        this.HaptikWebView = this.getSignupData.getCurrentPosition();
    }
}
