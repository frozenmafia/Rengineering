package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.UserTeamData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetTeamPreviewQuery$SharedTeam$Fragments$Companion$invoke$1$userTeamData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserTeamData> {
    public static final GetTeamPreviewQuery$SharedTeam$Fragments$Companion$invoke$1$userTeamData$1 INSTANCE = new GetTeamPreviewQuery$SharedTeam$Fragments$Companion$invoke$1$userTeamData$1();

    GetTeamPreviewQuery$SharedTeam$Fragments$Companion$invoke$1$userTeamData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserTeamData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserTeamData.Companion.invoke(removecancellable);
    }
}