package com.app.dream11.core.service.graphql.api.tier;

import com.app.dream11.core.service.graphql.api.tier.TierInitInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TierInitInfoQuery$MyTier$Companion$invoke$1$nextTier$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TierInitInfoQuery.NextTier> {
    public static final TierInitInfoQuery$MyTier$Companion$invoke$1$nextTier$1 INSTANCE = new TierInitInfoQuery$MyTier$Companion$invoke$1$nextTier$1();

    TierInitInfoQuery$MyTier$Companion$invoke$1$nextTier$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TierInitInfoQuery.NextTier invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TierInitInfoQuery.NextTier.Companion.invoke(removecancellable);
    }
}
