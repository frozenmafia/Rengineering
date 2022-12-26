package com.app.dream11.reaction.views;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAndAllowWhileIdle;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final /* synthetic */ class ReactionPopup$view$2$2$1 extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactionPopup$view$2$2$1(Object obj) {
        super(0, obj, setAndAllowWhileIdle.class, "dismiss", "dismiss()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((setAndAllowWhileIdle) this.receiver).dismiss();
    }
}
