package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GBallTimeline;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GBallTimeline$TeamPointDetailsInfo$Companion$invoke$1$pointDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GBallTimeline.PointDetails1> {
    public static final GBallTimeline$TeamPointDetailsInfo$Companion$invoke$1$pointDetails$1 INSTANCE = new GBallTimeline$TeamPointDetailsInfo$Companion$invoke$1$pointDetails$1();

    GBallTimeline$TeamPointDetailsInfo$Companion$invoke$1$pointDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GBallTimeline.PointDetails1 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GBallTimeline.PointDetails1.Companion.invoke(removecancellable);
    }
}
