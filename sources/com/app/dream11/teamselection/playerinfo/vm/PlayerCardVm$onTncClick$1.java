package com.app.dream11.teamselection.playerinfo.vm;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.modeToMode$ah$a;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class PlayerCardVm$onTncClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ modeToMode$ah$a $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerCardVm$onTncClick$1(modeToMode$ah$a modetomode_ah_a) {
        super(0);
        this.$callback = modetomode_ah_a;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$callback.ag$a();
    }
}
