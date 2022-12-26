package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.TeamInfo;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CompareTeamQuery$UserTeam$Fragments$Companion$invoke$1$teamInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TeamInfo> {
    public static final CompareTeamQuery$UserTeam$Fragments$Companion$invoke$1$teamInfo$1 INSTANCE = new CompareTeamQuery$UserTeam$Fragments$Companion$invoke$1$teamInfo$1();

    CompareTeamQuery$UserTeam$Fragments$Companion$invoke$1$teamInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TeamInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TeamInfo.Companion.invoke(removecancellable);
    }
}
