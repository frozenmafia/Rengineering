package com.app.dream11.core.service.graphql.api.Social.contestInvitation;

import com.app.dream11.core.service.graphql.api.Social.contestInvitation.FetchContestInvitationListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchContestInvitationListQuery$Data$Companion$invoke$1$contestInvitationsCountForRound$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchContestInvitationListQuery.ContestInvitationsCountForRound> {
    public static final FetchContestInvitationListQuery$Data$Companion$invoke$1$contestInvitationsCountForRound$1 INSTANCE = new FetchContestInvitationListQuery$Data$Companion$invoke$1$contestInvitationsCountForRound$1();

    FetchContestInvitationListQuery$Data$Companion$invoke$1$contestInvitationsCountForRound$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchContestInvitationListQuery.ContestInvitationsCountForRound invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchContestInvitationListQuery.ContestInvitationsCountForRound.Companion.invoke(removecancellable);
    }
}
