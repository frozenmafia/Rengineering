package com.fancode.payment.interfaces;
/* loaded from: classes6.dex */
public enum PaymentEvent {
    PRODUCT_LISTING_LOADED("ProductListingLoaded"),
    PRODUCT_SELECTED("ProductSelected"),
    PRODUCT_DETAILS_CLICKED("ProductDetailsClicked"),
    ORDER_INITIATED("OrderInitated"),
    FAQ_CLICKED("FAQclicked"),
    TNC_CLICKED("TnCClicked"),
    COUPON_APPLIED("CouponApplied");
    
    private final String value;

    PaymentEvent(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
