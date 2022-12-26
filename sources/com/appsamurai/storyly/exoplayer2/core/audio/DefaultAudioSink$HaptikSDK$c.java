package com.appsamurai.storyly.exoplayer2.core.audio;

import android.media.AudioTrack;
import android.os.Handler;
import com.appsamurai.storyly.exoplayer2.core.audio.AudioSink;
import o.FingerprintManagerCompat;
import o.untagSocket;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DefaultAudioSink$HaptikSDK$c {
    private final AudioTrack.StreamEventCallback ah$a;
    final /* synthetic */ DefaultAudioSink toString;
    private final Handler values = new Handler();

    public DefaultAudioSink$HaptikSDK$c(final DefaultAudioSink defaultAudioSink) {
        this.toString = defaultAudioSink;
        this.ah$a = new AudioTrack.StreamEventCallback() { // from class: com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink$HaptikSDK$c.1
            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i) {
                AudioTrack audioTrack2;
                AudioSink.toString tostring;
                boolean z;
                AudioSink.toString tostring2;
                audioTrack2 = DefaultAudioSink$HaptikSDK$c.this.toString.HaptikSDK$c;
                FingerprintManagerCompat.ah$a(audioTrack == audioTrack2);
                tostring = DefaultAudioSink$HaptikSDK$c.this.toString.ICustomTabsCallback$Default;
                if (tostring != null) {
                    z = DefaultAudioSink$HaptikSDK$c.this.toString.onTransact;
                    if (z) {
                        tostring2 = DefaultAudioSink$HaptikSDK$c.this.toString.ICustomTabsCallback$Default;
                        tostring2.values();
                    }
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                AudioTrack audioTrack2;
                AudioSink.toString tostring;
                boolean z;
                AudioSink.toString tostring2;
                audioTrack2 = DefaultAudioSink$HaptikSDK$c.this.toString.HaptikSDK$c;
                FingerprintManagerCompat.ah$a(audioTrack == audioTrack2);
                tostring = DefaultAudioSink$HaptikSDK$c.this.toString.ICustomTabsCallback$Default;
                if (tostring != null) {
                    z = DefaultAudioSink$HaptikSDK$c.this.toString.onTransact;
                    if (z) {
                        tostring2 = DefaultAudioSink$HaptikSDK$c.this.toString.ICustomTabsCallback$Default;
                        tostring2.values();
                    }
                }
            }
        };
    }

    public void values(AudioTrack audioTrack) {
        Handler handler = this.values;
        handler.getClass();
        audioTrack.registerStreamEventCallback(new untagSocket(handler), this.ah$a);
    }

    public void valueOf(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.ah$a);
        this.values.removeCallbacksAndMessages(null);
    }
}
