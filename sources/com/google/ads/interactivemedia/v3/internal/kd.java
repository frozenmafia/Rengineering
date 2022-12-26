package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
/* loaded from: classes4.dex */
final class kd {
    final /* synthetic */ ke a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f1129b = new Handler(Looper.myLooper());
    private final AudioTrack.StreamEventCallback c = new kc(this);

    public kd(ke keVar) {
        this.a = keVar;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new vr(this.f1129b, 1), this.c);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.c);
        this.f1129b.removeCallbacksAndMessages(null);
    }
}
