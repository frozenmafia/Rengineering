package com.app.dream11.core.service.graphql.api.profile.careerstatsdrilldown;

import kotlin.jvm.internal.Lambda;
import o.OnBackPressedCallback;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class CareerStatsDrillDownQuery$variables$1$marshaller$1$1 extends Lambda implements Styleable.ChangeBounds<OnBackPressedCallback.values, setAnimationMatrix> {
    final /* synthetic */ CareerStatsDrillDownQuery this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareerStatsDrillDownQuery$variables$1$marshaller$1$1(CareerStatsDrillDownQuery careerStatsDrillDownQuery) {
        super(1);
        this.this$0 = careerStatsDrillDownQuery;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(OnBackPressedCallback.values valuesVar) {
        invoke2(valuesVar);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnBackPressedCallback.values valuesVar) {
        runAnimators.ag$a(valuesVar, "listItemWriter");
        for (String str : this.this$0.getSites()) {
            valuesVar.values(str);
        }
    }
}
