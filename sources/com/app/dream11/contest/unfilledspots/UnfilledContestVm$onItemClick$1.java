package com.app.dream11.contest.unfilledspots;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getProgress;
import o.getProgress$ah$a;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
public final class UnfilledContestVm$onItemClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ getProgress this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnfilledContestVm$onItemClick$1(getProgress getprogress) {
        super(0);
        this.this$0 = getprogress;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        getProgress$ah$a HaptikSDK$a = this.this$0.HaptikSDK$a();
        if (HaptikSDK$a == null) {
            return;
        }
        HaptikSDK$a.ah$a(this.this$0);
    }
}
