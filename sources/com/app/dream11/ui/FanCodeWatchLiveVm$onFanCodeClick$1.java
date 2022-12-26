package com.app.dream11.ui;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setDynamicShortcuts;
/* loaded from: classes6.dex */
public final class FanCodeWatchLiveVm$onFanCodeClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setDynamicShortcuts this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FanCodeWatchLiveVm$onFanCodeClick$1(setDynamicShortcuts setdynamicshortcuts) {
        super(0);
        this.this$0 = setdynamicshortcuts;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.ah$a().valueOf(this.this$0.values());
    }
}
