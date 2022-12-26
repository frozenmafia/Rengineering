package com.app.dream11.payment.amountSelection.offers;

import com.app.dream11.model.FlowState;
import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class MatchDetails implements Serializable {
    private final int roundId;
    private final String site;
    private final int tourId;

    public MatchDetails(String str, int i, int i2) {
        runAnimators.ag$a(str, FlowState.SITE);
        this.site = str;
        this.tourId = i;
        this.roundId = i2;
    }

    public final int getRoundId() {
        return this.roundId;
    }

    public final String getSite() {
        return this.site;
    }

    public final int getTourId() {
        return this.tourId;
    }
}
