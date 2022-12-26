package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AccountQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class AccountQuery$Account$marshaller$1$1 extends Lambda implements Transition<List<? extends AccountQuery.CashBonusExpiration>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final AccountQuery$Account$marshaller$1$1 INSTANCE = new AccountQuery$Account$marshaller$1$1();

    AccountQuery$Account$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends AccountQuery.CashBonusExpiration> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<AccountQuery.CashBonusExpiration>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<AccountQuery.CashBonusExpiration> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (AccountQuery.CashBonusExpiration cashBonusExpiration : list) {
            valueof.values(cashBonusExpiration == null ? null : cashBonusExpiration.marshaller());
        }
    }
}
