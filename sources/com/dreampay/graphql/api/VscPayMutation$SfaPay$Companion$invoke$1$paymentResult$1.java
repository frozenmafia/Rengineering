package com.dreampay.graphql.api;

import com.dreampay.graphql.api.VscPayMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class VscPayMutation$SfaPay$Companion$invoke$1$paymentResult$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, VscPayMutation.PaymentResult> {
    public static final VscPayMutation$SfaPay$Companion$invoke$1$paymentResult$1 INSTANCE = new VscPayMutation$SfaPay$Companion$invoke$1$paymentResult$1();

    VscPayMutation$SfaPay$Companion$invoke$1$paymentResult$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final VscPayMutation.PaymentResult invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return VscPayMutation.PaymentResult.Companion.invoke(removecancellable);
    }
}
