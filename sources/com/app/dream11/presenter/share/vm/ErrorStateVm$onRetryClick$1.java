package com.app.dream11.presenter.share.vm;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getInsetDodgeRect;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class ErrorStateVm$onRetryClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ getInsetDodgeRect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorStateVm$onRetryClick$1(getInsetDodgeRect getinsetdodgerect) {
        super(0);
        this.this$0 = getinsetdodgerect;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.ag$a().HaptikSDK$c();
    }
}
