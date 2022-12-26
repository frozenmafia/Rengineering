package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Player;
/* loaded from: classes4.dex */
public final /* synthetic */ class Player$PositionInfo$$ExternalSyntheticLambda0 implements Bundleable.Creator {
    public static final /* synthetic */ Player$PositionInfo$$ExternalSyntheticLambda0 INSTANCE = new Player$PositionInfo$$ExternalSyntheticLambda0();

    private /* synthetic */ Player$PositionInfo$$ExternalSyntheticLambda0() {
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final Bundleable fromBundle(Bundle bundle) {
        Player.PositionInfo fromBundle;
        fromBundle = Player.PositionInfo.fromBundle(bundle);
        return fromBundle;
    }
}
