package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.MutablePropertyReference0Impl;
/* loaded from: classes7.dex */
final /* synthetic */ class GPHVideoPlayerView$videoPlayer$1 extends MutablePropertyReference0Impl {
    GPHVideoPlayerView$videoPlayer$1(GPHVideoPlayerView gPHVideoPlayerView) {
        super(gPHVideoPlayerView, GPHVideoPlayerView.class, "player", "getPlayer()Lcom/giphy/sdk/ui/views/GPHVideoPlayer;", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.createFrom
    public Object get() {
        return GPHVideoPlayerView.access$getPlayer$p((GPHVideoPlayerView) this.receiver);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((GPHVideoPlayerView) this.receiver).player = (GPHVideoPlayer) obj;
    }
}
