package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WithdrawalQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class WithdrawalQuery$WithdrawalOptions$marshaller$1$2 extends Lambda implements Transition<List<? extends WithdrawalQuery.Option1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WithdrawalQuery$WithdrawalOptions$marshaller$1$2 INSTANCE = new WithdrawalQuery$WithdrawalOptions$marshaller$1$2();

    WithdrawalQuery$WithdrawalOptions$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends WithdrawalQuery.Option1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<WithdrawalQuery.Option1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<WithdrawalQuery.Option1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (WithdrawalQuery.Option1 option1 : list) {
            valueof.values(option1.marshaller());
        }
    }
}
