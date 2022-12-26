package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeklyLeaderboardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetWeeklyLeaderboardQuery$Users$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetWeeklyLeaderboardQuery.PageInfo> {
    public static final GetWeeklyLeaderboardQuery$Users$Companion$invoke$1$pageInfo$1 INSTANCE = new GetWeeklyLeaderboardQuery$Users$Companion$invoke$1$pageInfo$1();

    GetWeeklyLeaderboardQuery$Users$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetWeeklyLeaderboardQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetWeeklyLeaderboardQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
