package com.app.dream11.login;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.readFamily;
import o.setAnimationMatrix;
import o.setupMotionViews;
/* loaded from: classes3.dex */
public final class LoginFeature$sendOtpLoadedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $sourceForEvent;
    final /* synthetic */ setupMotionViews this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFeature$sendOtpLoadedEvent$1(setupMotionViews setupmotionviews, String str) {
        super(0);
        this.this$0 = setupmotionviews;
        this.$sourceForEvent = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setupMotionViews setupmotionviews = this.this$0;
        readFamily.toString(setupmotionviews, setupmotionviews.aj$a(), this.$sourceForEvent, this.this$0.getUtmRedirection());
    }
}
