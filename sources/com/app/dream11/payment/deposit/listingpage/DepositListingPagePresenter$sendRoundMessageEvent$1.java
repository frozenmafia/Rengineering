package com.app.dream11.payment.deposit.listingpage;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.updateMatrix;
/* loaded from: classes3.dex */
public final class DepositListingPagePresenter$sendRoundMessageEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $warningMsg;
    final /* synthetic */ updateMatrix this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositListingPagePresenter$sendRoundMessageEvent$1(updateMatrix updatematrix, String str) {
        super(0);
        this.this$0 = updatematrix;
        this.$warningMsg = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.ah$a().trackEvent(new NewEvents("WarningMessageShown").addProperty("warningMessage", this.$warningMsg), new EventTracker[0]);
    }
}
