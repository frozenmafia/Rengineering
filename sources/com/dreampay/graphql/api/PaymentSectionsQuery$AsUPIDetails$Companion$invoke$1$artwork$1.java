package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentSectionsQuery$AsUPIDetails$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PaymentSectionsQuery.Artwork3> {
    public static final PaymentSectionsQuery$AsUPIDetails$Companion$invoke$1$artwork$1 INSTANCE = new PaymentSectionsQuery$AsUPIDetails$Companion$invoke$1$artwork$1();

    PaymentSectionsQuery$AsUPIDetails$Companion$invoke$1$artwork$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PaymentSectionsQuery.Artwork3 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PaymentSectionsQuery.Artwork3.Companion.invoke(removecancellable);
    }
}
