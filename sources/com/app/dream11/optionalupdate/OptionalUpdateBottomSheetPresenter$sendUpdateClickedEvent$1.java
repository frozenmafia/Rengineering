package com.app.dream11.optionalupdate;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isPercent;
import o.readFamily;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class OptionalUpdateBottomSheetPresenter$sendUpdateClickedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ isPercent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionalUpdateBottomSheetPresenter$sendUpdateClickedEvent$1(isPercent ispercent) {
        super(0);
        this.this$0 = ispercent;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        readFamily.values(this.this$0.HaptikSDK$a(), "UpdateBottomSheet", "active", null, isPercent.ah$a.ag$a());
    }
}
