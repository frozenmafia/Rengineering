package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ContestListForGroupQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestListForGroupQuery$GetContestListGroup$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestListForGroupQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestListForGroupQuery$GetContestListGroup$marshaller$1$1 INSTANCE = new ContestListForGroupQuery$GetContestListGroup$marshaller$1$1();

    ContestListForGroupQuery$GetContestListGroup$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestListForGroupQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestListForGroupQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestListForGroupQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestListForGroupQuery.Edge edge : list) {
            valueof.values(edge == null ? null : edge.marshaller());
        }
    }
}
