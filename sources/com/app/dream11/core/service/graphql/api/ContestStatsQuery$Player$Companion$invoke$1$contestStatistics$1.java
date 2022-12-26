package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestStatsQuery$Player$Companion$invoke$1$contestStatistics$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestStatsQuery.ContestStatistics> {
    public static final ContestStatsQuery$Player$Companion$invoke$1$contestStatistics$1 INSTANCE = new ContestStatsQuery$Player$Companion$invoke$1$contestStatistics$1();

    ContestStatsQuery$Player$Companion$invoke$1$contestStatistics$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestStatsQuery.ContestStatistics invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestStatsQuery.ContestStatistics.Companion.invoke(removecancellable);
    }
}
