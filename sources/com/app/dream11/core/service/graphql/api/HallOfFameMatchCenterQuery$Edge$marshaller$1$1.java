package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameMatchCenterQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class HallOfFameMatchCenterQuery$Edge$marshaller$1$1 extends Lambda implements Transition<List<? extends HallOfFameMatchCenterQuery.Contest>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final HallOfFameMatchCenterQuery$Edge$marshaller$1$1 INSTANCE = new HallOfFameMatchCenterQuery$Edge$marshaller$1$1();

    HallOfFameMatchCenterQuery$Edge$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends HallOfFameMatchCenterQuery.Contest> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<HallOfFameMatchCenterQuery.Contest>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HallOfFameMatchCenterQuery.Contest> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (HallOfFameMatchCenterQuery.Contest contest : list) {
            valueof.values(contest.marshaller());
        }
    }
}
