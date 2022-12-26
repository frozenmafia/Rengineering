package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GBallTimeline;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GBallTimeline$PlayersPointDetailsInfo$Companion$invoke$1$pointDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GBallTimeline.PointDetails> {
    public static final GBallTimeline$PlayersPointDetailsInfo$Companion$invoke$1$pointDetails$1 INSTANCE = new GBallTimeline$PlayersPointDetailsInfo$Companion$invoke$1$pointDetails$1();

    GBallTimeline$PlayersPointDetailsInfo$Companion$invoke$1$pointDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GBallTimeline.PointDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GBallTimeline.PointDetails.Companion.invoke(removecancellable);
    }
}
