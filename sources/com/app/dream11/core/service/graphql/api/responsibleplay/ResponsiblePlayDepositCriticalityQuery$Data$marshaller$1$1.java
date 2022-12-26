package com.app.dream11.core.service.graphql.api.responsibleplay;

import com.app.dream11.core.service.graphql.api.responsibleplay.ResponsiblePlayDepositCriticalityQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ResponsiblePlayDepositCriticalityQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ResponsiblePlayDepositCriticalityQuery$Data$marshaller$1$1 INSTANCE = new ResponsiblePlayDepositCriticalityQuery$Data$marshaller$1$1();

    ResponsiblePlayDepositCriticalityQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality getResponsiblePlayDepositCriticality : list) {
            valueof.values(getResponsiblePlayDepositCriticality == null ? null : getResponsiblePlayDepositCriticality.marshaller());
        }
    }
}
