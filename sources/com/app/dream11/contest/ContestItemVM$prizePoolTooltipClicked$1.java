package com.app.dream11.contest;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class ContestItemVM$prizePoolTooltipClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $message;
    final /* synthetic */ ContestItemVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContestItemVM$prizePoolTooltipClicked$1(ContestItemVM contestItemVM, String str) {
        super(0);
        this.this$0 = contestItemVM;
        this.$message = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.ICustomTabsCallback$Stub().onTooltipClicked("CurrentPrizePool", this.this$0.ah$b().getId(), this.$message, "ContestDetails");
    }
}
