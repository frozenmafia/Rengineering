package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestStatsQuery$Match$Companion$invoke$1$contest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestStatsQuery.Contest> {
    public static final ContestStatsQuery$Match$Companion$invoke$1$contest$1 INSTANCE = new ContestStatsQuery$Match$Companion$invoke$1$contest$1();

    ContestStatsQuery$Match$Companion$invoke$1$contest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestStatsQuery.Contest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestStatsQuery.Contest.Companion.invoke(removecancellable);
    }
}
