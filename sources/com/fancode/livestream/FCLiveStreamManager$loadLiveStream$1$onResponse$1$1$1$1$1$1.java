package com.fancode.livestream;

import com.fancode.livestream.type.DAISDKType;
import com.fancode.video.base.VideoSource;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
public final class FCLiveStreamManager$loadLiveStream$1$onResponse$1$1$1$1$1$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ DAISDKType $daisdkType;
    final /* synthetic */ VideoSource $videoSrc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCLiveStreamManager$loadLiveStream$1$onResponse$1$1$1$1$1$1(VideoSource videoSource, DAISDKType dAISDKType) {
        super(0);
        this.$videoSrc = videoSource;
        this.$daisdkType = dAISDKType;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$videoSrc.getInitSettings().ah$a(com.fancode.video.base.DAISDKType.Companion.valueOf(this.$daisdkType.name()));
    }
}
