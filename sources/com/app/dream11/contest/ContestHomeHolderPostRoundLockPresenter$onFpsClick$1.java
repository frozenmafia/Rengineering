package com.app.dream11.contest;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.readFamily;
import o.setAnimationMatrix;
import o.setListNavigationCallbacks;
/* loaded from: classes.dex */
public final class ContestHomeHolderPostRoundLockPresenter$onFpsClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setListNavigationCallbacks this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestHomeHolderPostRoundLockPresenter$onFpsClick$1(setListNavigationCallbacks setlistnavigationcallbacks) {
        super(0);
        this.this$0 = setlistnavigationcallbacks;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        readFamily.values(setListNavigationCallbacks.toString(this.this$0), "My Contest", this.this$0.HaptikSDK$c(), this.this$0.ah$a());
    }
}
