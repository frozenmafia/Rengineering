package com.app.dream11.payment.deposit.walletspage;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.constrainDefaultHeight;
import o.readFamily;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class NewWalletsPagePresenter$sendCreateDreamPayOrderEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ double $rechargeAmount;
    final /* synthetic */ constrainDefaultHeight this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewWalletsPagePresenter$sendCreateDreamPayOrderEvent$1(constrainDefaultHeight constraindefaultheight, double d) {
        super(0);
        this.this$0 = constraindefaultheight;
        this.$rechargeAmount = d;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        readFamily.toString(this.this$0.valueOf(), Double.valueOf(this.$rechargeAmount));
    }
}
