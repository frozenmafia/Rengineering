package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* loaded from: classes4.dex */
final class jp {
    private final AudioTrack a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioTimestamp f1120b = new AudioTimestamp();
    private long c;
    private long d;
    private long e;

    public jp(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.e;
    }

    public final long b() {
        return this.f1120b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.a.getTimestamp(this.f1120b);
        if (timestamp) {
            long j = this.f1120b.framePosition;
            if (this.d > j) {
                this.c++;
            }
            this.d = j;
            this.e = j + (this.c << 32);
        }
        return timestamp;
    }
}
