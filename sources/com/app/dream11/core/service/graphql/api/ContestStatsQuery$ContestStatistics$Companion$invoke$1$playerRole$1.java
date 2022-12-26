package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestStatsQuery$ContestStatistics$Companion$invoke$1$playerRole$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestStatsQuery.PlayerRole> {
    public static final ContestStatsQuery$ContestStatistics$Companion$invoke$1$playerRole$1 INSTANCE = new ContestStatsQuery$ContestStatistics$Companion$invoke$1$playerRole$1();

    ContestStatsQuery$ContestStatistics$Companion$invoke$1$playerRole$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestStatsQuery$ContestStatistics$Companion$invoke$1$playerRole$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestStatsQuery.PlayerRole> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestStatsQuery.PlayerRole invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestStatsQuery.PlayerRole.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestStatsQuery.PlayerRole invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestStatsQuery.PlayerRole) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
