package com.app.dream11.payment.paymentoffers.offersdetailsbottomsheet;

import com.app.dream11.model.FlowState;
import com.app.dream11.payment.deposit.paymentoffers.PaymentOffer;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Objects;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class OffersDetailsBottomSheetFlowState extends FlowState {
    public static final values Companion = new values(null);
    public static final String KEY_PAYMENT_OFFERS = "keyPaymentOffers";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersDetailsBottomSheetFlowState(PaymentOffer paymentOffer) {
        super(FlowStates.OFFERS_DETAILS_BOTTOMSHEET, null, 2, null);
        runAnimators.ag$a(paymentOffer, "data");
        putExtra(KEY_PAYMENT_OFFERS, paymentOffer);
    }

    public final PaymentOffer getPaymentOffersData() {
        Serializable extra = getExtra(KEY_PAYMENT_OFFERS);
        Objects.requireNonNull(extra, "null cannot be cast to non-null type com.app.dream11.payment.deposit.paymentoffers.PaymentOffer");
        return (PaymentOffer) extra;
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
