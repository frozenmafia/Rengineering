package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyContestsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class MyContestsQuery$Matches$marshaller$1$1 extends Lambda implements Transition<List<? extends MyContestsQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyContestsQuery$Matches$marshaller$1$1 INSTANCE = new MyContestsQuery$Matches$marshaller$1$1();

    MyContestsQuery$Matches$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyContestsQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyContestsQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyContestsQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyContestsQuery.Edge edge : list) {
            valueof.values(edge == null ? null : edge.marshaller());
        }
    }
}
