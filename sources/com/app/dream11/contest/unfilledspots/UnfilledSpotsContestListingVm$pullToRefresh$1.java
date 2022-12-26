package com.app.dream11.contest.unfilledspots;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setArrowShaftLength;
/* loaded from: classes2.dex */
public final class UnfilledSpotsContestListingVm$pullToRefresh$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setArrowShaftLength this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnfilledSpotsContestListingVm$pullToRefresh$1(setArrowShaftLength setarrowshaftlength) {
        super(0);
        this.this$0 = setarrowshaftlength;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.values().HaptikWebView();
    }
}
