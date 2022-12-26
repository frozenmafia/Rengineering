package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class iy {
    public static final iy a = new iy(-1, -1, -1);

    /* renamed from: b  reason: collision with root package name */
    public final int f1109b;
    public final int c;
    public final int d;
    public final int e;

    public iy(int i, int i2, int i3) {
        this.f1109b = i;
        this.c = i2;
        this.d = i3;
        this.e = cp.Y(i3) ? cp.l(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f1109b;
        int i2 = this.c;
        int i3 = this.d;
        return "AudioFormat[sampleRate=" + i + ", channelCount=" + i2 + ", encoding=" + i3 + "]";
    }
}
