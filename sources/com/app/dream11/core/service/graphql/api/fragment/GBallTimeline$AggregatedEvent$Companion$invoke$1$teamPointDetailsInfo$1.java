package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GBallTimeline;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GBallTimeline$AggregatedEvent$Companion$invoke$1$teamPointDetailsInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GBallTimeline.TeamPointDetailsInfo2> {
    public static final GBallTimeline$AggregatedEvent$Companion$invoke$1$teamPointDetailsInfo$1 INSTANCE = new GBallTimeline$AggregatedEvent$Companion$invoke$1$teamPointDetailsInfo$1();

    GBallTimeline$AggregatedEvent$Companion$invoke$1$teamPointDetailsInfo$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GBallTimeline$AggregatedEvent$Companion$invoke$1$teamPointDetailsInfo$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GBallTimeline.TeamPointDetailsInfo2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GBallTimeline.TeamPointDetailsInfo2 invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GBallTimeline.TeamPointDetailsInfo2.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GBallTimeline.TeamPointDetailsInfo2 invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GBallTimeline.TeamPointDetailsInfo2) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
