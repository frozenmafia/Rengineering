package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class kc extends AudioTrack.StreamEventCallback {
    final /* synthetic */ kd a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kc(kd kdVar) {
        this.a = kdVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(ke.B(this.a.a))) {
            ke keVar = this.a.a;
            if (ke.C(keVar) == null || !ke.D(keVar)) {
                return;
            }
            ke.C(keVar).b();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(ke.B(this.a.a))) {
            ke keVar = this.a.a;
            if (ke.C(keVar) == null || !ke.D(keVar)) {
                return;
            }
            ke.C(keVar).b();
        }
    }
}
