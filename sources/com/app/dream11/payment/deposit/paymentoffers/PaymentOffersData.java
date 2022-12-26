package com.app.dream11.payment.deposit.paymentoffers;

import java.io.Serializable;
import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PaymentOffersData implements Serializable {
    private final int numOfOffer;
    private final List<PaymentOffer> offers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentOffersData copy$default(PaymentOffersData paymentOffersData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = paymentOffersData.numOfOffer;
        }
        if ((i2 & 2) != 0) {
            list = paymentOffersData.offers;
        }
        return paymentOffersData.copy(i, list);
    }

    public final int component1() {
        return this.numOfOffer;
    }

    public final List<PaymentOffer> component2() {
        return this.offers;
    }

    public final PaymentOffersData copy(int i, List<PaymentOffer> list) {
        runAnimators.ag$a(list, "offers");
        return new PaymentOffersData(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentOffersData) {
            PaymentOffersData paymentOffersData = (PaymentOffersData) obj;
            return this.numOfOffer == paymentOffersData.numOfOffer && runAnimators.values(this.offers, paymentOffersData.offers);
        }
        return false;
    }

    public int hashCode() {
        return (this.numOfOffer * 31) + this.offers.hashCode();
    }

    public String toString() {
        int i = this.numOfOffer;
        List<PaymentOffer> list = this.offers;
        return "PaymentOffersData(numOfOffer=" + i + ", offers=" + list + ")";
    }

    public PaymentOffersData(int i, List<PaymentOffer> list) {
        runAnimators.ag$a(list, "offers");
        this.numOfOffer = i;
        this.offers = list;
    }

    public final int getNumOfOffer() {
        return this.numOfOffer;
    }

    public final List<PaymentOffer> getOffers() {
        return this.offers;
    }
}
