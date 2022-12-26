package com.app.dream11.payment.amountSelection;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.BaselineDimensionDependency;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AmountSelectionFragment$amountSelectionPresenter$2 extends Lambda implements Styleable.ArcMotion<BaselineDimensionDependency> {
    final /* synthetic */ AmountSelectionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountSelectionFragment$amountSelectionPresenter$2(AmountSelectionFragment amountSelectionFragment) {
        super(0);
        this.this$0 = amountSelectionFragment;
    }

    @Override // o.Styleable.ArcMotion
    public final BaselineDimensionDependency invoke() {
        return ActionMenuItem.valueOf().toString(this.this$0.ag$a());
    }
}
