package com.app.dream11.contest.ui;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CommentaryPresenter$sendPerfEventOnTabLoad$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ CommentaryPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentaryPresenter$sendPerfEventOnTabLoad$1(CommentaryPresenter commentaryPresenter) {
        super(0);
        this.this$0 = commentaryPresenter;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (runAnimators.values((Object) this.this$0.HaptikSDK$c(), (Object) "Contest Home Post Round Lock")) {
            this.this$0.ak();
        } else if (runAnimators.values((Object) this.this$0.HaptikSDK$c(), (Object) "Contest Detail Post Round Lock")) {
            this.this$0.onXdkEvent();
        }
    }
}
