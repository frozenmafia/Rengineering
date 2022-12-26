package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameWinnerListQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class HallOfFameWinnerListQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends HallOfFameWinnerListQuery.Contest>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final HallOfFameWinnerListQuery$Match$marshaller$1$1 INSTANCE = new HallOfFameWinnerListQuery$Match$marshaller$1$1();

    HallOfFameWinnerListQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends HallOfFameWinnerListQuery.Contest> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<HallOfFameWinnerListQuery.Contest>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HallOfFameWinnerListQuery.Contest> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (HallOfFameWinnerListQuery.Contest contest : list) {
            valueof.values(contest.marshaller());
        }
    }
}
