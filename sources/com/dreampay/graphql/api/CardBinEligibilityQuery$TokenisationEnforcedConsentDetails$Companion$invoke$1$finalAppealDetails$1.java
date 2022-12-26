package com.dreampay.graphql.api;

import com.dreampay.graphql.api.CardBinEligibilityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardBinEligibilityQuery$TokenisationEnforcedConsentDetails$Companion$invoke$1$finalAppealDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CardBinEligibilityQuery.FinalAppealDetails> {
    public static final CardBinEligibilityQuery$TokenisationEnforcedConsentDetails$Companion$invoke$1$finalAppealDetails$1 INSTANCE = new CardBinEligibilityQuery$TokenisationEnforcedConsentDetails$Companion$invoke$1$finalAppealDetails$1();

    CardBinEligibilityQuery$TokenisationEnforcedConsentDetails$Companion$invoke$1$finalAppealDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CardBinEligibilityQuery.FinalAppealDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CardBinEligibilityQuery.FinalAppealDetails.Companion.invoke(removecancellable);
    }
}
