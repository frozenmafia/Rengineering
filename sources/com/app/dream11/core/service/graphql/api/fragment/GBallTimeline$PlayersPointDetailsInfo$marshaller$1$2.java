package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GBallTimeline;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GBallTimeline$PlayersPointDetailsInfo$marshaller$1$2 extends Lambda implements Transition<List<? extends GBallTimeline.TeamPointDetailsInfo>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GBallTimeline$PlayersPointDetailsInfo$marshaller$1$2 INSTANCE = new GBallTimeline$PlayersPointDetailsInfo$marshaller$1$2();

    GBallTimeline$PlayersPointDetailsInfo$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GBallTimeline.TeamPointDetailsInfo> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GBallTimeline.TeamPointDetailsInfo>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GBallTimeline.TeamPointDetailsInfo> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GBallTimeline.TeamPointDetailsInfo teamPointDetailsInfo : list) {
            valueof.values(teamPointDetailsInfo.marshaller());
        }
    }
}
