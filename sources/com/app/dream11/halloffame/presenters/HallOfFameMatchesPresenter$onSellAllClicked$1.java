package com.app.dream11.halloffame.presenters;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.keyAt;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class HallOfFameMatchesPresenter$onSellAllClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ HallOfFameMatchGFragment $roundData;
    final /* synthetic */ keyAt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HallOfFameMatchesPresenter$onSellAllClicked$1(keyAt keyat, HallOfFameMatchGFragment hallOfFameMatchGFragment) {
        super(0);
        this.this$0 = keyat;
        this.$roundData = hallOfFameMatchGFragment;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.ag$a("HOFViewAllClicked", this.$roundData);
    }
}
