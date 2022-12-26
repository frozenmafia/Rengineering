package com.dreampay.commons.upi;

import o.runAnimators;
/* loaded from: classes4.dex */
public final class UpiAvailability {
    private final com.dreampay.commons.AvailabilityCode availabilityCode;
    private final boolean shouldShow;
    private final UPI upi;

    public UpiAvailability(UPI upi, boolean z, com.dreampay.commons.AvailabilityCode availabilityCode) {
        runAnimators.ag$a(upi, "upi");
        runAnimators.ag$a(availabilityCode, "availabilityCode");
        this.upi = upi;
        this.shouldShow = z;
        this.availabilityCode = availabilityCode;
    }

    public final com.dreampay.commons.AvailabilityCode getAvailabilityCode() {
        return this.availabilityCode;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final UPI getUpi() {
        return this.upi;
    }
}
