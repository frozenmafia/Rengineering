package com.dreampay.graphql.api;

import com.dreampay.graphql.api.CardBinEligibilityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardBinEligibilityQuery$Health$Companion$invoke$1$icon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CardBinEligibilityQuery.Icon> {
    public static final CardBinEligibilityQuery$Health$Companion$invoke$1$icon$1 INSTANCE = new CardBinEligibilityQuery$Health$Companion$invoke$1$icon$1();

    CardBinEligibilityQuery$Health$Companion$invoke$1$icon$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CardBinEligibilityQuery.Icon invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CardBinEligibilityQuery.Icon.Companion.invoke(removecancellable);
    }
}
