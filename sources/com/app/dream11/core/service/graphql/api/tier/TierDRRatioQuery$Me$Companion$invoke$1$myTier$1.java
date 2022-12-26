package com.app.dream11.core.service.graphql.api.tier;

import com.app.dream11.core.service.graphql.api.tier.TierDRRatioQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TierDRRatioQuery$Me$Companion$invoke$1$myTier$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TierDRRatioQuery.MyTier> {
    public static final TierDRRatioQuery$Me$Companion$invoke$1$myTier$1 INSTANCE = new TierDRRatioQuery$Me$Companion$invoke$1$myTier$1();

    TierDRRatioQuery$Me$Companion$invoke$1$myTier$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TierDRRatioQuery.MyTier invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TierDRRatioQuery.MyTier.Companion.invoke(removecancellable);
    }
}
