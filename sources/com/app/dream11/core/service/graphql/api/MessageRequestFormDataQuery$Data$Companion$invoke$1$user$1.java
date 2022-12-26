package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MessageRequestFormDataQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MessageRequestFormDataQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MessageRequestFormDataQuery.User> {
    public static final MessageRequestFormDataQuery$Data$Companion$invoke$1$user$1 INSTANCE = new MessageRequestFormDataQuery$Data$Companion$invoke$1$user$1();

    MessageRequestFormDataQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MessageRequestFormDataQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MessageRequestFormDataQuery.User.Companion.invoke(removecancellable);
    }
}
