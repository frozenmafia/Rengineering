package com.app.dream11.core.service.graphql.api;

import kotlin.jvm.internal.Lambda;
import o.OnBackPressedCallback;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class VerifyMediaQuery$variables$1$marshaller$1$1 extends Lambda implements Styleable.ChangeBounds<OnBackPressedCallback.values, setAnimationMatrix> {
    final /* synthetic */ VerifyMediaQuery this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMediaQuery$variables$1$marshaller$1$1(VerifyMediaQuery verifyMediaQuery) {
        super(1);
        this.this$0 = verifyMediaQuery;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(OnBackPressedCallback.values valuesVar) {
        invoke2(valuesVar);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnBackPressedCallback.values valuesVar) {
        runAnimators.ag$a(valuesVar, "listItemWriter");
        for (String str : this.this$0.getId()) {
            valuesVar.values(str);
        }
    }
}
