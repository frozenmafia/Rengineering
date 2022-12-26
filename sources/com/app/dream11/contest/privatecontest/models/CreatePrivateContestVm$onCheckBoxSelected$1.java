package com.app.dream11.contest.privatecontest.models;

import kotlin.jvm.internal.Lambda;
import o.AppCompatDelegateImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class CreatePrivateContestVm$onCheckBoxSelected$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ AppCompatDelegateImpl.AnonymousClass7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePrivateContestVm$onCheckBoxSelected$1(AppCompatDelegateImpl.AnonymousClass7 anonymousClass7) {
        super(0);
        this.this$0 = anonymousClass7;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Boolean invoke = this.this$0.getInterfaceDescriptor().invoke();
        if (invoke == null) {
            invoke = false;
        }
        this.this$0.getInterfaceDescriptor().onNext(Boolean.valueOf(!invoke.booleanValue()));
    }
}
