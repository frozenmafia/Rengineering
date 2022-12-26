package com.dreampay.graphql.api;

import com.dreampay.graphql.api.DeleteCardMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DeleteCardMutation$Data$Companion$invoke$1$deleteCard$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DeleteCardMutation.DeleteCard> {
    public static final DeleteCardMutation$Data$Companion$invoke$1$deleteCard$1 INSTANCE = new DeleteCardMutation$Data$Companion$invoke$1$deleteCard$1();

    DeleteCardMutation$Data$Companion$invoke$1$deleteCard$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DeleteCardMutation.DeleteCard invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DeleteCardMutation.DeleteCard.Companion.invoke(removecancellable);
    }
}
