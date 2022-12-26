package com.app.dream11.core.service.graphql.api;

import kotlin.jvm.internal.Lambda;
import o.OnBackPressedCallback;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class JoinLeagueMutation$variables$1$marshaller$1$1 extends Lambda implements Styleable.ChangeBounds<OnBackPressedCallback.values, setAnimationMatrix> {
    final /* synthetic */ JoinLeagueMutation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinLeagueMutation$variables$1$marshaller$1$1(JoinLeagueMutation joinLeagueMutation) {
        super(1);
        this.this$0 = joinLeagueMutation;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(OnBackPressedCallback.values valuesVar) {
        invoke2(valuesVar);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnBackPressedCallback.values valuesVar) {
        runAnimators.ag$a(valuesVar, "listItemWriter");
        for (Number number : this.this$0.getTeamIds()) {
            valuesVar.toString(Integer.valueOf(number.intValue()));
        }
    }
}
