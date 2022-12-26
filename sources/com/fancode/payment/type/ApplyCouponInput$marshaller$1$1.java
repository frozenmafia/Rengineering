package com.fancode.payment.type;

import kotlin.jvm.internal.Lambda;
import o.OnBackPressedCallback;
import o.Styleable;
import o.registerIn;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class ApplyCouponInput$marshaller$1$1 extends Lambda implements Styleable.ChangeBounds<OnBackPressedCallback.values, setAnimationMatrix> {
    final /* synthetic */ registerIn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyCouponInput$marshaller$1$1(registerIn registerin) {
        super(1);
        this.this$0 = registerin;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(OnBackPressedCallback.values valuesVar) {
        invoke2(valuesVar);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnBackPressedCallback.values valuesVar) {
        runAnimators.ag$a(valuesVar, "listItemWriter");
        for (String str : this.this$0.ag$a()) {
            valuesVar.values(str);
        }
    }
}
