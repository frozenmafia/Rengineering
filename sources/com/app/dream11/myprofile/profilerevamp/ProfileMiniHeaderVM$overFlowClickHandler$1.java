package com.app.dream11.myprofile.profilerevamp;

import kotlin.jvm.internal.Lambda;
import o.ConstraintReference;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class ProfileMiniHeaderVM$overFlowClickHandler$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ConstraintReference.IncorrectConstraintException this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileMiniHeaderVM$overFlowClickHandler$1(ConstraintReference.IncorrectConstraintException incorrectConstraintException) {
        super(0);
        this.this$0 = incorrectConstraintException;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.invoke().valueOf();
    }
}
