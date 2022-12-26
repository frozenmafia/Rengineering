package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GBallTimeline;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GBallTimeline$AggregatedEvent$marshaller$1$2 extends Lambda implements Transition<List<? extends GBallTimeline.TeamPointDetailsInfo2>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GBallTimeline$AggregatedEvent$marshaller$1$2 INSTANCE = new GBallTimeline$AggregatedEvent$marshaller$1$2();

    GBallTimeline$AggregatedEvent$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GBallTimeline.TeamPointDetailsInfo2> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GBallTimeline.TeamPointDetailsInfo2>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GBallTimeline.TeamPointDetailsInfo2> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GBallTimeline.TeamPointDetailsInfo2 teamPointDetailsInfo2 : list) {
            valueof.values(teamPointDetailsInfo2.marshaller());
        }
    }
}
