package com.app.dream11.newmycontests.playerstats.presenter;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
import o.setDebugSolverName;
/* loaded from: classes3.dex */
public final class PlayerStatsPresenter$sendPerfEventOnTabLoad$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $tabSelected;
    final /* synthetic */ setDebugSolverName this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStatsPresenter$sendPerfEventOnTabLoad$1(setDebugSolverName setdebugsolvername, String str) {
        super(0);
        this.this$0 = setdebugsolvername;
        this.$tabSelected = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (runAnimators.values((Object) this.this$0.HaptikSDK$b(), (Object) "Contest Home Post Round Lock")) {
            setDebugSolverName.valueOf(this.this$0, this.$tabSelected);
        } else if (runAnimators.values((Object) this.this$0.HaptikSDK$b(), (Object) "Contest Detail Post Round Lock")) {
            setDebugSolverName.ah$a(this.this$0, this.$tabSelected);
        }
    }
}
