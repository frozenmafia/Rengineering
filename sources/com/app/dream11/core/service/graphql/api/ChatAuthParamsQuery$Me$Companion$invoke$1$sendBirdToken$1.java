package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ChatAuthParamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ChatAuthParamsQuery$Me$Companion$invoke$1$sendBirdToken$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ChatAuthParamsQuery.SendBirdToken> {
    public static final ChatAuthParamsQuery$Me$Companion$invoke$1$sendBirdToken$1 INSTANCE = new ChatAuthParamsQuery$Me$Companion$invoke$1$sendBirdToken$1();

    ChatAuthParamsQuery$Me$Companion$invoke$1$sendBirdToken$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ChatAuthParamsQuery.SendBirdToken invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ChatAuthParamsQuery.SendBirdToken.Companion.invoke(removecancellable);
    }
}
