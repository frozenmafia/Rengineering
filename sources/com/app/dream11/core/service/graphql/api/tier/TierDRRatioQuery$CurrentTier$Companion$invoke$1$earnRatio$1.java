package com.app.dream11.core.service.graphql.api.tier;

import com.app.dream11.core.service.graphql.api.tier.TierDRRatioQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TierDRRatioQuery$CurrentTier$Companion$invoke$1$earnRatio$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TierDRRatioQuery.EarnRatio> {
    public static final TierDRRatioQuery$CurrentTier$Companion$invoke$1$earnRatio$1 INSTANCE = new TierDRRatioQuery$CurrentTier$Companion$invoke$1$earnRatio$1();

    TierDRRatioQuery$CurrentTier$Companion$invoke$1$earnRatio$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TierDRRatioQuery.EarnRatio invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TierDRRatioQuery.EarnRatio.Companion.invoke(removecancellable);
    }
}
