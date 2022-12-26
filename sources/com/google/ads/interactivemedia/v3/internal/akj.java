package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
/* loaded from: classes4.dex */
public final class akj extends aiu implements StreamDisplayContainer {
    private VideoStreamPlayer a;

    public akj(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        super(viewGroup);
        this.a = videoStreamPlayer;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamDisplayContainer
    public final VideoStreamPlayer getVideoStreamPlayer() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamDisplayContainer
    public final void setVideoStreamPlayer(VideoStreamPlayer videoStreamPlayer) {
        atc.k(videoStreamPlayer);
        this.a = videoStreamPlayer;
    }
}
