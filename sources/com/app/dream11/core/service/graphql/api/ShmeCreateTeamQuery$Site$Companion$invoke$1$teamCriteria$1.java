package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeCreateTeamQuery$Site$Companion$invoke$1$teamCriteria$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeCreateTeamQuery.TeamCriteria> {
    public static final ShmeCreateTeamQuery$Site$Companion$invoke$1$teamCriteria$1 INSTANCE = new ShmeCreateTeamQuery$Site$Companion$invoke$1$teamCriteria$1();

    ShmeCreateTeamQuery$Site$Companion$invoke$1$teamCriteria$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeCreateTeamQuery.TeamCriteria invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ShmeCreateTeamQuery.TeamCriteria.Companion.invoke(removecancellable);
    }
}
