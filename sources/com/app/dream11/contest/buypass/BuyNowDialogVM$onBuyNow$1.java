package com.app.dream11.contest.buypass;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onKeyDownPanel;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class BuyNowDialogVM$onBuyNow$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ onKeyDownPanel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNowDialogVM$onBuyNow$1(onKeyDownPanel onkeydownpanel) {
        super(0);
        this.this$0 = onkeydownpanel;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        onKeyDownPanel.valueOf valueof;
        valueof = this.this$0.HaptikSDK$a;
        valueof.ah$a();
    }
}
