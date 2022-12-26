package com.app.dream11.payment.paymentoffers.enteramountbottomsheet;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.ConstraintSet;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class EnterAmountBottomSheet$mEnterAmountBottomSheetPresenter$2 extends Lambda implements Styleable.ArcMotion<ConstraintSet> {
    final /* synthetic */ EnterAmountBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterAmountBottomSheet$mEnterAmountBottomSheetPresenter$2(EnterAmountBottomSheet enterAmountBottomSheet) {
        super(0);
        this.this$0 = enterAmountBottomSheet;
    }

    @Override // o.Styleable.ArcMotion
    public final ConstraintSet invoke() {
        ConstraintSet onTransact = ActionMenuItem.valueOf().onTransact();
        onTransact.values(this.this$0.ah$a());
        return onTransact;
    }
}
