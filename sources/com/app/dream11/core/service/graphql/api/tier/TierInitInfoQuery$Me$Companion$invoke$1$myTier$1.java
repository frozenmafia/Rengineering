package com.app.dream11.core.service.graphql.api.tier;

import com.app.dream11.core.service.graphql.api.tier.TierInitInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TierInitInfoQuery$Me$Companion$invoke$1$myTier$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TierInitInfoQuery.MyTier> {
    public static final TierInitInfoQuery$Me$Companion$invoke$1$myTier$1 INSTANCE = new TierInitInfoQuery$Me$Companion$invoke$1$myTier$1();

    TierInitInfoQuery$Me$Companion$invoke$1$myTier$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TierInitInfoQuery.MyTier invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TierInitInfoQuery.MyTier.Companion.invoke(removecancellable);
    }
}
