package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ChannelCardDataQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ChannelCardDataQuery$Data$Companion$invoke$1$inviteCountForGroups$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ChannelCardDataQuery.InviteCountForGroups> {
    public static final ChannelCardDataQuery$Data$Companion$invoke$1$inviteCountForGroups$1 INSTANCE = new ChannelCardDataQuery$Data$Companion$invoke$1$inviteCountForGroups$1();

    ChannelCardDataQuery$Data$Companion$invoke$1$inviteCountForGroups$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ChannelCardDataQuery.InviteCountForGroups invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ChannelCardDataQuery.InviteCountForGroups.Companion.invoke(removecancellable);
    }
}
