package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.TeamCompareQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TeamCompareQuery$Match$Companion$invoke$1$teamTwo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TeamCompareQuery.TeamTwo> {
    public static final TeamCompareQuery$Match$Companion$invoke$1$teamTwo$1 INSTANCE = new TeamCompareQuery$Match$Companion$invoke$1$teamTwo$1();

    TeamCompareQuery$Match$Companion$invoke$1$teamTwo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TeamCompareQuery.TeamTwo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TeamCompareQuery.TeamTwo.Companion.invoke(removecancellable);
    }
}
