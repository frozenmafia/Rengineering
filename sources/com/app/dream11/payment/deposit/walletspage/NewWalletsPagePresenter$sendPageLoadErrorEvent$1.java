package com.app.dream11.payment.deposit.walletspage;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.constrainDefaultHeight;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class NewWalletsPagePresenter$sendPageLoadErrorEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $errorMsg;
    final /* synthetic */ constrainDefaultHeight this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewWalletsPagePresenter$sendPageLoadErrorEvent$1(constrainDefaultHeight constraindefaultheight, String str) {
        super(0);
        this.this$0 = constraindefaultheight;
        this.$errorMsg = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.valueOf().trackEvent(new NewEvents("WalletPageLoadError").addProperty("errorMessage", this.$errorMsg), new EventTracker[0]);
    }
}
