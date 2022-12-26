package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AccountQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class AccountQuery$Account$marshaller$1$2 extends Lambda implements Transition<List<? extends AccountQuery.DepositExpiration>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final AccountQuery$Account$marshaller$1$2 INSTANCE = new AccountQuery$Account$marshaller$1$2();

    AccountQuery$Account$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends AccountQuery.DepositExpiration> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<AccountQuery.DepositExpiration>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<AccountQuery.DepositExpiration> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (AccountQuery.DepositExpiration depositExpiration : list) {
            valueof.values(depositExpiration == null ? null : depositExpiration.marshaller());
        }
    }
}
