package com.app.dream11.payment.amountSelection;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.BaselineDimensionDependency;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class AmountSelectionPresenter$getBalanceDetails$2$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    public AmountSelectionPresenter$getBalanceDetails$2$1(Object obj) {
        super(1, obj, BaselineDimensionDependency.class, "onBalanceFailed", "onBalanceFailed(Ljava/lang/Throwable;)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        runAnimators.ag$a(th, "p0");
        BaselineDimensionDependency.toString((BaselineDimensionDependency) this.receiver, th);
    }
}
