package com.app.dream11.payment.paymentoffers.offers;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.applyTo;
/* loaded from: classes3.dex */
final class PaymentOffersFragment$mPaymentOffersPresenter$2 extends Lambda implements Styleable.ArcMotion<applyTo> {
    public static final PaymentOffersFragment$mPaymentOffersPresenter$2 INSTANCE = new PaymentOffersFragment$mPaymentOffersPresenter$2();

    PaymentOffersFragment$mPaymentOffersPresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final applyTo invoke() {
        return ActionMenuItem.valueOf().isConnected();
    }
}
