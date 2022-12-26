package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetTeamPreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetTeamPreviewQuery$Match$Companion$invoke$1$participatingTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetTeamPreviewQuery.ParticipatingTeam> {
    public static final GetTeamPreviewQuery$Match$Companion$invoke$1$participatingTeam$1 INSTANCE = new GetTeamPreviewQuery$Match$Companion$invoke$1$participatingTeam$1();

    GetTeamPreviewQuery$Match$Companion$invoke$1$participatingTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetTeamPreviewQuery.ParticipatingTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetTeamPreviewQuery.ParticipatingTeam.Companion.invoke(removecancellable);
    }
}
