package com.dreampay.ui.upi;

import com.dreampay.commons.upi.UpiApp;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UPIIntentFragment$init$adapter$1 extends Lambda implements Styleable.ChangeBounds<UpiApp, setAnimationMatrix> {
    final /* synthetic */ UPIIntentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UPIIntentFragment$init$adapter$1(UPIIntentFragment uPIIntentFragment) {
        super(1);
        this.this$0 = uPIIntentFragment;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(UpiApp upiApp) {
        invoke2(upiApp);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(UpiApp upiApp) {
        runAnimators.ag$a(upiApp, "it");
        this.this$0.ah$a(upiApp);
    }
}
