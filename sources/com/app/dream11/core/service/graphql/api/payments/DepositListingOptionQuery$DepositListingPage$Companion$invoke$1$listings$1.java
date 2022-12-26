package com.app.dream11.core.service.graphql.api.payments;

import com.app.dream11.core.service.graphql.api.payments.DepositListingOptionQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DepositListingOptionQuery$DepositListingPage$Companion$invoke$1$listings$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, DepositListingOptionQuery.Listing1> {
    public static final DepositListingOptionQuery$DepositListingPage$Companion$invoke$1$listings$1 INSTANCE = new DepositListingOptionQuery$DepositListingPage$Companion$invoke$1$listings$1();

    DepositListingOptionQuery$DepositListingPage$Companion$invoke$1$listings$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.payments.DepositListingOptionQuery$DepositListingPage$Companion$invoke$1$listings$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DepositListingOptionQuery.Listing1> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final DepositListingOptionQuery.Listing1 invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return DepositListingOptionQuery.Listing1.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final DepositListingOptionQuery.Listing1 invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (DepositListingOptionQuery.Listing1) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
