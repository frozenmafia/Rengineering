package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
/* loaded from: classes4.dex */
public final /* synthetic */ class PlaybackException$$ExternalSyntheticLambda0 implements Bundleable.Creator {
    public static final /* synthetic */ PlaybackException$$ExternalSyntheticLambda0 INSTANCE = new PlaybackException$$ExternalSyntheticLambda0();

    private /* synthetic */ PlaybackException$$ExternalSyntheticLambda0() {
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final Bundleable fromBundle(Bundle bundle) {
        return new PlaybackException(bundle);
    }
}
