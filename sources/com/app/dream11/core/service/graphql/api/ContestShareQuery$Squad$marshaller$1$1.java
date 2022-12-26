package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestShareQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestShareQuery$Squad$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestShareQuery.FlagWithName>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestShareQuery$Squad$marshaller$1$1 INSTANCE = new ContestShareQuery$Squad$marshaller$1$1();

    ContestShareQuery$Squad$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestShareQuery.FlagWithName> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestShareQuery.FlagWithName>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestShareQuery.FlagWithName> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestShareQuery.FlagWithName flagWithName : list) {
            valueof.values(flagWithName.marshaller());
        }
    }
}
