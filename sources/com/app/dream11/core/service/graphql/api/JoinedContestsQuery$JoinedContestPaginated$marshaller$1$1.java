package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.JoinedContestsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class JoinedContestsQuery$JoinedContestPaginated$marshaller$1$1 extends Lambda implements Transition<List<? extends JoinedContestsQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final JoinedContestsQuery$JoinedContestPaginated$marshaller$1$1 INSTANCE = new JoinedContestsQuery$JoinedContestPaginated$marshaller$1$1();

    JoinedContestsQuery$JoinedContestPaginated$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends JoinedContestsQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<JoinedContestsQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<JoinedContestsQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (JoinedContestsQuery.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}
