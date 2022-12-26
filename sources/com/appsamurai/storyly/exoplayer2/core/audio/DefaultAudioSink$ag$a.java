package com.appsamurai.storyly.exoplayer2.core.audio;

import com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink;
import o.FingerprintManagerCompat;
import o.getInputStream;
/* loaded from: classes3.dex */
public final class DefaultAudioSink$ag$a {
    private DefaultAudioSink.values ah$a;
    private boolean valueOf;
    private boolean values;
    private getInputStream ag$a = getInputStream.ag$a;
    private int HaptikSDK$a = 0;
    DefaultAudioSink$ah$a toString = DefaultAudioSink$ah$a.ah$a;

    public static /* synthetic */ DefaultAudioSink.values ag$a(DefaultAudioSink$ag$a defaultAudioSink$ag$a) {
        return defaultAudioSink$ag$a.ah$a;
    }

    public static /* synthetic */ boolean ah$a(DefaultAudioSink$ag$a defaultAudioSink$ag$a) {
        return defaultAudioSink$ag$a.values;
    }

    public static /* synthetic */ boolean toString(DefaultAudioSink$ag$a defaultAudioSink$ag$a) {
        return defaultAudioSink$ag$a.valueOf;
    }

    public static /* synthetic */ getInputStream valueOf(DefaultAudioSink$ag$a defaultAudioSink$ag$a) {
        return defaultAudioSink$ag$a.ag$a;
    }

    public static /* synthetic */ int values(DefaultAudioSink$ag$a defaultAudioSink$ag$a) {
        return defaultAudioSink$ag$a.HaptikSDK$a;
    }

    public DefaultAudioSink$ag$a toString(getInputStream getinputstream) {
        FingerprintManagerCompat.toString(getinputstream);
        this.ag$a = getinputstream;
        return this;
    }

    public DefaultAudioSink$ag$a ag$a(boolean z) {
        this.values = z;
        return this;
    }

    public DefaultAudioSink$ag$a values(boolean z) {
        this.valueOf = z;
        return this;
    }

    public DefaultAudioSink$ag$a values(int i) {
        this.HaptikSDK$a = i;
        return this;
    }

    public DefaultAudioSink values() {
        if (this.ah$a == null) {
            this.ah$a = new DefaultAudioSink$ah$b(new AudioProcessor[0]);
        }
        return new DefaultAudioSink(this);
    }
}
