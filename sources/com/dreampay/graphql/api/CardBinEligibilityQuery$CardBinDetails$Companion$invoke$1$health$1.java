package com.dreampay.graphql.api;

import com.dreampay.graphql.api.CardBinEligibilityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardBinEligibilityQuery$CardBinDetails$Companion$invoke$1$health$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CardBinEligibilityQuery.Health> {
    public static final CardBinEligibilityQuery$CardBinDetails$Companion$invoke$1$health$1 INSTANCE = new CardBinEligibilityQuery$CardBinDetails$Companion$invoke$1$health$1();

    CardBinEligibilityQuery$CardBinDetails$Companion$invoke$1$health$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CardBinEligibilityQuery.Health invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CardBinEligibilityQuery.Health.Companion.invoke(removecancellable);
    }
}
