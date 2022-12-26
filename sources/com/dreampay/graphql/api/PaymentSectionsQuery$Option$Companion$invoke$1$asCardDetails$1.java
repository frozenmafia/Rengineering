package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentSectionsQuery$Option$Companion$invoke$1$asCardDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PaymentSectionsQuery.AsCardDetails> {
    public static final PaymentSectionsQuery$Option$Companion$invoke$1$asCardDetails$1 INSTANCE = new PaymentSectionsQuery$Option$Companion$invoke$1$asCardDetails$1();

    PaymentSectionsQuery$Option$Companion$invoke$1$asCardDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PaymentSectionsQuery.AsCardDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PaymentSectionsQuery.AsCardDetails.Companion.invoke(removecancellable);
    }
}
