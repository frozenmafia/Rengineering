package com.app.dream11.leaguelisting.brightcovepip;

import kotlin.jvm.internal.Lambda;
import o.Animatable;
import o.Styleable;
import o.setAnimationMatrix;
import o.setType;
/* loaded from: classes3.dex */
public final class BrightCovePipPresenter$sendVideoPlayerForwardRewindButtonEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ boolean $isRewindButton;
    final /* synthetic */ Animatable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrightCovePipPresenter$sendVideoPlayerForwardRewindButtonEvent$1(Animatable animatable, boolean z) {
        super(0);
        this.this$0 = animatable;
        this.$isRewindButton = z;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setType ag$a = Animatable.ag$a(this.this$0);
        if (ag$a == null) {
            return;
        }
        ag$a.ah$a(this.this$0.HaptikWebView(), this.this$0.extraCallbackWithResult(), this.this$0.aj$a(), this.this$0.HaptikSDK$d(), this.$isRewindButton);
    }
}
