package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentSectionsQuery$AsWalletDetails$Companion$invoke$1$health$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PaymentSectionsQuery.Health1> {
    public static final PaymentSectionsQuery$AsWalletDetails$Companion$invoke$1$health$1 INSTANCE = new PaymentSectionsQuery$AsWalletDetails$Companion$invoke$1$health$1();

    PaymentSectionsQuery$AsWalletDetails$Companion$invoke$1$health$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PaymentSectionsQuery.Health1 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PaymentSectionsQuery.Health1.Companion.invoke(removecancellable);
    }
}
