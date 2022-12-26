package com.app.dream11.core.service.graphql.api.Social.contestInvitation;

import com.app.dream11.core.service.graphql.api.Social.contestInvitation.FetchContestInvitationListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchContestInvitationListQuery$ContestInvitationsListForRound$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchContestInvitationListQuery.PageInfo> {
    public static final FetchContestInvitationListQuery$ContestInvitationsListForRound$Companion$invoke$1$pageInfo$1 INSTANCE = new FetchContestInvitationListQuery$ContestInvitationsListForRound$Companion$invoke$1$pageInfo$1();

    FetchContestInvitationListQuery$ContestInvitationsListForRound$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchContestInvitationListQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchContestInvitationListQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
