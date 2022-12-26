package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.LeaderBoardFilterQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LeaderBoardFilterQuery$Data$Companion$invoke$1$leaderBoardFilters$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, LeaderBoardFilterQuery.LeaderBoardFilter> {
    public static final LeaderBoardFilterQuery$Data$Companion$invoke$1$leaderBoardFilters$1 INSTANCE = new LeaderBoardFilterQuery$Data$Companion$invoke$1$leaderBoardFilters$1();

    LeaderBoardFilterQuery$Data$Companion$invoke$1$leaderBoardFilters$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.LeaderBoardFilterQuery$Data$Companion$invoke$1$leaderBoardFilters$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, LeaderBoardFilterQuery.LeaderBoardFilter> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final LeaderBoardFilterQuery.LeaderBoardFilter invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return LeaderBoardFilterQuery.LeaderBoardFilter.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final LeaderBoardFilterQuery.LeaderBoardFilter invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (LeaderBoardFilterQuery.LeaderBoardFilter) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
