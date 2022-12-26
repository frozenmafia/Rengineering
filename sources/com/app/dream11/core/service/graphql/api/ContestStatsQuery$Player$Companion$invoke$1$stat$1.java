package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestStatsQuery$Player$Companion$invoke$1$stat$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestStatsQuery.Stat> {
    public static final ContestStatsQuery$Player$Companion$invoke$1$stat$1 INSTANCE = new ContestStatsQuery$Player$Companion$invoke$1$stat$1();

    ContestStatsQuery$Player$Companion$invoke$1$stat$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestStatsQuery.Stat invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestStatsQuery.Stat.Companion.invoke(removecancellable);
    }
}
