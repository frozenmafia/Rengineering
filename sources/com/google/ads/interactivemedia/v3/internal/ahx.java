package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
/* loaded from: classes4.dex */
public final class ahx extends aiu implements AdDisplayContainer {
    private VideoAdPlayer a;

    public ahx(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        super(viewGroup);
        this.a = videoAdPlayer;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdDisplayContainer
    public final VideoAdPlayer getPlayer() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdDisplayContainer
    public final void setPlayer(VideoAdPlayer videoAdPlayer) {
        atc.k(videoAdPlayer);
        this.a = videoAdPlayer;
    }

    public ahx(Context context, VideoAdPlayer videoAdPlayer) {
        this(new aiq(context), videoAdPlayer);
    }
}
