package com.appsamurai.storyly.exoplayer2.core.audio;

import com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink;
import o.BuildCompat;
import o.toFile;
import o.typeToString;
/* loaded from: classes3.dex */
public class DefaultAudioSink$ah$b implements DefaultAudioSink.values {
    private final AudioProcessor[] ag$a;
    private final BuildCompat ah$a;
    private final toFile toString;

    public DefaultAudioSink$ah$b(AudioProcessor... audioProcessorArr) {
        this(audioProcessorArr, new BuildCompat(), new toFile());
    }

    public DefaultAudioSink$ah$b(AudioProcessor[] audioProcessorArr, BuildCompat buildCompat, toFile tofile) {
        AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
        this.ag$a = audioProcessorArr2;
        System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
        this.ah$a = buildCompat;
        this.toString = tofile;
        audioProcessorArr2[audioProcessorArr.length] = buildCompat;
        audioProcessorArr2[audioProcessorArr.length + 1] = tofile;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink.values
    public AudioProcessor[] ah$a() {
        return this.ag$a;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink.values
    public typeToString ah$a(typeToString typetostring) {
        this.toString.values(typetostring.values);
        this.toString.toString(typetostring.ag$a);
        return typetostring;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink.values
    public boolean toString(boolean z) {
        this.ah$a.toString(z);
        return z;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink.values
    public long toString(long j) {
        return this.toString.valueOf(j);
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink.values
    public long valueOf() {
        return this.ah$a.getInitSettings();
    }
}
