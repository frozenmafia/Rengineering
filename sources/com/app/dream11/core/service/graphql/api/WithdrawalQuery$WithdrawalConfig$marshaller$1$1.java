package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WithdrawalQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class WithdrawalQuery$WithdrawalConfig$marshaller$1$1 extends Lambda implements Transition<List<? extends WithdrawalQuery.Option>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WithdrawalQuery$WithdrawalConfig$marshaller$1$1 INSTANCE = new WithdrawalQuery$WithdrawalConfig$marshaller$1$1();

    WithdrawalQuery$WithdrawalConfig$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends WithdrawalQuery.Option> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<WithdrawalQuery.Option>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<WithdrawalQuery.Option> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (WithdrawalQuery.Option option : list) {
            valueof.values(option.marshaller());
        }
    }
}
