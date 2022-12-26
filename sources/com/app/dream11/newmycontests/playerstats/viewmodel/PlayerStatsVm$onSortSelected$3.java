package com.app.dream11.newmycontests.playerstats.viewmodel;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setMeasureRequested;
/* loaded from: classes3.dex */
public final class PlayerStatsVm$onSortSelected$3 extends Lambda implements Styleable.ChangeBounds<setMeasureRequested, Boolean> {
    final /* synthetic */ setMeasureRequested $sortVm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStatsVm$onSortSelected$3(setMeasureRequested setmeasurerequested) {
        super(1);
        this.$sortVm = setmeasurerequested;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(setMeasureRequested setmeasurerequested) {
        runAnimators.ag$a(setmeasurerequested, "it");
        return Boolean.valueOf(!runAnimators.values(setmeasurerequested, this.$sortVm));
    }
}
