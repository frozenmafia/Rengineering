package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentSectionsQuery$AsNetbankingBanks$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PaymentSectionsQuery.Artwork1> {
    public static final PaymentSectionsQuery$AsNetbankingBanks$Companion$invoke$1$artwork$1 INSTANCE = new PaymentSectionsQuery$AsNetbankingBanks$Companion$invoke$1$artwork$1();

    PaymentSectionsQuery$AsNetbankingBanks$Companion$invoke$1$artwork$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PaymentSectionsQuery.Artwork1 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PaymentSectionsQuery.Artwork1.Companion.invoke(removecancellable);
    }
}
