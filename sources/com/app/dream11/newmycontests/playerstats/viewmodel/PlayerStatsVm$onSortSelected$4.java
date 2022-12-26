package com.app.dream11.newmycontests.playerstats.viewmodel;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
import o.setMeasureRequested;
/* loaded from: classes3.dex */
public final class PlayerStatsVm$onSortSelected$4 extends Lambda implements Styleable.ChangeBounds<setMeasureRequested, setAnimationMatrix> {
    public static final PlayerStatsVm$onSortSelected$4 INSTANCE = new PlayerStatsVm$onSortSelected$4();

    PlayerStatsVm$onSortSelected$4() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(setMeasureRequested setmeasurerequested) {
        invoke2(setmeasurerequested);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(setMeasureRequested setmeasurerequested) {
        runAnimators.ag$a(setmeasurerequested, "it");
        setmeasurerequested.getInitSettings();
    }
}
