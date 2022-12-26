package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HofDefaultFilterQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class HofDefaultFilterQuery$HallOfFame$marshaller$1$1 extends Lambda implements Transition<List<? extends HofDefaultFilterQuery.PromotedTour>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final HofDefaultFilterQuery$HallOfFame$marshaller$1$1 INSTANCE = new HofDefaultFilterQuery$HallOfFame$marshaller$1$1();

    HofDefaultFilterQuery$HallOfFame$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends HofDefaultFilterQuery.PromotedTour> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<HofDefaultFilterQuery.PromotedTour>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HofDefaultFilterQuery.PromotedTour> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (HofDefaultFilterQuery.PromotedTour promotedTour : list) {
            valueof.values(promotedTour == null ? null : promotedTour.marshaller());
        }
    }
}
