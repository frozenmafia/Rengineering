package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.MutablePropertyReference0Impl;
/* loaded from: classes7.dex */
final /* synthetic */ class GPHVideoControls$updatePauseState$1 extends MutablePropertyReference0Impl {
    GPHVideoControls$updatePauseState$1(GPHVideoControls gPHVideoControls) {
        super(gPHVideoControls, GPHVideoControls.class, "player", "getPlayer()Lcom/giphy/sdk/ui/views/GPHVideoPlayer;", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.createFrom
    public Object get() {
        return GPHVideoControls.access$getPlayer$p((GPHVideoControls) this.receiver);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((GPHVideoControls) this.receiver).player = (GPHVideoPlayer) obj;
    }
}
