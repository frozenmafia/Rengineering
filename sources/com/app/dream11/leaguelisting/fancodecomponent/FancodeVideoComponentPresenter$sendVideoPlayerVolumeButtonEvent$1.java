package com.app.dream11.leaguelisting.fancodecomponent;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.access$1200;
import o.setAnimationMatrix;
import o.setType;
/* loaded from: classes6.dex */
public final class FancodeVideoComponentPresenter$sendVideoPlayerVolumeButtonEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ boolean $mute;
    final /* synthetic */ access$1200 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancodeVideoComponentPresenter$sendVideoPlayerVolumeButtonEvent$1(access$1200 access_1200, boolean z) {
        super(0);
        this.this$0 = access_1200;
        this.$mute = z;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setType valueOf = access$1200.valueOf(this.this$0);
        if (valueOf == null) {
            return;
        }
        valueOf.values(this.this$0.a(), this.this$0.onPostMessage(), this.this$0.extraCallbackWithResult(), this.this$0.HaptikSDK$e(), this.$mute);
    }
}
