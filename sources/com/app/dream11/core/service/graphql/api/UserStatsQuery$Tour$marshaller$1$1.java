package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserStatsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class UserStatsQuery$Tour$marshaller$1$1 extends Lambda implements Transition<List<? extends UserStatsQuery.Week>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final UserStatsQuery$Tour$marshaller$1$1 INSTANCE = new UserStatsQuery$Tour$marshaller$1$1();

    UserStatsQuery$Tour$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends UserStatsQuery.Week> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<UserStatsQuery.Week>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<UserStatsQuery.Week> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (UserStatsQuery.Week week : list) {
            valueof.values(week.marshaller());
        }
    }
}
