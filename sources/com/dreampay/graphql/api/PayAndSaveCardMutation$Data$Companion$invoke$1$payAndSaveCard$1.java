package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PayAndSaveCardMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PayAndSaveCardMutation$Data$Companion$invoke$1$payAndSaveCard$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PayAndSaveCardMutation.PayAndSaveCard> {
    public static final PayAndSaveCardMutation$Data$Companion$invoke$1$payAndSaveCard$1 INSTANCE = new PayAndSaveCardMutation$Data$Companion$invoke$1$payAndSaveCard$1();

    PayAndSaveCardMutation$Data$Companion$invoke$1$payAndSaveCard$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PayAndSaveCardMutation.PayAndSaveCard invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PayAndSaveCardMutation.PayAndSaveCard.Companion.invoke(removecancellable);
    }
}
