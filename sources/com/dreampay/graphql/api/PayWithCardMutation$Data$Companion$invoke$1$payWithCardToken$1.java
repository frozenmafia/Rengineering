package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PayWithCardMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PayWithCardMutation$Data$Companion$invoke$1$payWithCardToken$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PayWithCardMutation.PayWithCardToken> {
    public static final PayWithCardMutation$Data$Companion$invoke$1$payWithCardToken$1 INSTANCE = new PayWithCardMutation$Data$Companion$invoke$1$payWithCardToken$1();

    PayWithCardMutation$Data$Companion$invoke$1$payWithCardToken$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PayWithCardMutation.PayWithCardToken invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PayWithCardMutation.PayWithCardToken.Companion.invoke(removecancellable);
    }
}
