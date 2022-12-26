package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ChannelAndConnectionInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ChannelAndConnectionInfoQuery$Data$Companion$invoke$1$startChat$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ChannelAndConnectionInfoQuery.StartChat> {
    public static final ChannelAndConnectionInfoQuery$Data$Companion$invoke$1$startChat$1 INSTANCE = new ChannelAndConnectionInfoQuery$Data$Companion$invoke$1$startChat$1();

    ChannelAndConnectionInfoQuery$Data$Companion$invoke$1$startChat$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ChannelAndConnectionInfoQuery.StartChat invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ChannelAndConnectionInfoQuery.StartChat.Companion.invoke(removecancellable);
    }
}
