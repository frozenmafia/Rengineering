package com.app.dream11.myprofile.miniprofile;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getVerticalChainStyle;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class MiniProfilePresenter$onCareerStatsWinRateInfoIconClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ getVerticalChainStyle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProfilePresenter$onCareerStatsWinRateInfoIconClick$1(getVerticalChainStyle getverticalchainstyle) {
        super(0);
        this.this$0 = getverticalchainstyle;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        getVerticalChainStyle.values(this.this$0, "win_rate_info");
    }
}
