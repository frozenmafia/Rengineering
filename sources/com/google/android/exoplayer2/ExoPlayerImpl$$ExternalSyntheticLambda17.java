package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
/* loaded from: classes4.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda17 implements ListenerSet.Event {
    public static final /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda17 INSTANCE = new ExoPlayerImpl$$ExternalSyntheticLambda17();

    private /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda17() {
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((Player.Listener) obj).onPlayerError(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
    }
}
