package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ChannelAndConnectionInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ChannelAndConnectionInfoQuery$StartChat$Companion$invoke$1$channelInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ChannelAndConnectionInfoQuery.ChannelInfo> {
    public static final ChannelAndConnectionInfoQuery$StartChat$Companion$invoke$1$channelInfo$1 INSTANCE = new ChannelAndConnectionInfoQuery$StartChat$Companion$invoke$1$channelInfo$1();

    ChannelAndConnectionInfoQuery$StartChat$Companion$invoke$1$channelInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ChannelAndConnectionInfoQuery.ChannelInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ChannelAndConnectionInfoQuery.ChannelInfo.Companion.invoke(removecancellable);
    }
}
