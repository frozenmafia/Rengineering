package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GBallTimeline;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GBallTimeline$marshaller$1$3 extends Lambda implements Transition<List<? extends GBallTimeline.AggregatedEvent>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GBallTimeline$marshaller$1$3 INSTANCE = new GBallTimeline$marshaller$1$3();

    GBallTimeline$marshaller$1$3() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GBallTimeline.AggregatedEvent> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GBallTimeline.AggregatedEvent>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GBallTimeline.AggregatedEvent> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GBallTimeline.AggregatedEvent aggregatedEvent : list) {
            valueof.values(aggregatedEvent.marshaller());
        }
    }
}
