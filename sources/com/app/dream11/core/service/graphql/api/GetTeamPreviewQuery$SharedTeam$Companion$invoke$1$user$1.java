package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetTeamPreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetTeamPreviewQuery$SharedTeam$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetTeamPreviewQuery.User> {
    public static final GetTeamPreviewQuery$SharedTeam$Companion$invoke$1$user$1 INSTANCE = new GetTeamPreviewQuery$SharedTeam$Companion$invoke$1$user$1();

    GetTeamPreviewQuery$SharedTeam$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetTeamPreviewQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetTeamPreviewQuery.User.Companion.invoke(removecancellable);
    }
}
