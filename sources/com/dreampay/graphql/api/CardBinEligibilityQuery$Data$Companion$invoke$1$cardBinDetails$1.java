package com.dreampay.graphql.api;

import com.dreampay.graphql.api.CardBinEligibilityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardBinEligibilityQuery$Data$Companion$invoke$1$cardBinDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CardBinEligibilityQuery.CardBinDetails> {
    public static final CardBinEligibilityQuery$Data$Companion$invoke$1$cardBinDetails$1 INSTANCE = new CardBinEligibilityQuery$Data$Companion$invoke$1$cardBinDetails$1();

    CardBinEligibilityQuery$Data$Companion$invoke$1$cardBinDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CardBinEligibilityQuery.CardBinDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CardBinEligibilityQuery.CardBinDetails.Companion.invoke(removecancellable);
    }
}
