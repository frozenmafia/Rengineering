package com.app.dream11.newmycontests.playerstats.viewmodel;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setMeasureRequested;
/* loaded from: classes3.dex */
public final class SortVm$onClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setMeasureRequested this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortVm$onClick$1(setMeasureRequested setmeasurerequested) {
        super(0);
        this.this$0 = setmeasurerequested;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.HaptikWebView();
        this.this$0.values().valueOf(this.this$0);
    }
}
