package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GBallTimeline;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GBallTimeline$marshaller$1$2 extends Lambda implements Transition<List<? extends GBallTimeline.TeamPointDetailsInfo1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GBallTimeline$marshaller$1$2 INSTANCE = new GBallTimeline$marshaller$1$2();

    GBallTimeline$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GBallTimeline.TeamPointDetailsInfo1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GBallTimeline.TeamPointDetailsInfo1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GBallTimeline.TeamPointDetailsInfo1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GBallTimeline.TeamPointDetailsInfo1 teamPointDetailsInfo1 : list) {
            valueof.values(teamPointDetailsInfo1 == null ? null : teamPointDetailsInfo1.marshaller());
        }
    }
}
