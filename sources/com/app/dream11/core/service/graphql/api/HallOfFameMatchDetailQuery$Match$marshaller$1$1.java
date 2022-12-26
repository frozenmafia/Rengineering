package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameMatchDetailQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class HallOfFameMatchDetailQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends HallOfFameMatchDetailQuery.Contest>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final HallOfFameMatchDetailQuery$Match$marshaller$1$1 INSTANCE = new HallOfFameMatchDetailQuery$Match$marshaller$1$1();

    HallOfFameMatchDetailQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends HallOfFameMatchDetailQuery.Contest> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<HallOfFameMatchDetailQuery.Contest>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HallOfFameMatchDetailQuery.Contest> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (HallOfFameMatchDetailQuery.Contest contest : list) {
            valueof.values(contest.marshaller());
        }
    }
}
