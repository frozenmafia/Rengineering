package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;

import java.io.Serializable;
import java.util.Date;
/* loaded from: classes3.dex */
public final class AvailableRewardsEdge implements Serializable {
    private final Date claimExpiry;
    private final Date expiry;

    public AvailableRewardsEdge(Date date, Date date2) {
        this.claimExpiry = date;
        this.expiry = date2;
    }

    public final Date getClaimExpiry() {
        return this.claimExpiry;
    }

    public final Date getExpiry() {
        return this.expiry;
    }
}
