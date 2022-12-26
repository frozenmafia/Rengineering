package com.conviva.playerinterface;

import com.conviva.api.ConvivaConstants;
import com.conviva.sdk.ConvivaExperienceAnalytics;
import com.conviva.sdk.ConvivaSdkConstants;
import com.conviva.sdk.ConvivaVideoAnalytics;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.HashMap;
import o.canTargetScrollHorizontally;
/* loaded from: classes4.dex */
public class ConvivaSDKExoPlayer extends CVExoPlayerListener implements ConvivaExperienceAnalytics.toString, canTargetScrollHorizontally {
    public static final String version = "4.0.12";
    private ConvivaVideoAnalytics mClient;
    private ExoPlayer mPlayer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConvivaSDKExoPlayer(java.lang.Object r3, com.conviva.sdk.ConvivaVideoAnalytics r4) {
        /*
            r2 = this;
            r0 = r3
            com.google.android.exoplayer2.ExoPlayer r0 = (com.google.android.exoplayer2.ExoPlayer) r0
            r2.<init>(r0)
            r1 = 0
            r2.mPlayer = r1
            r2.mClient = r1
            r2.mClient = r4
            if (r3 == 0) goto L15
            boolean r3 = r3 instanceof com.google.android.exoplayer2.ExoPlayer
            if (r3 == 0) goto L15
            r2.mPlayer = r0
        L15:
            if (r4 == 0) goto L1a
            r4.setCallback(r2)
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.conviva.playerinterface.ConvivaSDKExoPlayer.<init>(java.lang.Object, com.conviva.sdk.ConvivaVideoAnalytics):void");
    }

    @Override // com.conviva.sdk.ConvivaExperienceAnalytics.toString
    public void update() {
        updateMetrics();
    }

    @Override // com.conviva.sdk.ConvivaExperienceAnalytics.toString
    public void update(String str) {
        if (str == null || str.isEmpty() || !ConvivaSdkConstants.PLAYBACK.CDN_IP.equals(str)) {
            return;
        }
        getCDNServerIP();
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void updatedMetrics() {
        ConvivaVideoAnalytics convivaVideoAnalytics = this.mClient;
        if (convivaVideoAnalytics != null) {
            convivaVideoAnalytics.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.PLAY_HEAD_TIME, Long.valueOf(this.pht));
            int i = this.bufferLength;
            ConvivaVideoAnalytics convivaVideoAnalytics2 = this.mClient;
            Object[] objArr = new Object[1];
            if (i < 0) {
                i = -1;
            }
            objArr[0] = Integer.valueOf(i);
            convivaVideoAnalytics2.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.BUFFER_LENGTH, objArr);
        }
    }

    @Override // o.canTargetScrollHorizontally
    public void initializeModule() {
        HashMap hashMap = new HashMap();
        String playerVersion = getPlayerVersion();
        String playerName = getPlayerName();
        if (playerVersion != null && !playerVersion.isEmpty()) {
            hashMap.put(ConvivaSdkConstants.FRAMEWORK_VERSION, playerVersion);
        }
        if (playerName != null && !playerName.isEmpty()) {
            hashMap.put(ConvivaSdkConstants.FRAMEWORK_NAME, playerName);
        }
        hashMap.put("moduleName", "EX");
        hashMap.put("moduleVersion", "4.0.12");
        ConvivaVideoAnalytics convivaVideoAnalytics = this.mClient;
        if (convivaVideoAnalytics != null) {
            convivaVideoAnalytics.setPlayerInfo(hashMap);
        }
        updatePlayerState();
    }

    @Override // o.canTargetScrollHorizontally
    public void releaseModule() {
        super.cleanup();
        this.mClient = null;
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void setPlayerState(ConvivaSdkConstants.PlayerState playerState) {
        if (playerState.equals(this.mPrevPlaybackState) || this.mClient == null) {
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$conviva$sdk$ConvivaSdkConstants$PlayerState[playerState.ordinal()];
        if (i == 1) {
            this.mClient.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.PLAYER_STATE, ConvivaSdkConstants.PlayerState.BUFFERING);
        } else if (i == 2) {
            this.mClient.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.PLAYER_STATE, ConvivaSdkConstants.PlayerState.STOPPED);
        } else if (i == 3) {
            this.mClient.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.PLAYER_STATE, ConvivaSdkConstants.PlayerState.PLAYING);
        } else if (i == 4) {
            this.mClient.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.PLAYER_STATE, ConvivaSdkConstants.PlayerState.PAUSED);
        }
        this.mPrevPlaybackState = playerState;
    }

    /* renamed from: com.conviva.playerinterface.ConvivaSDKExoPlayer$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$conviva$sdk$ConvivaSdkConstants$PlayerState;

        static {
            int[] iArr = new int[ConvivaSdkConstants.PlayerState.values().length];
            $SwitchMap$com$conviva$sdk$ConvivaSdkConstants$PlayerState = iArr;
            try {
                iArr[ConvivaSdkConstants.PlayerState.BUFFERING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$conviva$sdk$ConvivaSdkConstants$PlayerState[ConvivaSdkConstants.PlayerState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$conviva$sdk$ConvivaSdkConstants$PlayerState[ConvivaSdkConstants.PlayerState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$conviva$sdk$ConvivaSdkConstants$PlayerState[ConvivaSdkConstants.PlayerState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void setPlayerSeekStart() {
        ConvivaVideoAnalytics convivaVideoAnalytics = this.mClient;
        if (convivaVideoAnalytics != null) {
            convivaVideoAnalytics.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.SEEK_STARTED, new Object[0]);
        }
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void setPlayerSeekEnd() {
        ConvivaVideoAnalytics convivaVideoAnalytics = this.mClient;
        if (convivaVideoAnalytics != null) {
            convivaVideoAnalytics.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.SEEK_ENDED, new Object[0]);
        }
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void setDuration(int i) {
        if (this.mClient == null || i <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ConvivaSdkConstants.DURATION, Integer.valueOf(i));
        this.mClient.setContentInfo(hashMap);
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void sendPlayerError(String str, ConvivaConstants.ErrorSeverity errorSeverity) {
        if (this.mClient != null) {
            if (ConvivaConstants.ErrorSeverity.FATAL == errorSeverity) {
                this.mClient.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.PLAYER_STATE, ConvivaSdkConstants.PlayerState.STOPPED);
                this.mClient.reportPlaybackError(str, ConvivaSdkConstants.ErrorSeverity.FATAL);
                return;
            }
            this.mClient.reportPlaybackError(str, ConvivaSdkConstants.ErrorSeverity.WARNING);
        }
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void setVideoResolution(int i, int i2) {
        ConvivaVideoAnalytics convivaVideoAnalytics = this.mClient;
        if (convivaVideoAnalytics != null) {
            convivaVideoAnalytics.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.RESOLUTION, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void setPlayerBitrateKbps(int i, boolean z) {
        ConvivaVideoAnalytics convivaVideoAnalytics = this.mClient;
        if (convivaVideoAnalytics == null || i < 0) {
            return;
        }
        if (z) {
            convivaVideoAnalytics.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.AVG_BITRATE, Integer.valueOf(i));
        } else {
            convivaVideoAnalytics.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.BITRATE, Integer.valueOf(i));
        }
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void setCDNServerIP(String str) {
        if (this.mClient == null || str.isEmpty()) {
            return;
        }
        this.mClient.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.CDN_IP, str, "CONVIVA");
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void setDroppedFrameCount(int i) {
        ConvivaVideoAnalytics convivaVideoAnalytics = this.mClient;
        if (convivaVideoAnalytics == null || i <= 0) {
            return;
        }
        convivaVideoAnalytics.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.DROPPED_FRAMES_COUNT, Integer.valueOf(i));
    }

    @Override // com.conviva.playerinterface.CVExoPlayerListener
    protected void setEncodedFrameRate(int i) {
        ConvivaVideoAnalytics convivaVideoAnalytics = this.mClient;
        if (convivaVideoAnalytics == null || i < 0) {
            return;
        }
        convivaVideoAnalytics.reportPlaybackMetric(ConvivaSdkConstants.PLAYBACK.ENCODED_FRAMERATE, Integer.valueOf(i));
    }
}
