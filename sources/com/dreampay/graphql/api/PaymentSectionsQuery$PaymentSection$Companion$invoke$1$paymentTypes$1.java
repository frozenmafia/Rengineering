package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentSectionsQuery$PaymentSection$Companion$invoke$1$paymentTypes$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PaymentSectionsQuery.PaymentType> {
    public static final PaymentSectionsQuery$PaymentSection$Companion$invoke$1$paymentTypes$1 INSTANCE = new PaymentSectionsQuery$PaymentSection$Companion$invoke$1$paymentTypes$1();

    PaymentSectionsQuery$PaymentSection$Companion$invoke$1$paymentTypes$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.PaymentSectionsQuery$PaymentSection$Companion$invoke$1$paymentTypes$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PaymentSectionsQuery.PaymentType> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PaymentSectionsQuery.PaymentType invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PaymentSectionsQuery.PaymentType.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PaymentSectionsQuery.PaymentType invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PaymentSectionsQuery.PaymentType) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
