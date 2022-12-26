package com.appsamurai.storyly.exoplayer2.core.audio;

import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class AudioProcessor$ag$a {
    public static final AudioProcessor$ag$a valueOf = new AudioProcessor$ag$a(-1, -1, -1);
    public final int ag$a;
    public final int ah$a;
    public final int toString;
    public final int values;

    public AudioProcessor$ag$a(int i, int i2, int i3) {
        this.toString = i;
        this.ag$a = i2;
        this.ah$a = i3;
        this.values = getElevationDegrees.HaptikSDK$b(i3) ? getElevationDegrees.ag$a(i3, i2) : -1;
    }

    public String toString() {
        return "AudioFormat[sampleRate=" + this.toString + ", channelCount=" + this.ag$a + ", encoding=" + this.ah$a + ']';
    }
}
