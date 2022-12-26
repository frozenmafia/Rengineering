package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.CareerStatsBreakup;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class CareerStatsBreakup$ContestsBreakup$marshaller$1$1 extends Lambda implements Transition<List<? extends CareerStatsBreakup.ContestStat>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final CareerStatsBreakup$ContestsBreakup$marshaller$1$1 INSTANCE = new CareerStatsBreakup$ContestsBreakup$marshaller$1$1();

    CareerStatsBreakup$ContestsBreakup$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends CareerStatsBreakup.ContestStat> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<CareerStatsBreakup.ContestStat>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<CareerStatsBreakup.ContestStat> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (CareerStatsBreakup.ContestStat contestStat : list) {
            valueof.values(contestStat.marshaller());
        }
    }
}
