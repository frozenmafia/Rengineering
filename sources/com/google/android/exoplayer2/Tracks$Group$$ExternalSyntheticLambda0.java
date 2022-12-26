package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
/* loaded from: classes4.dex */
public final /* synthetic */ class Tracks$Group$$ExternalSyntheticLambda0 implements Bundleable.Creator {
    public static final /* synthetic */ Tracks$Group$$ExternalSyntheticLambda0 INSTANCE = new Tracks$Group$$ExternalSyntheticLambda0();

    private /* synthetic */ Tracks$Group$$ExternalSyntheticLambda0() {
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final Bundleable fromBundle(Bundle bundle) {
        return TrackGroup.CREATOR.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(Tracks.Group.keyForField(0))));
    }
}
