package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaymentSectionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentSectionsQuery$Data$Companion$invoke$1$paymentSections$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PaymentSectionsQuery.PaymentSection> {
    public static final PaymentSectionsQuery$Data$Companion$invoke$1$paymentSections$1 INSTANCE = new PaymentSectionsQuery$Data$Companion$invoke$1$paymentSections$1();

    PaymentSectionsQuery$Data$Companion$invoke$1$paymentSections$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.PaymentSectionsQuery$Data$Companion$invoke$1$paymentSections$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PaymentSectionsQuery.PaymentSection> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PaymentSectionsQuery.PaymentSection invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PaymentSectionsQuery.PaymentSection.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PaymentSectionsQuery.PaymentSection invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PaymentSectionsQuery.PaymentSection) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
