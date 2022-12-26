package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerPreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerPreviewQuery$Player$Companion$invoke$1$tourStatistics$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PlayerPreviewQuery.TourStatistic> {
    public static final PlayerPreviewQuery$Player$Companion$invoke$1$tourStatistics$1 INSTANCE = new PlayerPreviewQuery$Player$Companion$invoke$1$tourStatistics$1();

    PlayerPreviewQuery$Player$Companion$invoke$1$tourStatistics$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.PlayerPreviewQuery$Player$Companion$invoke$1$tourStatistics$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerPreviewQuery.TourStatistic> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PlayerPreviewQuery.TourStatistic invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PlayerPreviewQuery.TourStatistic.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerPreviewQuery.TourStatistic invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PlayerPreviewQuery.TourStatistic) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
