package com.dreampay.graphql.api;

import com.dreampay.graphql.api.SaveCardMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SaveCardMutation$Data$Companion$invoke$1$saveCard$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, SaveCardMutation.SaveCard> {
    public static final SaveCardMutation$Data$Companion$invoke$1$saveCard$1 INSTANCE = new SaveCardMutation$Data$Companion$invoke$1$saveCard$1();

    SaveCardMutation$Data$Companion$invoke$1$saveCard$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final SaveCardMutation.SaveCard invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return SaveCardMutation.SaveCard.Companion.invoke(removecancellable);
    }
}
