package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.DMChatCardDataQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DMChatCardDataQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DMChatCardDataQuery.User> {
    public static final DMChatCardDataQuery$Data$Companion$invoke$1$user$1 INSTANCE = new DMChatCardDataQuery$Data$Companion$invoke$1$user$1();

    DMChatCardDataQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DMChatCardDataQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DMChatCardDataQuery.User.Companion.invoke(removecancellable);
    }
}
