package com.app.dream11.ui;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setIntents;
/* loaded from: classes3.dex */
public final class BlueTooltipVM$onCloseClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setIntents this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlueTooltipVM$onCloseClicked$1(setIntents setintents) {
        super(0);
        this.this$0 = setintents;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.toString(false);
        this.this$0.values().ag$a();
    }
}
