package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.DoPaymentMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DoPaymentMutation$Data$Companion$invoke$1$doPayment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DoPaymentMutation.DoPayment> {
    public static final DoPaymentMutation$Data$Companion$invoke$1$doPayment$1 INSTANCE = new DoPaymentMutation$Data$Companion$invoke$1$doPayment$1();

    DoPaymentMutation$Data$Companion$invoke$1$doPayment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DoPaymentMutation.DoPayment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DoPaymentMutation.DoPayment.Companion.invoke(removecancellable);
    }
}
