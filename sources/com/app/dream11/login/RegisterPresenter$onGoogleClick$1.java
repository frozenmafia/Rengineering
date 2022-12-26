package com.app.dream11.login;

import kotlin.jvm.internal.Lambda;
import o.MotionScene;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class RegisterPresenter$onGoogleClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ MotionScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterPresenter$onGoogleClick$1(MotionScene motionScene) {
        super(0);
        this.this$0 = motionScene;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MotionScene.ah$a(this.this$0, "Google");
    }
}
