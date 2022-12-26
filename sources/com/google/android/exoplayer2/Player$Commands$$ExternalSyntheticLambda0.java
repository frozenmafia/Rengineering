package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Player;
/* loaded from: classes4.dex */
public final /* synthetic */ class Player$Commands$$ExternalSyntheticLambda0 implements Bundleable.Creator {
    public static final /* synthetic */ Player$Commands$$ExternalSyntheticLambda0 INSTANCE = new Player$Commands$$ExternalSyntheticLambda0();

    private /* synthetic */ Player$Commands$$ExternalSyntheticLambda0() {
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final Bundleable fromBundle(Bundle bundle) {
        Player.Commands fromBundle;
        fromBundle = Player.Commands.fromBundle(bundle);
        return fromBundle;
    }
}
