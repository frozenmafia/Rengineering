package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GBallTimeline;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GBallTimeline$Companion$invoke$1$aggregatedEvents$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GBallTimeline.AggregatedEvent> {
    public static final GBallTimeline$Companion$invoke$1$aggregatedEvents$1 INSTANCE = new GBallTimeline$Companion$invoke$1$aggregatedEvents$1();

    GBallTimeline$Companion$invoke$1$aggregatedEvents$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GBallTimeline$Companion$invoke$1$aggregatedEvents$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GBallTimeline.AggregatedEvent> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GBallTimeline.AggregatedEvent invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GBallTimeline.AggregatedEvent.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GBallTimeline.AggregatedEvent invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GBallTimeline.AggregatedEvent) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
