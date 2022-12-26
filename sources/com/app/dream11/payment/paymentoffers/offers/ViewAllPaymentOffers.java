package com.app.dream11.payment.paymentoffers.offers;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ViewAllPaymentOffers implements Serializable {
    private double paymentOffersData;

    public static /* synthetic */ ViewAllPaymentOffers copy$default(ViewAllPaymentOffers viewAllPaymentOffers, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = viewAllPaymentOffers.paymentOffersData;
        }
        return viewAllPaymentOffers.copy(d);
    }

    public final double component1() {
        return this.paymentOffersData;
    }

    public final ViewAllPaymentOffers copy(double d) {
        return new ViewAllPaymentOffers(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewAllPaymentOffers) && runAnimators.values(Double.valueOf(this.paymentOffersData), Double.valueOf(((ViewAllPaymentOffers) obj).paymentOffersData));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.paymentOffersData);
    }

    public String toString() {
        double d = this.paymentOffersData;
        return "ViewAllPaymentOffers(paymentOffersData=" + d + ")";
    }

    public ViewAllPaymentOffers(double d) {
        this.paymentOffersData = d;
    }

    public final double getPaymentOffersData() {
        return this.paymentOffersData;
    }

    public final void setPaymentOffersData(double d) {
        this.paymentOffersData = d;
    }
}
