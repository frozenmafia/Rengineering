package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RolewisePreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RolewisePreviewQuery$Player$Companion$invoke$1$tourStatistics$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, RolewisePreviewQuery.TourStatistic> {
    public static final RolewisePreviewQuery$Player$Companion$invoke$1$tourStatistics$1 INSTANCE = new RolewisePreviewQuery$Player$Companion$invoke$1$tourStatistics$1();

    RolewisePreviewQuery$Player$Companion$invoke$1$tourStatistics$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.RolewisePreviewQuery$Player$Companion$invoke$1$tourStatistics$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RolewisePreviewQuery.TourStatistic> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final RolewisePreviewQuery.TourStatistic invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return RolewisePreviewQuery.TourStatistic.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final RolewisePreviewQuery.TourStatistic invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (RolewisePreviewQuery.TourStatistic) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
