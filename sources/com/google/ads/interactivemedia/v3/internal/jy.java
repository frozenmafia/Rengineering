package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class jy {
    public final s a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1126b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ja[] i;

    public jy(s sVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, ja[] jaVarArr) {
        this.a = sVar;
        this.f1126b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = jaVarArr;
    }

    private static AudioAttributes d(f fVar, boolean z) {
        if (z) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return fVar.a().a;
    }

    public final long a(long j) {
        return (j * 1000000) / this.e;
    }

    public final AudioTrack b(boolean z, f fVar, int i) throws jk {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            if (cp.a >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(d(fVar, z)).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
            } else if (cp.a < 21) {
                int i2 = fVar.c;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.e, this.f, this.g, this.h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.e, this.f, this.g, this.h, 1, i);
                }
            } else {
                AudioAttributes d = d(fVar, z);
                build = new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build();
                audioTrack = new AudioTrack(d, build, this.h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new jk(state, this.e, this.f, this.h, this.a, c(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new jk(0, this.e, this.f, this.h, this.a, c(), e);
        }
    }

    public final boolean c() {
        return this.c == 1;
    }
}
