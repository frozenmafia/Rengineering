package com.app.dream11.myprofile.firstpersonprofile;

import com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper.AvailableRewardsEdge;
import java.util.Date;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class LoyaltyLevelItemVM$isClaimNowVisible$1 extends Lambda implements Styleable.ChangeBounds<AvailableRewardsEdge, Boolean> {
    final /* synthetic */ long $currentTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyLevelItemVM$isClaimNowVisible$1(long j) {
        super(1);
        this.$currentTime = j;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(AvailableRewardsEdge availableRewardsEdge) {
        runAnimators.ag$a(availableRewardsEdge, "item");
        Date claimExpiry = availableRewardsEdge.getClaimExpiry();
        Long valueOf = claimExpiry == null ? null : Long.valueOf(claimExpiry.getTime());
        return Boolean.valueOf((valueOf == null ? this.$currentTime : valueOf.longValue()) - this.$currentTime > 0);
    }
}
