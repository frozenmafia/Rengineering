package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyProfileQuery$NextRewards$marshaller$1$1 extends Lambda implements Transition<List<? extends MyProfileQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyProfileQuery$NextRewards$marshaller$1$1 INSTANCE = new MyProfileQuery$NextRewards$marshaller$1$1();

    MyProfileQuery$NextRewards$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyProfileQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyProfileQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyProfileQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyProfileQuery.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}
