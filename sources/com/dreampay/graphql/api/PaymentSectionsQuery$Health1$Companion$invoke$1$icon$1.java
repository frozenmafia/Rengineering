package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentSectionsQuery$Health1$Companion$invoke$1$icon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PaymentSectionsQuery.Icon2> {
    public static final PaymentSectionsQuery$Health1$Companion$invoke$1$icon$1 INSTANCE = new PaymentSectionsQuery$Health1$Companion$invoke$1$icon$1();

    PaymentSectionsQuery$Health1$Companion$invoke$1$icon$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PaymentSectionsQuery.Icon2 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PaymentSectionsQuery.Icon2.Companion.invoke(removecancellable);
    }
}
