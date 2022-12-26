package com.app.dream11.accountdeactivated;

import kotlin.jvm.internal.Lambda;
import o.NonNull;
import o.Styleable;
import o.onGetSmallIconBitmap;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class AccountDeactivatedPresenter$sendScreenloadedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ NonNull this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDeactivatedPresenter$sendScreenloadedEvent$1(NonNull nonNull) {
        super(0);
        this.this$0 = nonNull;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        onGetSmallIconBitmap.values valuesVar = onGetSmallIconBitmap.ag$a;
        String simpleName = this.this$0.getClass().getSimpleName();
        runAnimators.ah$a(simpleName, "javaClass.simpleName");
        valuesVar.toString(simpleName, null);
    }
}
