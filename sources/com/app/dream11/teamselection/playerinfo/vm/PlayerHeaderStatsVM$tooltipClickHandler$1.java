package com.app.dream11.teamselection.playerinfo.vm;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.areUnusedAppRestrictionsAvailable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class PlayerHeaderStatsVM$tooltipClickHandler$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ areUnusedAppRestrictionsAvailable.toString $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerHeaderStatsVM$tooltipClickHandler$1(areUnusedAppRestrictionsAvailable.toString tostring) {
        super(0);
        this.$callback = tostring;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$callback.HaptikSDK$c();
    }
}
