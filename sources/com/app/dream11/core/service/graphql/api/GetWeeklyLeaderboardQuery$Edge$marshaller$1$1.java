package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeklyLeaderboardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetWeeklyLeaderboardQuery$Edge$marshaller$1$1 extends Lambda implements Transition<List<? extends GetWeeklyLeaderboardQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetWeeklyLeaderboardQuery$Edge$marshaller$1$1 INSTANCE = new GetWeeklyLeaderboardQuery$Edge$marshaller$1$1();

    GetWeeklyLeaderboardQuery$Edge$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetWeeklyLeaderboardQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetWeeklyLeaderboardQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetWeeklyLeaderboardQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetWeeklyLeaderboardQuery.Artwork artwork : list) {
            valueof.values(artwork == null ? null : artwork.marshaller());
        }
    }
}
