package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.WeeklyLeaderboardRankFragment;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class WeeklyLeaderboardRankFragment$marshaller$1$1 extends Lambda implements Transition<List<? extends WeeklyLeaderboardRankFragment.TourImage>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WeeklyLeaderboardRankFragment$marshaller$1$1 INSTANCE = new WeeklyLeaderboardRankFragment$marshaller$1$1();

    WeeklyLeaderboardRankFragment$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends WeeklyLeaderboardRankFragment.TourImage> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<WeeklyLeaderboardRankFragment.TourImage>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<WeeklyLeaderboardRankFragment.TourImage> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (WeeklyLeaderboardRankFragment.TourImage tourImage : list) {
            valueof.values(tourImage == null ? null : tourImage.marshaller());
        }
    }
}
