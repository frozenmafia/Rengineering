package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeklyLeaderboardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetWeeklyLeaderboardQuery$Edge$marshaller$1$2 extends Lambda implements Transition<List<? extends GetWeeklyLeaderboardQuery.ProfilePic>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetWeeklyLeaderboardQuery$Edge$marshaller$1$2 INSTANCE = new GetWeeklyLeaderboardQuery$Edge$marshaller$1$2();

    GetWeeklyLeaderboardQuery$Edge$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetWeeklyLeaderboardQuery.ProfilePic> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetWeeklyLeaderboardQuery.ProfilePic>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetWeeklyLeaderboardQuery.ProfilePic> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetWeeklyLeaderboardQuery.ProfilePic profilePic : list) {
            valueof.values(profilePic == null ? null : profilePic.marshaller());
        }
    }
}
