package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
/* loaded from: classes5.dex */
public final /* synthetic */ class DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0 implements Bundleable.Creator {
    public static final /* synthetic */ DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0 INSTANCE = new DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0();

    private /* synthetic */ DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0() {
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final Bundleable fromBundle(Bundle bundle) {
        DefaultTrackSelector.Parameters build;
        build = new DefaultTrackSelector.Parameters.Builder(bundle).build();
        return build;
    }
}
