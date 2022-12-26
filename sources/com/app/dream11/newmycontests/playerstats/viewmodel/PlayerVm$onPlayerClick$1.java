package com.app.dream11.newmycontests.playerstats.viewmodel;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setMinWidth;
/* loaded from: classes3.dex */
public final class PlayerVm$onPlayerClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setMinWidth.valueOf $callback;
    final /* synthetic */ setMinWidth this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerVm$onPlayerClick$1(setMinWidth.valueOf valueof, setMinWidth setminwidth) {
        super(0);
        this.$callback = valueof;
        this.this$0 = setminwidth;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$callback.ah$a(this.this$0.HaptikSDK$b());
    }
}
