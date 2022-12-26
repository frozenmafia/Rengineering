package com.app.dream11.core.service.graphql.api.tier;

import com.app.dream11.core.service.graphql.api.tier.TierInitInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TierInitInfoQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TierInitInfoQuery.Me> {
    public static final TierInitInfoQuery$Data$Companion$invoke$1$me$1 INSTANCE = new TierInitInfoQuery$Data$Companion$invoke$1$me$1();

    TierInitInfoQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TierInitInfoQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TierInitInfoQuery.Me.Companion.invoke(removecancellable);
    }
}
