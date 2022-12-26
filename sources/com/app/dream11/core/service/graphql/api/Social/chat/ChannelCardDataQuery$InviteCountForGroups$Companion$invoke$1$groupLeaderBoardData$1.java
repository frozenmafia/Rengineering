package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ChannelCardDataQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ChannelCardDataQuery$InviteCountForGroups$Companion$invoke$1$groupLeaderBoardData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ChannelCardDataQuery.GroupLeaderBoardData> {
    public static final ChannelCardDataQuery$InviteCountForGroups$Companion$invoke$1$groupLeaderBoardData$1 INSTANCE = new ChannelCardDataQuery$InviteCountForGroups$Companion$invoke$1$groupLeaderBoardData$1();

    ChannelCardDataQuery$InviteCountForGroups$Companion$invoke$1$groupLeaderBoardData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ChannelCardDataQuery.GroupLeaderBoardData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ChannelCardDataQuery.GroupLeaderBoardData.Companion.invoke(removecancellable);
    }
}
