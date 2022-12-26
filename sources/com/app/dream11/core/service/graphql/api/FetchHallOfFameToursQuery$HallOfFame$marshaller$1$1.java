package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchHallOfFameToursQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FetchHallOfFameToursQuery$HallOfFame$marshaller$1$1 extends Lambda implements Transition<List<? extends FetchHallOfFameToursQuery.Tour>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FetchHallOfFameToursQuery$HallOfFame$marshaller$1$1 INSTANCE = new FetchHallOfFameToursQuery$HallOfFame$marshaller$1$1();

    FetchHallOfFameToursQuery$HallOfFame$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FetchHallOfFameToursQuery.Tour> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FetchHallOfFameToursQuery.Tour>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FetchHallOfFameToursQuery.Tour> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FetchHallOfFameToursQuery.Tour tour : list) {
            valueof.values(tour.marshaller());
        }
    }
}
