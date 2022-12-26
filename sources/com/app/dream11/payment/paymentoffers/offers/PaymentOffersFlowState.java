package com.app.dream11.payment.paymentoffers.offers;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Objects;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class PaymentOffersFlowState extends FlowState {
    public static final toString Companion = new toString(null);
    public static final String KEY_PAYMENT_OFFERS_DATA = "keyPaymentOffersData";

    public PaymentOffersFlowState(double d) {
        super(FlowStates.PAYMENT_OFFERS, null, 2, null);
        putExtra(KEY_PAYMENT_OFFERS_DATA, Double.valueOf(d));
    }

    public final double getViewAllOffers() {
        Serializable extra = getExtra(KEY_PAYMENT_OFFERS_DATA);
        Objects.requireNonNull(extra, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) extra).doubleValue();
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
