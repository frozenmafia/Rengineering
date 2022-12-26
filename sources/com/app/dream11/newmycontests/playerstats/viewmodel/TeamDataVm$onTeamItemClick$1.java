package com.app.dream11.newmycontests.playerstats.viewmodel;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setLength;
/* loaded from: classes3.dex */
public final class TeamDataVm$onTeamItemClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setLength.toString $callback;
    final /* synthetic */ setLength this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamDataVm$onTeamItemClick$1(setLength.toString tostring, setLength setlength) {
        super(0);
        this.$callback = tostring;
        this.this$0 = setlength;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$callback.ah$a(this.this$0);
    }
}
