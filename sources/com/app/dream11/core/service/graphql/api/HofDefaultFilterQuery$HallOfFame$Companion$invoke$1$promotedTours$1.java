package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HofDefaultFilterQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HofDefaultFilterQuery$HallOfFame$Companion$invoke$1$promotedTours$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, HofDefaultFilterQuery.PromotedTour> {
    public static final HofDefaultFilterQuery$HallOfFame$Companion$invoke$1$promotedTours$1 INSTANCE = new HofDefaultFilterQuery$HallOfFame$Companion$invoke$1$promotedTours$1();

    HofDefaultFilterQuery$HallOfFame$Companion$invoke$1$promotedTours$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.HofDefaultFilterQuery$HallOfFame$Companion$invoke$1$promotedTours$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HofDefaultFilterQuery.PromotedTour> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final HofDefaultFilterQuery.PromotedTour invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return HofDefaultFilterQuery.PromotedTour.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final HofDefaultFilterQuery.PromotedTour invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (HofDefaultFilterQuery.PromotedTour) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
