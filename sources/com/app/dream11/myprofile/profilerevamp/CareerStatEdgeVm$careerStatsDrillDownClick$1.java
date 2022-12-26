package com.app.dream11.myprofile.profilerevamp;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.topToTop;
/* loaded from: classes6.dex */
public final class CareerStatEdgeVm$careerStatsDrillDownClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ topToTop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CareerStatEdgeVm$careerStatsDrillDownClick$1(topToTop toptotop) {
        super(0);
        this.this$0 = toptotop;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getInitSettings().ah$a("careerstats");
    }
}
