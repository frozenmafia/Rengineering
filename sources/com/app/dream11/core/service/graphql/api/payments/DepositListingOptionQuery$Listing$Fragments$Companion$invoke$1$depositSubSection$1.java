package com.app.dream11.core.service.graphql.api.payments;

import com.app.dream11.core.service.graphql.api.fragment.DepositSubSection;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DepositListingOptionQuery$Listing$Fragments$Companion$invoke$1$depositSubSection$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DepositSubSection> {
    public static final DepositListingOptionQuery$Listing$Fragments$Companion$invoke$1$depositSubSection$1 INSTANCE = new DepositListingOptionQuery$Listing$Fragments$Companion$invoke$1$depositSubSection$1();

    DepositListingOptionQuery$Listing$Fragments$Companion$invoke$1$depositSubSection$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DepositSubSection invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DepositSubSection.Companion.invoke(removecancellable);
    }
}
