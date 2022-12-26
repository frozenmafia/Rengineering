package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchMatchInfoFromTourIdQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FetchMatchInfoFromTourIdQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends FetchMatchInfoFromTourIdQuery.Tour>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FetchMatchInfoFromTourIdQuery$Data$marshaller$1$1 INSTANCE = new FetchMatchInfoFromTourIdQuery$Data$marshaller$1$1();

    FetchMatchInfoFromTourIdQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FetchMatchInfoFromTourIdQuery.Tour> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FetchMatchInfoFromTourIdQuery.Tour>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FetchMatchInfoFromTourIdQuery.Tour> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FetchMatchInfoFromTourIdQuery.Tour tour : list) {
            valueof.values(tour == null ? null : tour.marshaller());
        }
    }
}
