package com.app.dream11.newmycontests.playerstats.viewmodel;

import com.app.dream11.ui.picker.PickerModel;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setHorizontalDimensionBehaviour;
import o.setHorizontalDimensionBehaviour$ag$a;
/* loaded from: classes3.dex */
public final class PlayerStatsVm$onClickPlayerStatsByContest$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setHorizontalDimensionBehaviour this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStatsVm$onClickPlayerStatsByContest$1(setHorizontalDimensionBehaviour sethorizontaldimensionbehaviour) {
        super(0);
        this.this$0 = sethorizontaldimensionbehaviour;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setHorizontalDimensionBehaviour$ag$a sethorizontaldimensionbehaviour_ag_a;
        PickerModel pickerModel;
        sethorizontaldimensionbehaviour_ag_a = this.this$0.toString;
        pickerModel = this.this$0.values;
        sethorizontaldimensionbehaviour_ag_a.ah$a(pickerModel);
    }
}
