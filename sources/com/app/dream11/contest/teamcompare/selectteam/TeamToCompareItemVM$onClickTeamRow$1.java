package com.app.dream11.contest.teamcompare.selectteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.calculateTwilight;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
public final class TeamToCompareItemVM$onClickTeamRow$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ calculateTwilight this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamToCompareItemVM$onClickTeamRow$1(calculateTwilight calculatetwilight) {
        super(0);
        this.this$0 = calculatetwilight;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        calculateTwilight.valueOf values;
        if (!this.this$0.HaptikWebView() || (values = this.this$0.values()) == null) {
            return;
        }
        values.toString(this.this$0);
    }
}
