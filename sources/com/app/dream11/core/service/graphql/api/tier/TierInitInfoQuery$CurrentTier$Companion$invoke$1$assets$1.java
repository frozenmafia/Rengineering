package com.app.dream11.core.service.graphql.api.tier;

import com.app.dream11.core.service.graphql.api.tier.TierInitInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TierInitInfoQuery$CurrentTier$Companion$invoke$1$assets$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TierInitInfoQuery.Assets> {
    public static final TierInitInfoQuery$CurrentTier$Companion$invoke$1$assets$1 INSTANCE = new TierInitInfoQuery$CurrentTier$Companion$invoke$1$assets$1();

    TierInitInfoQuery$CurrentTier$Companion$invoke$1$assets$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TierInitInfoQuery.Assets invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TierInitInfoQuery.Assets.Companion.invoke(removecancellable);
    }
}
