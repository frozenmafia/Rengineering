package com.appsamurai.storyly.exoplayer2.core.audio;

import android.os.SystemClock;
import com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink;
import o.SupportMenuItem;
import o.clearThreadStatsTag$ag$a;
/* loaded from: classes3.dex */
final class DefaultAudioSink$HaptikSDK$a implements clearThreadStatsTag$ag$a {
    final /* synthetic */ DefaultAudioSink values;

    private DefaultAudioSink$HaptikSDK$a(DefaultAudioSink defaultAudioSink) {
        this.values = defaultAudioSink;
    }

    @Override // o.clearThreadStatsTag$ag$a
    public void valueOf(long j, long j2, long j3, long j4) {
        String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.valueOf(this.values) + ", " + DefaultAudioSink.toString(this.values);
        if (DefaultAudioSink.ag$a) {
            throw new DefaultAudioSink.InvalidAudioTrackTimestampException(str);
        }
        SupportMenuItem.toString("DefaultAudioSink", str);
    }

    @Override // o.clearThreadStatsTag$ag$a
    public void ah$a(long j, long j2, long j3, long j4) {
        String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.valueOf(this.values) + ", " + DefaultAudioSink.toString(this.values);
        if (DefaultAudioSink.ag$a) {
            throw new DefaultAudioSink.InvalidAudioTrackTimestampException(str);
        }
        SupportMenuItem.toString("DefaultAudioSink", str);
    }

    @Override // o.clearThreadStatsTag$ag$a
    public void ah$a(long j) {
        SupportMenuItem.toString("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
    }

    @Override // o.clearThreadStatsTag$ag$a
    public void toString(long j) {
        if (DefaultAudioSink.values(this.values) != null) {
            DefaultAudioSink.values(this.values).ah$a(j);
        }
    }

    @Override // o.clearThreadStatsTag$ag$a
    public void valueOf(int i, long j) {
        if (DefaultAudioSink.values(this.values) != null) {
            DefaultAudioSink.values(this.values).valueOf(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.ah$a(this.values));
        }
    }
}
